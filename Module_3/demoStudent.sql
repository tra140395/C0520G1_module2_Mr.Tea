drop database if exists student_test;
create database student_test;
 use student_test;
 
 create table student_test (
   id int primary key auto_increment,
   `name` varchar(45) not null,
   height double not null,
   age int not null,
   address varchar(45) not null
   );
   
insert into student_test(`name`,height,age,address) values 
  ("Tea",7.0,24,"viet nam"),
  ("Trang",8.0,25,"Japanese"),
  ("Ly",4,24,"Chinese")
;

select * 
  from student_test;