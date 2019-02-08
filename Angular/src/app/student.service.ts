import { Injectable } from '@angular/core';

import { Observable, of } from 'rxjs';
import { Student } from './student';
import { MessageService } from './message.service';
import { MockStudent } from './mock-student';

@Injectable({
  providedIn: 'root'
})
export class StudentService {

  constructor(
    private messageService: MessageService,
    private mockStudents: MockStudent
    )
    { }
  getStudents(): Observable<Student[]>{
    this.messageService.add('StudentService: feched students');
    return of (this.mockStudents.STUDENTS)
  }

}
