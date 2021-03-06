import { Injectable } from '@angular/core';

import { Observable, of } from 'rxjs';
import { Student } from '../components/student/student';
import { ClientWSService } from '../webservice/clientWS/client-ws.service'


@Injectable({
  providedIn: 'root'
})
export class StudentService {

  constructor(private clientWSService: ClientWSService) { }
  
  //When you send a http request he returned a Observable when transform the JSON response from WS(Web Service)
  public getStudents(): Observable<Student[]> {
    return this.clientWSService.getStudents();
  }

  public getStudentById(id : number): Observable<Student>{
    return this.clientWSService.getStudentById(id);
  }

  public deleteStudent(dni: String): void {
    this.clientWSService.deleteStudent(dni).subscribe();
  }
  
}
