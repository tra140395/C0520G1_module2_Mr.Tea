import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DogPetComponent } from './dog-pet.component';

describe('DogPetComponent', () => {
  let component: DogPetComponent;
  let fixture: ComponentFixture<DogPetComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DogPetComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DogPetComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
