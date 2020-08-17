create database XacDinhKhoa;
use XacDInhKhoa;

create table customers(
maKh int primary key,
tenKh varchar(50) not null,
address varchar(50) not null,
email varchar(50) not null,
sdt varchar(10) not null
);

create table accounts(
maTk int primary key,
kieuTk varchar(20) not null,
ngayMoTk date not null,
soDu float not null,
maKh int not null,
foreign key(maKH) references customers(maKh)
);

create table transactions(
maGd int primary key,
soTien float not null,
thoiGian date not null,
moTa varchar(50) not null,
maTk int not null,
foreign key(maTk) references accounts(maTk)
);
