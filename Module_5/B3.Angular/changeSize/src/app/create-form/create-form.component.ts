import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-create-form',
  templateUrl: './create-form.component.html',
  styleUrls: ['./create-form.component.css']
})
export class CreateFormComponent implements OnInit {
  profile = {
    username: 'Bob',
    email: 'abc@deg.com',
    facebook: 'facebook.com',
    twitter: 'twitter.com',
    website: 'example.com',
    tel: '1234-5678-90'
  };
  constructor() { }

  ngOnInit(): void {
  }
  onSubmit(profileForm) {
    console.log(profileForm);
  }

}
