import { Component, OnInit } from '@angular/core';
import { StudentService } from '../student.service';
import { MockStudent } from '../mock-student'
import { Student } from '../student';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-student',
  templateUrl: './student.component.html',
  styleUrls: ['./student.component.css']
})
export class StudentComponent implements OnInit {

  students: Student[];
  studentObs:  Observable<Student[]>;
  constructor(
    private studentService: StudentService,
    private mockStudent: MockStudent) {

  }

  getStudents():void {
    this.studentObs =  this.studentService.getStudents();
  }

  ngOnInit() {
    this.mockStudent.getStudents().subscribe((s) => {
      this.students = s;
    });

    this.getStudents();
  }


}
