use classicmodels;

select status from orders;

/* group by*/
select status from orders
group by status;

/*group by vs count*/
select status, count(*) as 'so luong status'
from orders
group by status;

/*group by vs sum*/
select status,sum(quantityOrdered * priceEach) as amount
from orders 
inner join orderdetails on orders.ordernumber = orderdetails.ordernumber
group by status;

select orderNumber, sum(quantityOrdered * priceEach) as total
from orderdetails
group by orderNumber;

/* group by vs having*/
select year(orderDate) as year, sum(quantityOrdered * priceEach) as total
from orders 
inner join orderdetails on orders.orderNumber = orderdetails.orderNumber
where status = 'shipped'
group by year
having year > 2003;







