import { Injectable } from '@angular/core';

import { Observable, of } from 'rxjs';
import { Student } from './student';


@Injectable({
  providedIn: 'root'
})
export class StudentService {

  constructor() { }
  
  getHeroes(): Observable<Student[]> {
    //return of(student);
  }
}
