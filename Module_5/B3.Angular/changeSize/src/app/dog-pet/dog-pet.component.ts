import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-dog-pet',
  templateUrl: './dog-pet.component.html',
  styleUrls: ['./dog-pet.component.css']
})
export class DogPetComponent implements OnInit {

  petName = 'puppie';
  petImage = 'http://yourdost-blog-images.s3-ap-southeast-1.amazonaws.com/wp-content/uploads/2016/01/03165939/Dogs.jpg';
  constructor() { }

  updateName(name) {
    this.petName = name;
  }

  updateImage(image) {
    this.petImage = image;
  }

  ngOnInit(): void {
  }

}
