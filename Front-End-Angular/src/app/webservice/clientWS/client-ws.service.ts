import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Student } from '../../components/student/student';
import { Observable, of } from 'rxjs';
import { catchError, map, tap } from 'rxjs/operators';
import { Type } from '@angular/compiler';

const WS_URL = 'http://localhost:8080/wasted-time-studying/api/' // URL to webapi

enum TypeCall{ GET, POST, DELETE, UPDATE}

@Injectable({
  providedIn: 'root'
})
export class ClientWSService {

  constructor(
    private http: HttpClient
    //private messageService: MessageService
  ) { }


  getStudents(): Observable<Student[]> {
    const url = WS_URL + "students/getStudents";
    return this.http.get<Student[]>(url)
      .pipe(
        catchError(this.handleError<Student[]>(TypeCall.GET))
      );
  }
  
  getStudentById(id:number): Observable<Student>{
    const url = WS_URL + "students/getStudentsById?idStudent=" + id;
    return this.http.get<Student>(url).
      pipe(
      catchError(this.handleError<Student>(TypeCall.GET))
    );
  }

  getStudentByDni(dni:String): Observable<Student>{
    const url = WS_URL + "students/getStudentsByDni?dni=" + dni;
    return this.http.get<Student>(url).
      pipe(
      catchError(this.handleError<Student>(TypeCall.GET))
    );
  }

  postStudent(student:Student): Observable<Student>{
    const url = WS_URL + "students/createStudent";
    return this.http.post<Student>(url, student).
      pipe(
      catchError(this.handleError<Student>(TypeCall.POST))
    );
  }

  updateStudent(dni:String, student:Student): Observable<Student>{
    const url = WS_URL + "students/createStudent?dni=" + dni;
    return this.http.put<Student>(url, student).
      pipe(
      catchError(this.handleError<Student>(TypeCall.UPDATE))
    );
  }

  deleteStudent(dni:String): Observable<Student>{
    const url = WS_URL + "students/deleteStudent?dni=" + dni;
    return this.http.delete<Student>(url).
      pipe(
      catchError(this.handleError<Student>(TypeCall.DELETE))
    );
  }

  private handleError<T>(operation: TypeCall, result?: T) {
    return (error: any): Observable<T> => {

      // TODO: send the error to remote logging infrastructure
      console.error(error); // log to console instead

      // TODO: better job of transforming error for user consumption
      //this.log(`${operation} failed: ${error.message}`);

      // Let the app keep running by returning an empty result.
      return of(result as T);
    };
  }


}


