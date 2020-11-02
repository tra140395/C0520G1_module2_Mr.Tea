import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FontSizeComponent } from './font-size/font-size.component';
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import { DogPetComponent } from './dog-pet/dog-pet.component';
import { CalculatorComponent } from './calculator/calculator.component';
import { ColorPickerComponent } from './color-picker/color-picker.component';
import { HackerNewsComponent } from './hacker-news/hacker-news.component';
import { RatingBarComponent } from './rating-bar/rating-bar.component';
import { CreateFormComponent } from './create-form/create-form.component';
import { LoginFormComponent } from './login-form/login-form.component';

@NgModule({
  declarations: [
    AppComponent,
    FontSizeComponent,
    DogPetComponent,
    CalculatorComponent,
    ColorPickerComponent,
    HackerNewsComponent,
    RatingBarComponent,
    CreateFormComponent,
    LoginFormComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
