create database phan_tich_va_thiet_ke_CSDL;
use phan_tich_va_thiet_ke_CSDL;

/* tao customer - khach hang */
create table cutomers (
    customer_number int primary key,
    customer_name varchar(50) not null,
    contact_last_name varchar(50) not null,
    contact_first_name varchar(50) not null,
    phone varchar(50) not null,
    address_line1 varchar(50) not null,
    address_line2 varchar(50),
    city varchar(50) not null,
    state varchar(50) not null,
    postal_code varchar(15) not null,
    country varchar(50) not null,
    credit_limit float,
    sales_rep_eprisee_number int not null,
    foreign key(sales_rep_eprisee_number) references employees(employee_number)
);

/* tao orders - hoa don*/
create table orders (
    order_number int primary key,
    order_date date not null,
    required_date date not null,
    shipped_date date,
    statuss varchar(15) not null,
    comments text,
    quantity_odered int not null,
    pric_each float not null,
    customer_number int not null,
    foreign key (customer_number)
        references cutomers(customer_number)
);

/* tao payments - thanh toan*/
create table payments (
    customer_number int not null,
    check_number varchar(50) not null,
    payment_day date not null,
    amount float not null,
    foreign key (customer_number)
        references cutomers (customer_number)
);

/* tao productlines - dong san pham*/
create table product_lines(
product_line varchar(50) primary key,
text_description text,
image varchar(50)
);

create table products (
    product_code varchar(15) primary key,
    product_name varchar(70) not null,
    product_scale varchar(10) not null,
    product_vendor varchar(50) not null,
    product_description text not null,
    quantity_inStoke int not null,
    buy_price float not null,
    MSRP float not null,
    product_line varchar(50) not null,
    foreign key(product_line) references product_lines(product_line)
);

/* tao productorders - bang moi sinh ra do mqh (N:M) giua products va orders)*/
create table product_orders (
    product_code varchar(15) not null,
    order_number int not null,
    primary key (product_code , order_number),
    foreign key (product_code)
        references products (product_code),
    foreign key (order_number)
        references orders (order_number)
);

/* tao imployees - nhan vien*/
create table employees (
    employee_number int primary key,
    last_name varchar(50) not null,
    first_namr varchar(50) not null,
    email varchar(100) not null,
    job_title varchar(50) not null,
    office_code varchar(50) not null,
    foreign key(office_code) references offices(office_code)
);

/* tao offices - van phong*/
create table offices (
    office_code varchar(10) primary key,
    city varchar(50) not null,
    phone varchar(50) not null,
    address_line1 varchar(50) not null,
    address_line varchar(50),
    state varchar(50),
    country varchar(50) not null,
    postal_code varchar(15) not null
);

