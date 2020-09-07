use case_study_jsp;

insert into position_employee values 
  (1,"Giam doc"),
  (2,"Thu ky"),
  (3,"Truong phong"),
  (4,"Quan ly"),
  (5,"Giam sat"),
  (6,"Nhan vien");
select * 
  from position_employee;  
  
insert into education_degree values
  (1,"Sau dai hoc"),
  (2,"Dai hoc"),
  (3,"Cao Dang"),
  (4,"Trung cap"),
  (5,"Pho thong"),
  (6,"Vo hoc");
select *
  from education_degree;  
  
insert into division value
  (1,'Sale-Marketing'),
  (2,'Hanh chinh'),
  (3,'Phuc vu'),
  (4,'Quan ly'),
  (5,'Lanh dao'),
  (6,'Tu phap');
  
insert into user values
  ('Marry','123Abc'),
  ('Join','asdwq12'),
  ('Michel','234adasd'),
  ('Adam','basa12'),
  ('Black','4234sad'),
  ('Noland','asdad9');
    
insert into employee values 
  (1,'Tung','1995-06-16','123sdd',500000000,'123433132','Tung@gmail.com','Viet nam',1,2,1,'Marry'),  
  (2,'Hoang','1993-04-17','12afdd',45200000,'1234324132','hoang@gmail.com','My',5,1,3,'Adam'),
  (3,'Thanh','1991-07-02','4421d',435230000,'4654655432','Thanh@gmail.com','Viet nam',6,5,1,'Join'),
  (4,'Mai','1998-11-12','rgdfg',97667400,'909879789','Mai@gmail.com','Korea',4,4,4,'Noland'),
  (5,'Kien','2000-01-22','876465',34645000,'044234323','Kien@gmail.com','China',3,1,5,'Michel'),
  (6,'Giang','1995-06-22','53423',244088000,'7688678','Giang@gmail.com','Viet nam',1,4,6,'Black');
  
insert into customer_type values
  (1,'Diamond'),
  (2,'Platinium'),
  (3,'Gold'),
  (4,'Silver'),
  (5,'Member'),
  (6,'Iron');  
  
insert into customer values
  (1,1,'Tea','1995-03-03',1,'0123','012532434','Tea@gmail.com','Viet Nam'), 
  (2,2,'Koi','1995-11-03',0,'0154','32434343','Koi@gmail.com','Korea'), 
  (3,3,'Kot','1995-07-06',0,'1231','45435244','Kot@gmail.com','japan'), 
  (4,4,'Seu','1995-09-23',1,'76754','5685682434','Seu@gmail.com','Lao'), 
  (5,5,'Ly','1995-11-22',0,'6735','65842334','Ly@gmail.com','Thailand'), 
  (6,6,'Teo','1995-01-16',1,'8676','474743534','Teo@gmail.com','American');
  
  