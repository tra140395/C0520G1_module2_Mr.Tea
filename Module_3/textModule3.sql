create database product;
use product;

create table product (
  id int primary key auto_increment,
  name varchar(45) not null,
  price double not null,
  quantity int not null,
  color varchar(45) not null,
  description varchar(45) not null,
  category varchar(45) not null
);  

insert into product(name,price,quantity,color,description,category) values 
  ("iphone2",300000,2,"blue","small","phone"),
  ("iphone3",400000,1,"yellow","big","phone"),
  ("samsum",75000000,1,"black","big","television"),
  ("sony",1000000,1,"blue","smaill","phone")
;  
select * 
   from product;  