import {Component, EventEmitter, OnInit, Output} from '@angular/core';
import {Student} from '../model.students';

@Component({
  selector: 'app-student-create',
  templateUrl: './student-create.component.html',
  styleUrls: ['./student-create.component.css']
})
export class StudentCreateComponent implements OnInit {

  // tslint:disable-next-line:no-output-on-prefix no-output-rename
  @Output('student') onCreate = new EventEmitter<Student>();

  // tslint:disable-next-line:variable-name
  private  _student: Student;
  constructor() { }

  ngOnInit(): void {
  }

  // tslint:disable-next-line:typedef
  onClick(name: string, age: number) {
    this._student = new Student(name, age);
    console.log(this._student);
    this.onCreate.emit(this._student);
  }
}
