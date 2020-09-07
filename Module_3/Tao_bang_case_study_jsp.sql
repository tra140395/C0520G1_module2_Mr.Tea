drop database if exists case_study_jsp;
create database case_study_jsp;
use case_study_jsp;

create table position_employee (
  position_id int primary key,
  position_name varchar(50) not null
);
  
create table education_degree (
  education_degree_id int primary key,
  education_degree_name varchar(45) not null
);

create table user (
  user_name varchar(255) primary key,
  pass_word varchar(255)
);
  
drop table if exists user_role;  

create table division (
  division_id int primary key,
  division_name varchar(45) not null
);

create table employee (
  employee_id int primary key,  
  employee_name varchar(45) not null,
  employee_birthday date not null,
  employee_id_card varchar(45) not null,
  employee_salary double,
  employee_phone varchar(45),
  employee_email varchar(45),
  employee_address varchar(45),
  position_id int not null,
  education_degree_id int not null,
  division_id int not null,
  user_name varchar(255),
  foreign key(position_id) references position_employee(position_id),
  foreign key(education_degree_id) references education_degree(education_degree_id),
  foreign key(division_id) references division(division_id),
  foreign key(user_name) references user(user_name) 
);  

create table customer_type (
  customer_type_id int primary key,
  customer_type_name varchar(45)
);  

create table customer (
  customer_id int primary key,
  customer_type_id int not null,
  customer_name varchar(45),
  customer_birthday date not null,
  customer_gender bit(1) not null,
  customer_id_card varchar(45) not null,
  customer_phone varchar(45),
  customer_email varchar(45),
  customer_address varchar(45),
  foreign key(customer_type_id) references customer_type(customer_type_id)
);  

create table role (
  role_id int primary key,
  role_name varchar(25)
);

create table user_role (
  role_id int not null,
  user_name varchar(255) not null,
  constraint user_role_id primary key (role_id,user_name),
  foreign key(role_id) references role(role_id),
  foreign key(user_name) references user(user_name)
);  

create table service_type (
  service_type_id int primary key,
  service_type_name varchar(45)
);

create table rent_type (
  rent_type_id int primary key,
  rent_type_name varchar(45),
  rent_type_cost double
); 
 
create table service (
  service_id int primary key,
  service_name varchar(45) not null,
  service_area int,
  service_cost double not null,
  service_max_people int,
  rent_type_id int not null,
  service_type_id int not null,
  standard_room varchar(45),
  description_other_convenience varchar(45),
  pool_area double,
  number_of_floors int,
  foreign key(rent_type_id) references rent_type(rent_type_id),
  foreign key(service_type_id) references service_type(service_type_id)
);  

create table contract (
  contract_id int primary key,
  contract_start_date date,
  contract_end_date date,
  contract_deposit double,
  contract_total_money double,
  employee_id int not null,
  customer_id int not null,
  service_id int not null,
  foreign key(employee_id) references employee(employee_id),
  foreign key(customer_id) references customer(customer_id),
  foreign key(service_id) references service(service_id)
);  
  
create table attach_service (
   attach_service_id int primary key,
   attach_service_name varchar(45) not null,
   attach_service_cost double not null,
   attach_service_unit int not null,
   attach_service_status varchar(45)
);  

create table contract_detail (
  contract_detail_id int primary key,
  contract_id int not null,
  attach_service_id int not null,
  quantity int,
  foreign key(contract_id) references contract(contract_id),
  foreign key(attach_service_id) references attach_service(attach_service_id)
);  

select customer.customer_name, attach_service.attach_service_name
  from customer
  inner join contract on contract.customer_id = customer.customer_id
  inner join contract_detail on contract_detail.contract_id = contract.contract_id
  inner join attach_service on attach_service.attach_service_id = contract_detail.attach_service_id;
  
  
