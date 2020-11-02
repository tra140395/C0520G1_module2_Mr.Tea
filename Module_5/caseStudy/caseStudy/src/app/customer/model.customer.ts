export class Customer {
  idCard: string;
  name: string;
  birthday: string;
  gender: string;
  phone: string;
  email: string;
  address: string;
  customerType: string;


  constructor(idCard: string, name: string, birthday: string, gender: string, phone: string, email: string, address: string, customerType: string) {
    this.idCard = idCard;
    this.name = name;
    this.birthday = birthday;
    this.gender = gender;
    this.phone = phone;
    this.email = email;
    this.address = address;
    this.customerType = customerType;
  }
}
