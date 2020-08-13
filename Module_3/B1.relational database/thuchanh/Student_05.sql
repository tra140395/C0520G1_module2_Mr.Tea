create database student_05;
drop database student_05;
use student_05;
  insert into student value 
  (1,'hung','quang nam',24),
  (2,'nam','Quang binh',25),
  (3,'tea','Quang ngai',23)
  ;
  drop table student;
  create table student(
  id int,
  `name` varchar(255),
  `address` varchar(255),
  age int
  );

select *from student;
update student set `name` = 'ABC' where id = 1;
delete from student where `address` = 'quang nam';
delete from student;