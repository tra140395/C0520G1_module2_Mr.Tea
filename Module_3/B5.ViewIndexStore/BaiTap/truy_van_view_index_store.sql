create database View_Index_Store;
use View_Index_Store;

create table products(
  id int primary key,
  product_code varchar(10) not null,
  product_name varchar(50) not null,
  product_price varchar(50) not null,
  product_amount varchar(50) not null,
  product_description varchar(50) not null,
  product_status varchar(50) not null
  );
/* nhap du lieu */ 
insert into products values
  (1,'SP1','Keo','15k','5','Ngot','Done'),
  (2,'SP2','Ban chai','10k','3','Mau trang','Done'),
  (3,'SP3','Dep','30k','2','Hang China','Done'),
  (4,'SP4','Ly coc','20k','6','Thuy tinh','Waiting'),
  (5,'SP5','Giuong','1000000','1','Go lim','Done');
select *
   from products; 
   
/* Tao unique index tren products */
create unique index index_product_code on products(product_code);
/* Tao unique index voi 2 cot product_name va product_price */
create unique index composite  on products(product_name,product_price);
/* Sử dụng câu lệnh EXPLAIN để biết được câu lệnh SQL của bạn thực thi như nào*/
explain select * from products;

/*Tạo view lấy về các thông tin: productCode, productName, productPrice, productStatus từ bảng products.*/
create view thong_tin 
  as
    select product_code,product_name,product_price,product_status
      from products;
select * from thong_tin;

/* Sua doi view*/
update thong_tin
 set product_price = '200k'
 where product_name = 'giuong';

/* xoa view*/
drop view if exists thong_tin;

/* Tạo store procedure lấy tất cả thông tin của tất cả các sản phẩm trong bảng product */   
DELIMITER $$
create procedure show_all_product()
  begin
    select * 
      from products;
  end; $$
 DELIMITER;
call show_all_product();

/*Tạo store procedure thêm một sản phẩm mới*/
DELIMITER $$
create procedure add_new_product(id int, `code` varchar(10),`name` varchar(50), price varchar(50)
      , amount varchar(50), `description` varchar(50), `status` varchar(50))
  begin
    insert into products values (id,`code`,`name`,price,amount,`description`,`status`);
  end; $$
 DELIMITER;
call add_new_product(6,'SP6','Tai nghe','300k','2','iphone','Done');
 
/*Tạo store procedure sửa thông tin sản phẩm theo id*/
DELIMITER $$
create procedure edit_product(id int, `code` varchar(10),`name` varchar(50), price varchar(50)
      , amount varchar(50), `description` varchar(50), `status` varchar(50))
  begin
   update products 
    set
	 product_code = `code`,
     product_name = `name`,
     product_price = price,
     product_amount = amount,
	 product_description = `description`,
     product_status = `status`
    where products.id = id;
  end; $$
DELIMITER;
call edit_product(3,'SP3','Dieu hoa','7000k','1','panasonic','Done');

DELIMITER $$
create procedure delete_product(id int)
  begin
    delete 
       from products
       where products.id = id;
  end; $$
DELIMITER;
call delete_product(2);
