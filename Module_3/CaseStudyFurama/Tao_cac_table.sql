drop database if exists case_study_furama;

create database case_study_furama;
use case_study_furama;

create table vi_tri(
  id_vi_tri int primary key,
  ten_vi_tri varchar(45) not null
  );
  
create table trinh_do(
  id_trinh_do int primary key,
  trnh_do varchar(45) not null
  );

create table bo_phan(
  id_bo_phan int primary key,
  ten_bo_phan varchar(45) not null
  );
  
create table nhan_vien(
  id_nv int primary key,
  ho_ten_nv varchar(45) not null,
  ngay_sinh_nv date not null,
  cmnd_nv varchar(45) not null,
  luong varchar(45) not null,
  sdt_nv varchar(45) not null,
  mail_nv varchar(45) not null,
  dia_chi_nv varchar(45) not null,
  id_vi_tri int not null,
  id_trinh_do int not null,
  id_bo_phan int not null,
  foreign key(id_vi_tri) references vi_tri(id_vi_tri),
  foreign key(id_trinh_do) references trinh_do(id_trinh_do),
  foreign key(id_bo_phan) references bo_phan(id_bo_phan)
  );
  
create table loai_khach(
  id_loai_khach int primary key,
  ten_loai_khach varchar(45) not null
  );

create table khach_hang(
  id_kh int primary key,
  ho_ten_kh varchar(45) not null,
  ngay_sinh_kh date not null,
  cmnd_kh varchar(45) not null,
  sdt_kh varchar(45) not null,
  mail_kh varchar(45) not null,
  dia_chi_kh varchar(45) not null,
  id_loai_khach int not null,
  foreign key(id_loai_khach) references loai_khach(id_loai_khach)
  );
  
create table kieu_thue(
  id_kieu_thue int primary key,
  ten_kieu_thue varchar(45) not null,
  gia int not null
  );
  
create table loai_dich_vu(
  id_loai_dv int primary key,
  ten_loai_dv varchar(45) not null
  );
  
create table dich_vu(
  id_dv int primary key,
  ten_dv varchar(45) not null,
  dien_tich float not null,
  so_tang int not null,
  so_nguoi_toi_da int not null,
  chi_phi_thue float not null,
  id_kieu_thue int not null,
  id_loai_dv int not null,
  trang_thai varchar(45) not null,
  foreign key(id_kieu_thue) references kieu_thue(id_kieu_thue),
  foreign key(id_loai_dv) references loai_dich_vu(id_loai_dv)
  );
  
create table hop_dong(
  id_hop_dong int primary key,
  id_nv int not null,
  id_kh int not null,
  id_dv int not null,
  ngay_lam_hd date not null,
  ngay_ket_thuc date not null,
  tien_dat_coc float not null,
  tong_tien float not null,
  foreign key(id_nv) references nhan_vien(id_nv),
  foreign key(id_kh) references khach_hang(id_kh),
  foreign key(id_dv) references dich_vu(id_dv)
  );
  
create table dich_vu_di_kem(
  id_dv_di_kem int primary key,
  ten_dv_di_kem varchar(45) not null,
  gia_dv_di_kem float not null,
  don_vi int not null,
  trang_thai_kha_dung varchar(45) not null
  );
  
create table hop_dong_chi_tiet(
  id_hop_dong_chi_tiet int primary key,
  id_hop_dong int not null,
  id_dv_di_kem int not null,
  so_luong int not null,
  foreign key(id_hop_dong) references hop_dong(id_hop_dong),
  foreign key(id_dv_di_kem) references dich_vu_di_kem(id_dv_di_kem)
  );

 