use classicmodels;

select customers.customerNumber, customerName, phone, paymentDate, amount 
from customers 
     inner join payments on payments.customerNumber = customers.customerNumber
where city = 'Las vegas';

select customers.customerNumber, customers.customerName, orders.orderNumber, orders.status
from customers
     left join orders on customers.customerNumber = customers.customerNumber;
     
select customers.customerNumber, customers.customerName, orders.orderNumber, orders.status
from customers
     left join orders on customers.customerNumber = orders.customerNumber
where orderNumber is null;
