create database phantichvathietkeCSDL;
use phantichvathietkeCSDL;

/* tao customer - khach hang */
create table cutomers (
    customerNumber int primary key,
    customerName varchar(50) not null,
    contactLastname varchar(50) not null,
    contactFirstname varchar(50) not null,
    phone varchar(50) not null,
    addressLine1 varchar(50) not null,
    addressLine2 varchar(50),
    city varchar(50) not null,
    state varchar(50) not null,
    postalCode varchar(15) not null,
    country varchar(50) not null,
    creditLimit float,
    salesRepEpriseeNumber int not null,
    foreign key(salesRepEpriseeNumber) references employees(employeeNumber)
);

/* tao orders - hoa don*/
create table orders (
    orderNumber int primary key,
    orderDate date not null,
    requiredDate date not null,
    shippedDate date,
    statuss varchar(15) not null,
    comments text,
    quantityOdered int not null,
    pricEach float not null,
    customerNumber int not null,
    foreign key (customerNumber)
        references cutomers(customerNumber)
);

/* tao payments - thanh toan*/
create table payments (
    customerNumber int not null,
    checkNumber varchar(50) not null,
    paymentDay date not null,
    amount float not null,
    foreign key (customerNumber)
        references cutomers (customerNumber)
);

/* tao products - san pham*/
create table products (
    productCode varchar(15) primary key,
    productName varchar(70) not null,
    productScale varchar(10) not null,
    productVendor varchar(50) not null,
    productDescription text not null,
    quantityInStoke int not null,
    buyPrice float not null,
    MSRP float not null,
    productLine varchar(50) not null,
    foreign key(productLine) references productLines(productLine)
);

/* tao productorders - bang moi sinh ra do mqh (N:M) giua products va orders)*/
create table productOrders (
    productCode varchar(15) not null,
    orderNumber int not null,
    primary key (productCode , orderNumber),
    foreign key (productCode)
        references products (productCode),
    foreign key (orderNumber)
        references orders (orderNumber)
);

/* tao productlines - dong san pham*/
create table productLines(
productLine varchar(50) primary key,
textDescription text,
image varchar(50)
);

/* tao imployees - nhan vien*/
create table employees (
    employeeNumber int primary key,
    lastName varchar(50) not null,
    firstNamr varchar(50) not null,
    email varchar(100) not null,
    jobTitle varchar(50) not null,
    officeCode varchar(50) not null,
    foreign key(officeCode) references offices(officeCode)
);

/* tao offices - van phong*/
create table offices (
    officeCode varchar(10) primary key,
    city varchar(50) not null,
    phone varchar(50) not null,
    addressLine1 varchar(50) not null,
    addressLine varchar(50),
    state varchar(50),
    country varchar(50) not null,
    postalCode varchar(15) not null
);

