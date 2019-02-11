import { Difficulty } from '../components/subject/subject';
import { Injectable } from '@angular/core';
import { Subject } from '../components/subject/subject';
import { Observable, of } from 'rxjs';

@Injectable({
    providedIn: 'root'
  })
export class MockSubjects{

  SUBJECTS: Subject[] = [
    { id: 11, name: 'Algebra' , difficulty: Difficulty.Easy },
    { id: 12, name: 'Calculo' , difficulty: Difficulty.Easy },
    { id: 13, name: 'Fundamentos de Ingenieria' , difficulty: Difficulty.RIP },
    { id: 14, name: 'Electricidad y Electronica' , difficulty: Difficulty.Medium },
    { id: 15, name: 'Matematicas Discretas' , difficulty: Difficulty.Hard },
    { id: 16, name: 'Historia' , difficulty: Difficulty.Hard }
  ];

  public getAllSubjects(): Observable<Subject[]> {
    return of(this.SUBJECTS);
  }

  public getRandomSubject(): Subject {
    const randomIdx = Math.floor(Math.random() * this.SUBJECTS.length);
    return this.SUBJECTS[randomIdx];
  }

}



