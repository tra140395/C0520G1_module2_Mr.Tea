drop database if exists demo;
create database demo;
use demo;

create table users (
	id int(3) not null auto_increment,
	`name` varchar(120) not null,
	email varchar(220) not null,
	country varchar(120),
	primary key(id)
);
insert into users(`name`, email, country) values
	('Minh','minh@codegym.vn','Viet Nam'),
	('Kante','kante@che.uk','Kenia');
delimiter $$
 create procedure show_all_user()
 begin
  select *
    from users;
 end; $$
 delimiter ;
 call show_all_user();
 
/*Tạo store procedure sửa thông tin user theo id*/
DELIMITER $$
create procedure edit_user(id int(3),`name` varchar(120), email varchar(220),country varchar(120))
  begin
   update users
    set
	 users.id = id,
     users.name = `name`,
     users.email = email,
     users.country =country
    where users.id = id;
  end; $$
DELIMITER ;
/* Xóa users theo id*/
DELIMITER $$
create procedure delete_users(id int)
  begin
    delete 
       from users
       where users.id = id;
  end; $$
DELIMITER ;
 
delimiter $$
 create procedure find_user_by_id(id int(3))
 begin
  select *
    from users
  where users.id = id;
 end; $$
 delimiter ; 
   
