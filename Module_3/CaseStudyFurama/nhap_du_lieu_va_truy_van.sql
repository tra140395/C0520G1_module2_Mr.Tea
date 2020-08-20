use case_study_furama;
/*1.nhap du lieu cho cac bang*/
insert into loai_khach values 
  (1,'Diamond'),
  (2,'Platinium'),
  (3,'Gold'),
  (4,'Silver'),
  (5,'Member');
select *
  from loai_khach;

insert into khach_hang values
  (1,'Thanh','1995-06-16','123241232','0934093403','abc@gmail.com','Quang tri',2),
  (2,'Hoang','1993-01-26','123241221','0908123212','hoangzz@gmail.com','Quang nam',3),
  (3,'Hue','2000-12-03','463445435','0352334556','huehoa@gmail.com','TP.HCM',1);
select *
  from khach_hang;
  
insert into vi_tri values
  (1,'Le tan'),
  (2,'Phuc vu'),
  (3,'Chuyen vien'),
  (4,'Giams sat'),
  (5,'Quan ly'),
  (6,'Giam doc');
select *
   from vi_tri;
  
insert into trinh_do values
  (1,'Trung cap'),
  (2,'Cao dang'),
  (3,'Dai hoc'),
  (4,'Sau dai hoc');
select *
   from trinh_do;
 
insert into bo_phan values
  (1,'Sale-Marketing'),
  (2,'Hanh chinh'),
  (3,'Phuc vu'),
  (4,'Quan ly');
select *
   from bo_phan;

insert into nhan_vien values 
  (1,'Teo','1994-06-19','242341312','10000000','0452342432','teo@gmail.com','Quang tri',4,3,2),   
  (2,'Tea','1995-03-14','234324723','100000000','0352145886','teatea@gmail.com','Quang tri',6,4,1),
  (3,'Koi','1990-06-29','242334543','60000000','0989342343','koi@gmail.com','Nghe an',5,4,1);
select *
   from nhan_vien;
   
insert into kieu_thue values
  (1,'Thue theo ngay',1000000),
  (2,'Thue theo thang',10000000),
  (3,'Thue theo nam',100000000);
select *
   from kieu_thue;  
   
insert into loai_dich_vu values
  (1,'Villa'),
  (2,'House'),
  (3,'Room');
select *
   from loai_dich_vu;   
   
insert into dich_vu values
  (1,'Thue nha',120,3,5,3000000,2,2,'Done'),
  (2,'Thue villa',320,3,8,30000000,1,1,'Done'),
  (3,'Thue phong',50,1,1,300000,1,3,'Done'); 
select *
   from dich_vu;    
   
insert into hop_dong values
  (1,1,2,3,'2020-06-20','2020-08-15',5000000,40000000),
  (2,3,1,1,'2020-03-27','2020-05-18',320000,2000000),
  (3,1,3,3,'2019-11-03','2019-09-01',100000,300000);
select *
   from hop_dong; 
   
insert into dich_vu_di_kem values
  (1,'Massage',200000,1,'kha dung'),
  (2,'Karaoke',300000,1,'kha dung'),
  (3,'Thuc an',100000,2,'kha dung'),
  (4,'Nuoc uong',50000,3,'kha dung'),
  (5,'Thue xe',700000,1,'khong kha dung');
select *
   from dich_vu_di_kem;  
   
insert into hop_dong_chi_tiet values
  (1,1,2,5),
  (2,3,1,1),
  (3,2,5,1),
  (4,1,3,3);
select *
   from hop_dong_chi_tiet; 
   
/*2.Hiển thị thông tin của tất cả nhân viên có trong hệ thống có tên bắt đầu là một trong 
    các ký tự “H”, “T” hoặc “K” và có tối đa 15 ký tự */
             /*cach 1*/
select * 
  from nhan_vien 
where (ho_ten_nv like 'H%' or ho_ten_nv like 'T%' or ho_ten_nv like 'K%') and length(ho_ten_nv) <= 15;
             /*cach 2*/
select *
  from nhan_vien
where  ho_ten_nv regexp binary '^[HTK].{0,14}$';

/*3.	Hiển thị thông tin của tất cả khách hàng có độ tuổi từ 18 đến 50 tuổi và có địa chỉ ở “Đà Nẵng” hoặc “Quảng Trị” */
             /*cach 1*/
select *
  from khach_hang 
where (dia_chi_kh = 'Da nang' or dia_chi_kh = 'Quang tri') 
  and (year(now()) - year(ngay_sinh_kh) >= 18 
  and year(now()) - year(ngay_sinh_kh) <= 50);
             /*cach 2*/
 select *
  from khach_hang 
where dia_chi_kh in ('Da nang','Quang tri') 
  and (year(now()) - year(ngay_sinh_kh) between 18 and 50);
              