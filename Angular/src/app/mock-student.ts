import { Injectable } from '@angular/core';
import { Student } from './student'
import { MockSubjects } from './mock-subjects';

@Injectable({
  providedIn: 'root'
})
export class MockStudent {
  constructor(private mockSubjects: MockSubjects) { }
  lengSubject = this.mockSubjects.SUBJECTS.length;
  STUDENT: Student[] = [
    { id: 11, name: 'Puto', subjects: [this.mockSubjects.getSubject()] },
    { id: 12, name: 'Putito', subjects: [this.mockSubjects.getSubject(), this.mockSubjects.getSubject()], },
    { id: 13, name: 'Putin', subjects: [this.mockSubjects.getSubject()] },
    { id: 14, name: 'Putaso', subjects: [this.mockSubjects.getSubject(), this.mockSubjects.getSubject(), this.mockSubjects.getSubject()] },
    { id: 15, name: 'Bananero', subjects: [this.mockSubjects.getSubject()] },
    { id: 16, name: 'Trolaso', subjects: [this.mockSubjects.getSubject(), this.mockSubjects.getSubject()] },
    { id: 17, name: 'Franco', subjects: [this.mockSubjects.getSubject()] },
  ];

  public getStudents(): Student[] {
    return this.STUDENT;
  }


}

