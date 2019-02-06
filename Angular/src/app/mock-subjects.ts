import { Injectable } from '@angular/core';
import { Subject } from './subject';
import { difficulty} from './subject'
import { Observable } from 'rxjs';
@Injectable({
    providedIn: 'root'
  })
export class MockSubjects{
    SUBJECTS: Subject[] = [
    { id: 11, name: 'Algebra' , difficulty: difficulty.Easy},
    { id: 12, name: 'Calculo' , difficulty: difficulty.Easy },
    { id: 13, name: 'Fundamentos de Ingenieria' , difficulty: difficulty.RIP},
    { id: 14, name: 'Electricidad y Electronica' , difficulty: difficulty.Medium },
    { id: 15, name: 'Matematicas Discretas' , difficulty: difficulty.Hard},
    { id: 16, name: 'Historia' , difficulty: difficulty.Hard }];

     public getSubject(): Subject{
      return this.SUBJECTS[(Math.floor(Math.random() * Subject.length) + 1 )];
    }
}



