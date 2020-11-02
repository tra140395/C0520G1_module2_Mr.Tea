import { Component, OnInit } from '@angular/core';
import {Customer} from "./model.customer";

@Component({
  selector: 'app-customer',
  templateUrl: './customer.component.html',
  styleUrls: ['./customer.component.css']
})
export class CustomerComponent implements OnInit {
  public customers: Customer[] = [
    {idCard:'a1',name:'Toan',birthday:'20/11/1997',gender:'nam',phone:'0903213213',email:'toan@gmail.com',address:'Quang binh',customerType:'diamond'},
    {idCard:'b2',name:'Tung',birthday:'12/03/199',gender:'nam',phone:'0903423424',email:'tung@gmail.com',address:'Quang tri',customerType:'god'},
    {idCard:'c3',name:'Khoa',birthday:'03/01/1993',gender:'nu',phone:'0912334434',email:'khoa@gmail.com',address:'Tay ninh',customerType:'sliver'},
    {idCard:'d4',name:'Nguyen',birthday:'11/02/2000',gender:'nu',phone:'0986857756',email:'nguyen@gmail.com',address:'Thanh hoa',customerType:'special'},
    {idCard:'e5',name:'Dung',birthday:'09/10/1999',gender:'less',phone:'0989342153',email:'dung@gmail.com',address:'Quang tri',customerType:'gold'}
  ];
  constructor() { }

  ngOnInit(): void {
  }
  private _customer: Customer;


  get customer(): Customer {
    return this._customer;
  }

  set customer(value: Customer) {
    this._customer = value;
  }

  onClick(item: Customer) {
    console.log(item)
    this._customer = item;
  }
  onGetCustomer(value: Customer) {
    this.customers.unshift(value);
  }
}
