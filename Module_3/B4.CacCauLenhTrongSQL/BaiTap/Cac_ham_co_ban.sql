create database cac_ham_thong_dung;
use cac_ham_thong_dung;

create table dang_ky_mon_hoc(
  id int primary key auto_increment,
  ten varchar(50) not null,
  tuoi int not null,
  khoa_hoc varchar(50) not null,
  so_tien float not null
  );
  
insert into dang_ky_mon_hoc(ten,tuoi,khoa_hoc,so_tien) values
    ('Hoang',21,'CNTT',400000),
    ('Viet',19,'DTVT',320000),
    ('Thanh',18,'KTDN',400000),
    ('Nhan',19,'CK',450000),
    ('Huong',20,'TCNH',500000),
    ('Huong',20,'TCNH',200000);
select * from dang_ky_mon_hoc;
select * from dang_ky_mon_hoc where ten = 'Huong';
select sum(so_tien) as tong_tien_cua_huong 
from dang_ky_mon_hoc
where ten = 'Huong';	

select ten
from dang_ky_mon_hoc
group by ten;


