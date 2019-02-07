import { Component, OnInit } from '@angular/core';
import { StudentService } from '../student.service';
import { MockStudent } from '../mock-student'
import { Student } from '../student';

@Component({
  selector: 'app-student',
  templateUrl: './student.component.html',
  styleUrls: ['./student.component.css']
})
export class StudentComponent implements OnInit {

  students: Student[];

   constructor(
     private studentService: StudentService, 
     private mockStudent: MockStudent) 
   {
    
   }

  ngOnInit() {
    this.mockStudent.getStudents().subscribe((s) => {
      this.students = s;
    });
  }


}
