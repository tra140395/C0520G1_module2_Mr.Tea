import { Component } from '@angular/core';
import {Student} from './model.students';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'angular-input-output';
  public students: Student[] = [
    {name: 'Nguyen Van A', age: 22},
    {name: 'Nguyen Van B', age: 21},
    {name: 'Nguyen Van C', age: 28}
  ];

  // tslint:disable-next-line:variable-name
  private _student: Student;

  // tslint:disable-next-line:typedef
  onClick(item: Student) {
    console.log(item)
    this._student = item;
  }

  // tslint:disable-next-line:typedef
  get student(){
    return this._student;
  }

  set student(student: Student){
    this._student = student;
  }

  // tslint:disable-next-line:typedef
  onGetStudent(value: Student) {
    this.students.unshift(value);
  }
}
