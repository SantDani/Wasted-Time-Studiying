import { Component, OnInit } from '@angular/core';
import { StudentService } from '../student.service';
import { student } from '../student';


@Component({
  selector: 'app-student',
  templateUrl: './student.component.html',
  styleUrls: ['./student.component.css']
})
export class StudentComponent implements OnInit {
  Students: student[];
  constructor(private studentService: StudentService) { }

  getStudents(): void{
    this.Students = this.studentService.getStudents();
  }
  ngOnInit() {
  }

}
