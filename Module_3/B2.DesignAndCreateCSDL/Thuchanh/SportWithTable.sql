create database contacts;
use contacts;

/* Tao bang contacts*/
drop table if exists contacts;
CREATE TABLE contacts (
    contact_id INT(11) NOT NULL AUTO_INCREMENT,
    last_name VARCHAR(30) NOT NULL,
    first_name VARCHAR(25),
    birthday DATE,
    CONSTRAINT contacts_pk PRIMARY KEY (contact_id)
);
insert into contacts(last_name,first_name,birthday) values
  ('tra','vo','1995-03-10'),
  ('hai','tran','1995-06-10'),
  ('nam','nguyen','1995-02-11');
SELECT *FROM contacts;
drop table contacts;

/*Tao bang suppliers*/
drop table if exists suppliers;
CREATE TABLE suppliers (
    supplier_id INT(11) NOT NULL AUTO_INCREMENT,
    supplier_name VARCHAR(50) NOT NULL,
    supplier_rep VARCHAR(30) NOT NULL DEFAULT 'TBD',
    CONSTRAINT supplier_pk PRIMARY KEY (supplier_id)
);
insert into suppliers(supplier_name,supplier_rep) values
  ('Vo','tra'),
  ('tran','phuc'),
  ('nguyen','phuc')
;
insert into suppliers(supplier_name) values
  ('phan');
SELECT * FROM suppliers;
drop table suppliers;

/*Bo sug cot cho bang suppliers*/
alter table suppliers 
   add phone_number int(10) 
   not null default 0000000000
   after supplier_name;
update suppliers set phone_number = 0123456789 where supplier_name = 'vo';
update suppliers set phone_number = 0033244543 where supplier_id= 2;
update suppliers set phone_number = 0004879566 where supplier_name = 'nguyen';
update suppliers set phone_number = 1123244464 where supplier_name = 'phan';
SELECT * FROM suppliers;


