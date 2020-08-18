create database quan_ly_thu_vien_1;
use quan_ly_thu_vien_1;

/* Tao bang sinh vien*/
create table sinh_vien(
  ma_sv int primary key,
  ten_sv varchar(50) not null,
  ngay_sinh date not null,
  mail varchar(50) not null,
  phone varchar(10) not null,
  address varchar(50) not null
  );
  
/* tao bang the sv */
create table the_sv(
  ma_the int primary key,
  ma_sv int not null,
  foreign key(ma_sv) references sinh_vien(ma_sv)
  );

/* tao bang nhan vien*/
create table nhan_vien(
  ma_nv int primary key,
  ten_nv varchar(50) not null,
  gioi_tinh varchar(10) not null,
  address varchar(50) not null
  );
  
/* Tao bang loai sach*/
create table loai_sach(
  ma_loai_sach int primary key,
  ten_loai_sach varchar(30) not null
  );
  
/* tao bang book*/
create table book(
  ma_sach int primary key,
  ten_sach varchar(50) not null,
  nha_xuat_ban varchar(50) not null,
  tac_gia varchar(50) not null,
  nam_xuat_ban date not null,
  price float not null,
  ma_loai_sach int not null,
  foreign key(ma_loai_sach) references loai_sach(ma_loai_sach)
  );
  
/* tao bang phieu muon sinh ra tu mqh n:m cua the_sv va book */
create table phieu_muon(
  ma_the int not null,
  ma_sach int not null,
  ngay_muon date not null,
  ngay_tra date not null,
  ma_nv int not null,
  constraint phieu_muon_pk primary key(ma_the,ma_nv,ngay_muon),
  foreign key(ma_the) references the_sv(ma_the),
  foreign key(ma_sach) references book(ma_sach),
  foreign key(ma_nv) references nhan_vien(ma_nv)
  );
  
/* nhap du lieu cho bang sinh vien*/
insert into sinh_vien values
   (1,'Tea','1995-03-14','abc@gmail.com','0352145886','quang tri'),
   (2,'Thui','1995-03-13','diemthuibiu@gmail.com','0972613274','quang nam'),
   (3,'Teo','1995-09-06','xys@gmail.com','0123423434','quang tri'),
   (4,'Koi','1995-06-27','aaa@gmail.com','0912234234','quang tri'),
   (5,'Ha','1995-11-08','asdasd@gmail.com','0232716382','quang binh');
select * from sinh_vien;

/*nhap du lieu cho loai sach*/
insert into loai_sach values
   (101,'khoa hoc'),
   (202,'tu nhien'),
   (303,'xa hoi'),
   (404,'am nhac'),
   (505,'bao');
select * from  loai_sach;

/* nhap thong tin cho bang nhan vien*/
insert into nhan_vien values
  (201,'Hoang','nam','Quang nam'),
  (202,'Quoc','nam','Quang binh'),
  (203,'Thanh','nam','Thanh hoa'),
  (204,'Ngan','nu','Nghe an'),
  (205,'Thu','nu','Tra vinh');
select * from nhan_vien;
  
  
  
  
  
  
  
  