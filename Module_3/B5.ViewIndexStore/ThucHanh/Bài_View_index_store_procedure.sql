/* tạo view*/
create view  customerOrder
as
	select customers.name, orders.product, orders.quantity
	from orders inner join customers on orders.customer_id = customers.id;

/* tạo view, nếu view đã tồn tại thì update */
create or replace view customerOrder
as
	select orders.product
	from orders inner join customers on orders.customer_id = customers.id;

/* Lay thong tin tu view, select tuong tu nhu table */
select * from customerOrder;

/* Update view*/
update customerOrder
set quantity = 2
where name = 'Hai';

/* Tạo thủ tục, nếu thủ tục đã tồn tại thì */
create or replace view sumQuantity
as
	select staff, sum(quantity) as `sum`
    from orders
    group by staff;
    
select * from sumQuantity;

/* Update view có query sử dụng hàm thông dụng như sum..*/
update sumQuantity
set sum = 2
where staff = 'Hai';

/* Kiem tra xem view nao cho phep update */
select table_name, is_updatable
from information_schema.views
where table_schema = 'student_05';

/* khai bao thu tuc */
DELIMITER $$
drop procedure if exists `showAllCustomer`;
create procedure showAllCustomer()
begin
	SELECT * FROM customers;
end; $$
DELIMITER ;

call showAllCustomer();

/* Tạo thu tục cho phép truyền vào hai số a và b, tính sum và trả về kết quả sum*/
DELIMITER $$
drop procedure if exists `sumNumber`;
create procedure sumNumber(in a int, in b int, out sum int)
begin
    set sum = a +b;
end; $$
DELIMITER ;

call sumNumber(2,2, @sum);
call sumNumber(4,2, @sum);

select @sum;

/* Tạo thủ tục cho phép nhận giá trị của biến truyền vào, thay đổi giá trị của biến, 
sau đó trả về biến với giá trị đã được cập nhật */
DELIMITER $$
drop procedure if exists `sumNumber`;
create procedure sumNumber(inout id int)
begin
    set id = id +1;
end; $$
DELIMITER ;

set @id = (select id from customers where name = 'Son');
select @id;
call sumNumber(@id);
select @id;


/* Luu y khi dùng out, giá trị của tham số truyền vào là null */
DELIMITER $$
drop procedure if exists `sumNumber`;
create procedure sumNumber(in a int, in b int, out sum int)

begin
    set sum = sum + a +b;
    set a = sum;
    select sum;
end; $$
DELIMITER ;

set @input1 = 2;
set @sum = 2; /*cập nhật giá trị tham số truyền vào */
call sumNumber(@input1,2, @sum);
select @input1;

/* Tạo index tên là "index_name" cho column "contactLastName" của table "customers" */
create index index_name ON customers (contactLastName);

/* Xóa index */
drop index index_name  ON customers;