import { SubjectComponent } from './components/subject/subject.component';
import { StudentComponent } from './components/student/student.component';
import {NgModule} from '@angular/core';
import {Routes, RouterModule} from '@angular/router';

const routes: Routes = [
  { path: '', redirectTo: '/subject', pathMatch: 'full' },
  { path: 'subject', component: SubjectComponent },
  { path: 'students', component: StudentComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
