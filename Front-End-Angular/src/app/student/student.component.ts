import { Component, OnInit } from '@angular/core';
import { StudentService } from '../student.service';
import { Student } from '../student';

@Component({
  selector: 'app-student',
  templateUrl: './student.component.html',
  styleUrls: ['./student.component.css']
})
export class StudentComponent implements OnInit {

  students: Student[];

   constructor(
     private studentService: StudentService,) 
   {
    
   }

  ngOnInit() {
    this.studentService.getStudents().subscribe((s) => {
      this.students = s;
    });
  }


}
