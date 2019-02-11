import { Injectable } from '@angular/core';
import { Student } from '../components/student/student'
import { MockSubjects } from './mock-subjects';
import { Observable, of } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class MockStudent {

  constructor(private mockSubjects: MockSubjects) { }

  lengSubject = this.mockSubjects.SUBJECTS.length;

  STUDENTS: Student[] = [
    { id: 11, name: 'Puto', subjects: [this.mockSubjects.getRandomSubject()] },
    { id: 12, name: 'Putito', subjects: [this.mockSubjects.getRandomSubject(), this.mockSubjects.getRandomSubject()], },
    { id: 13, name: 'Putin', subjects: [this.mockSubjects.getRandomSubject()] },
    { id: 14, name: 'Putaso', subjects: [this.mockSubjects.getRandomSubject(), this.mockSubjects.getRandomSubject(), this.mockSubjects.getRandomSubject()] },
    { id: 15, name: 'Bananero', subjects: [this.mockSubjects.getRandomSubject()] },
    { id: 16, name: 'Trolaso', subjects: [this.mockSubjects.getRandomSubject(), this.mockSubjects.getRandomSubject()] },
    { id: 17, name: 'Franco', subjects: [this.mockSubjects.getRandomSubject()] },
  ];

  //When you send a http request he returned a Observable when transform the JSON response from WS(Web Service)
  public getStudents(): Observable<Student[]> {
    return of(this.STUDENTS);
  }
}
