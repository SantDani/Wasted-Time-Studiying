import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Student } from '../student';
import { Observable, of } from 'rxjs';
import { catchError, map, tap } from 'rxjs/operators';

const WS_URL = 'http://localhost:8080/wasted-time-studying/api/' // URL to webapi

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
        catchError(this.handleError<Student[]>("GET"))
      );
  }
  
  getStudent(id:number): Observable<Student>{
    const url = WS_URL + "students/findBy?idStudent=" + id;
    return this.http.get<Student>(url).
      pipe(
      catchError(this.handleError<Student>("GET"))
    );
  }

  private handleError<T>(operation = 'operation', result?: T) {
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


