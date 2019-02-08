import { Injectable } from '@angular/core';

import { Observable, of } from 'rxjs';
import { Student } from './student';
import { ClientWSService } from './clientWS/client-ws.service'


@Injectable({
  providedIn: 'root'
})
export class StudentService {

  constructor(private clientWSService: ClientWSService) { }
  
  //When you send a http request he returned a Observable when transform the JSON response from WS(Web Service)
  public getStudents(): Observable<Student[]> {
    return this.clientWSService.getStudents();
  }
  
}
