use classicmodels;
select * from customers;
select customerName,phone,city,country from customers;
select * from customers where customerName = 'La Rochelle Gifts';
select * from customers where customerName like '%a%';
select * from customers where city in ('nantes','stavern','madrid');