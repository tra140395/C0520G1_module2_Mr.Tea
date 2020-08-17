create database Xac_dinh_khoa;
use Xac_dinh_khoa;

create table customers(
ma_Kh int primary key,
ten_Kh varchar(50) not null,
address varchar(50) not null,
email varchar(50) not null,
sdt varchar(10) not null
);

create table accounts(
ma_Tk int primary key,
kieu_Tk varchar(20) not null,
ngay_Mo_Tk date not null,
so_Du float not null,
ma_Kh int not null,
foreign key(ma_KH) references customers(ma_Kh)
);

create table transactions(
ma_Gd int primary key,
so_Tien float not null,
thoi_Gian date not null,
mo_Ta varchar(50) not null,
ma_Tk int not null,
foreign key(ma_Tk) references accounts(ma_Tk)
);
