import { Component, EventEmitter, Output, OnInit } from '@angular/core';
import {Customer} from "../model.customer";

@Component({
  selector: 'app-customer-create',
  templateUrl: './customer-create.component.html',
  styleUrls: ['./customer-create.component.css']
})
export class CustomerCreateComponent implements OnInit {
  @Output('customer') onCreate = new EventEmitter<Customer>();
  private _customer: Customer;
  constructor() { }

  ngOnInit(): void {
  }

  onClick(value: string, value2: string, value3: string, value4: string, value5: string, value6: string, value7: string, value8: string) {
    this._customer = new Customer(value, value2, value3, value4, value5, value6, value7, value8);
    console.log(this._customer);
    this.onCreate.emit(this._customer);
  }
}
