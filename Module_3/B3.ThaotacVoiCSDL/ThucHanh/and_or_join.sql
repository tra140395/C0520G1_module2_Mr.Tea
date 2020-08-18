use classicmodels;

select productCode, productName, buyPrice, quantityInStock from products
where buyprice > 56.76 and quantityInStock > 10;

select productCode, productName, buyPrice, textdescription 
from products
   inner join productLines on productLines.productLine = products.productLine
where buyprice > 56.76 and quantityInStock > 10;
   
select productCode, productName, buyprice, quantityInStock, productVendor, productLine 
from products
where productLine = 'Classic Cars' or productVendor = 'Min Lin Diecast';