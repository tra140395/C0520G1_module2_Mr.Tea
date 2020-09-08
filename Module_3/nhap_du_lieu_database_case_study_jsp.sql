use case_study_jsp;

insert into position_employee values 
  (1,"Giam doc"),
  (2,"Thu ky"),
  (3,"Truong phong"),
  (4,"Quan ly"),
  (5,"Giam sat"),
  (6,"Nhan vien");
  
insert into service_type values 
  (1,'phong'),
  (2,'villa'),
  (3,'room');
  
insert into customer_type values
  (1,'Diamond'),
  (2,'Platinium'),
  (3,'Gold'),
  (4,'Silver'),
  (5,'Member'),
  (6,'Iron');  
  
insert into rent_type values 
  (1,'Thue theo nam',200000), 
  (2,'Thue theo quy',300000),
  (3,'Thue theo thang',400000),
  (4,'Thue theo tuan',500000),
  (5,'Thue theo ngay',600000),
  (6,'Thue theo gio',700000);  
  
  
insert into attach_service values
  (1,'karaoke',30000,1,'kha dung'),
  (2,'massage',30000,2,'kha dung'),
  (3,'car',30000,3,'kha dung'),
  (4,'food',30000,1,'kha dung');
  
insert into role values
  (1,'quan ly nhan su'),
  (2,'gap mat khach hang'),
  (3,'tiep khach'),
  (4,'moi truong'),
  (5,'quan ly cong ty'),
  (6,'co van');
  
  insert into user values
  ('Marry','123Abc'),
  ('Join','asdwq12'),
  ('Michel','234adasd'),
  ('Adam','basa12'),
  ('Black','4234sad'),
  ('Noland','asdad9');  
  
insert into education_degree values
  (1,"Sau dai hoc"),
  (2,"Dai hoc"),
  (3,"Cao Dang"),
  (4,"Trung cap"),
  (5,"Pho thong"),
  (6,"Vo hoc");

  
insert into division value
  (1,'Sale-Marketing'),
  (2,'Hanh chinh'),
  (3,'Phuc vu'),
  (4,'Quan ly'),
  (5,'Lanh dao'),
  (6,'Tu phap');
    
insert into employee values 
  (1,'Tung','1995-06-16','123sdd',500000000,'123433132','Tung@gmail.com','Viet nam',1,2,1,'Marry'),  
  (2,'Hoang','1993-04-17','12afdd',45200000,'1234324132','hoang@gmail.com','My',5,1,3,'Adam'),
  (3,'Thanh','1991-07-02','4421d',435230000,'4654655432','Thanh@gmail.com','Viet nam',6,5,1,'Join'),
  (4,'Mai','1998-11-12','rgdfg',97667400,'909879789','Mai@gmail.com','Korea',4,4,4,'Noland'),
  (5,'Kien','2000-01-22','876465',34645000,'044234323','Kien@gmail.com','China',3,1,5,'Michel'),
  (6,'Giang','1995-06-22','53423',244088000,'7688678','Giang@gmail.com','Viet nam',1,4,6,'Black');

  
insert into customer values
  ("KH-0001",1,'Tea','1995-03-03',1,'0123','012532434','Tea@gmail.com','Viet Nam'), 
  ("KH-0002",2,'Koi','1995-11-03',0,'0154','32434343','Koi@gmail.com','Korea'), 
  ("KH-0003",3,'Kot','1995-07-06',0,'1231','45435244','Kot@gmail.com','japan'), 
  ("KH-0004",4,'Seu','1995-09-23',1,'76754','5685682434','Seu@gmail.com','Lao'), 
  ("KH-0005",5,'Ly','1995-11-22',0,'6735','65842334','Ly@gmail.com','Thailand'), 
  ("KH-0006",6,'Teo','1995-01-16',1,'8676','474743534','Teo@gmail.com','American');

insert into service values
  ("DV-0001",'asds',35,200000,4,6,3,'Rong rai','thong thoang',0,1),
  ("DV-0002",'fsdf',40,700000,6,3,3,'sach se','thue cho ban',0,2),
  ("DV-0003",'sdads',60,800000,4,2,3,'Dep','Giam gia',30,2),
  ("DV-0004",'wrwwe',64,200000,1,5,3,'Vua phai','thue de choi',0,1),
  ("DV-0005",'jyjtt',100,1000000,8,1,3,'cao','thue di du lich',50,3),
  ("DV-0006",'ryerr',203,2000000,5,4,3,'Nhieu tang','thue cho vui',70,3);
  
insert into contract values
  (1,'2020-06-21','2020-09-21',100000,500000,6,"KH-0001","DV-0006"), 
  (2,'2019-03-13','2020-01-11',100000,700000,2,"KH-0006","DV-0005"),
  (3,'2020-01-21','2020-09-03',200000,500000,6,"KH-0003","DV-0002"),
  (4,'2018-06-12','2019-02-17',100000,300000,3,"KH-0005","DV-0001"),
  (5,'2020-01-11','2020-03-22',200000,800000,5,"KH-0003","DV-0004"),
  (6,'2019-07-28','2019-10-12',200000,1000000,4,"KH-0004","DV-0001");
  
insert into contract_detail values
  (1,6,4,4),  
  (2,4,2,3),
  (3,3,1,2),
  (4,5,3,1),
  (5,1,3,5),
  (6,2,2,5);
  
insert into user_role values
  (1,'Join'),  
  (2,'Michel'), 
  (5,'Black'), 
  (6,'Adam'), 
  (2,'Noland'), 
  (4,'Marry');  
  