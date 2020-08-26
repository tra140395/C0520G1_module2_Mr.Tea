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
insert into khach_hang values
  (4,'Khanh','1991-05-16','123562332','0956348603','khanh@gmail.com','Da nang',1),
  (5,'Kien','1970-01-30','132412554','0904326712','kienzz@gmail.com','Phu yen',5),
  (6,'Nga','2009-12-05','46363656','0967854556','nga@gmail.com','Da nang',1);
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
  insert into nhan_vien values 
  (4,'Mai','1998-06-12','309841312','100000000','0502342321','mai@gmail.com','Quang ngai',5,3,4);
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
insert into hop_dong values
  (4,2,3,3,'2020-06-20','2020-08-19',2000000,30000000),
  (5,3,4,1,'2019-08-21','2020-06-12',520000,2300000),
  (6,2,6,3,'2019-03-11','2019-09-30',200000,600000);
insert into hop_dong values
  (7,1,5,2,'2018-03-20','2019-09-19',440000,13000000),
  (8,1,2,1,'2019-07-21','2023-11-12',540000,2500000),
  (9,3,4,2,'2018-01-11','2019-12-30',354522,654333);
insert into hop_dong values
  (10,1,4,1,'2019-03-11','2019-09-16',370000,1300000);
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
insert into hop_dong_chi_tiet values
  (5,1,2,2),
  (6,3,4,5);
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

/*3.Hiển thị thông tin của tất cả khách hàng có độ tuổi từ 18 đến 50 tuổi và có địa chỉ ở “Đà Nẵng” hoặc “Quảng Trị” */
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

/*4.Đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu lần. Kết quả hiển thị được sắp xếp
 tăng dần theo số lần đặt phòng của khách hàng. Chỉ đếm những khách hàng nào có Tên loại khách hàng là “Diamond”*/
select khach_hang.id_kh, ho_ten_kh,count(hop_dong.id_kh) as 'so_lan_dat'
   from hop_dong
   left join khach_hang on hop_dong.id_kh = khach_hang.id_kh
where 
   id_loai_khach = (select id_loai_khach
					  from loai_khach
					where ten_loai_khach = 'Diamond')
group by ho_ten_kh
order by so_lan_dat; 

/* 5.	Hiển thị IDKhachHang, HoTen, TenLoaiKhach, IDHopDong, TenDichVu, NgayLamHopDong, NgayKetThuc,
 TongTien (Với TongTien được tính theo công thức như sau: ChiPhiThue + SoLuong*Gia, với SoLuong và 
 Giá là từ bảng DichVuDiKem) cho tất cả các Khách hàng đã từng đặt phỏng. 
 (Những Khách hàng nào chưa từng đặt phòng cũng phải hiển thị ra)*/
select khach_hang.id_kh, khach_hang.ho_ten_kh,loai_khach.ten_loai_khach,hop_dong.id_hop_dong,
    hop_dong.ngay_lam_hd,dich_vu.ten_dv,hop_dong.ngay_ket_thuc,hop_dong.tong_tien
    from khach_hang 
    left join loai_khach on khach_hang.id_loai_khach = loai_khach.id_loai_khach
    left join hop_dong on khach_hang.id_kh = hop_dong.id_kh
    left join dich_vu on hop_dong.id_dv = dich_vu.id_dv;
 
 /*6.	Hiển thị IDDichVu, TenDichVu, DienTich, ChiPhiThue, TenLoaiDichVu của tất cả các loại 
 Dịch vụ chưa từng được Khách hàng thực hiện đặt từ quý 1 của năm 2019 (Quý 1 là tháng 1, 2, 3)*/
select dich_vu.id_dv,dich_vu.ten_dv,dich_vu.dien_tich,dich_vu.chi_phi_thue,loai_dich_vu.ten_loai_dv,
       hop_dong.ngay_lam_hd
    from dich_vu 
    inner join loai_dich_vu on dich_vu.id_loai_dv = loai_dich_vu.id_loai_dv
    inner join hop_dong on hop_dong.id_dv = dich_vu.id_dv
where month(hop_dong.ngay_lam_hd) not in(1,2,3)
order by id_dv;

 /*7.	Hiển thị thông tin IDDichVu, TenDichVu, DienTich, SoNguoiToiDa, ChiPhiThue, TenLoaiDichVu 
 của tất cả các loại dịch vụ đã từng được Khách hàng đặt phòng trong năm 2018 nhưng chưa từng được 
 Khách hàng đặt phòng  trong năm 2019*/
select dich_vu.id_dv,ten_dv,dien_tich,so_nguoi_toi_da,chi_phi_thue,loai_dich_vu.ten_loai_dv,
  hop_dong.ngay_lam_hd
	from dich_vu
    inner join loai_dich_vu on dich_vu.id_loai_dv = loai_dich_vu.id_loai_dv
    inner join hop_dong on hop_dong.id_dv = dich_vu.id_dv
where year(ngay_lam_hd) = 2018 and dich_vu.id_dv not in (
      select id_dv
          from hop_dong 
	  where year(ngay_lam_hd) = 2019);

      
  /*8. Hiển thị thông tin HoTenKhachHang có trong hệ thống, với yêu cầu HoThenKhachHang không trùng nhau*/
       /* cach 1 */
select ho_ten_kh
   from khach_hang
   group by ho_ten_kh;
       /* cach 2 */
select distinct ho_ten_kh
   from khach_hang;
       /*cach 3*/
select ho_ten_kh
   from khach_hang
union
select ho_ten_kh
   from khach_hang;
  /*9.	Thực hiện thống kê doanh thu theo tháng, nghĩa là tương ứng với mỗi tháng trong năm 2019 
 thì sẽ có bao nhiêu khách hàng thực hiện đặt phòng.*/
select ngay_lam_hd, count(id_kh) as 'so luong khach '
   from hop_dong
where year(ngay_lam_hd) = 2019
group by month(ngay_lam_hd)
order by month(ngay_lam_hd);

 /* 10.	Hiển thị thông tin tương ứng với từng Hợp đồng thì đã sử dụng bao nhiêu Dịch vụ đi kèm. 
 Kết quả hiển thị bao gồm IDHopDong, NgayLamHopDong, NgayKetthuc, TienDatCoc, 
 SoLuongDichVuDiKem (được tính dựa trên việc count các IDHopDongChiTiet */
select hop_dong.id_hop_dong, ngay_lam_hd, ngay_ket_thuc,tien_dat_coc,sum(hop_dong_chi_tiet.so_luong)
 as 'so_luong_dich_vu_di_kem'
   from hop_dong
   inner join hop_dong_chi_tiet on hop_dong.id_hop_dong = hop_dong_chi_tiet.id_hop_dong
   group by id_hop_dong
   order by id_hop_dong;
   
 /* 11.	Hiển thị thông tin các Dịch vụ đi kèm đã được sử dụng bởi những Khách hàng có 
 TenLoaiKhachHang là “Diamond” và có địa chỉ là “Vinh” hoặc “Quảng Ngãi”. */
select dich_vu_di_kem.id_dv_di_kem,ten_dv_di_kem,gia_dv_di_kem,ten_loai_khach,dia_chi_kh
   from dich_vu_di_kem
   inner join hop_dong_chi_tiet on hop_dong_chi_tiet.id_dv_di_kem = dich_vu_di_kem.id_dv_di_kem
   inner join hop_dong on hop_dong.id_hop_dong = hop_dong_chi_tiet.id_hop_dong
   inner join khach_hang on hop_dong.id_kh = khach_hang.id_kh
   inner join loai_khach on khach_hang.id_loai_khach = loai_khach.id_loai_khach
where ten_loai_khach = 'Diamond' and khach_hang.dia_chi_kh in('Vinh','Quang ngai');

 /* 12.	Hiển thị thông tin IDHopDong, TenNhanVien, TenKhachHang, SoDienThoaiKhachHang, TenDichVu,
 SoLuongDichVuDikem (được tính dựa trên tổng Hợp đồng chi tiết), TienDatCoc của tất cả các dịch vụ 
 đã từng được khách hàng đặt vào 3 tháng cuối năm 2019 nhưng chưa từng được khách hàng đặt vào 6 
 tháng đầu năm 2019.*/
select hop_dong.id_hop_dong,nhan_vien.ho_ten_nv,khach_hang.ho_ten_kh,sdt_kh,dich_vu.ten_dv,
  sum(hop_dong_chi_tiet.so_luong) as 'so_luong_dich_vu_di_kem',hop_dong.tien_dat_coc
    from hop_dong
    inner join nhan_vien on hop_dong.id_nv = nhan_vien.id_nv
    inner join khach_hang on hop_dong.id_kh = khach_hang.id_kh
    inner join dich_vu on hop_dong.id_dv = dich_vu.id_dv
    inner join hop_dong_chi_tiet on hop_dong_chi_tiet.id_hop_dong  = hop_dong.id_hop_dong
where year(hop_dong.ngay_lam_hd) = 2019 
		and month(hop_dong.ngay_lam_hd) in(10,11,12)
        and hop_dong.id_dv not in(
            select hop_dong.id_dv
               from hop_dong
               inner join dich_vu on hop_dong.id_dv = dich_vu.id_dv
			where year(hop_dong.ngay_lam_hd) = 2019
				  and month(ngay_lam_hd) in(1,2,3,4,5,6));
      
 /* 13.	Hiển thị thông tin các Dịch vụ đi kèm được sử dụng nhiều nhất bởi các Khách hàng đã đặt phòng.
 (Lưu ý là có thể có nhiều dịch vụ có số lần sử dụng nhiều như nhau).*/
select dich_vu_di_kem.id_dv_di_kem,ten_dv_di_kem,gia_dv_di_kem,don_vi,trang_thai_kha_dung,
 count(hop_dong_chi_tiet.id_dv_di_kem) as 'so_lan_su_dung'
   from hop_dong_chi_tiet 
   inner join dich_vu_di_kem on hop_dong_chi_tiet.id_dv_di_kem = dich_vu_di_kem.id_dv_di_kem
   group by hop_dong_chi_tiet.id_dv_di_kem;


 /* 14.	Hiển thị thông tin tất cả các Dịch vụ đi kèm chỉ mới được sử dụng một lần duy nhất. Thông tin 
 hiển thị bao gồm IDHopDong, TenLoaiDichVu, TenDichVuDiKem, SoLanSuDung. */
 select dich_vu_di_kem.id_dv_di_kem, ten_dv_di_kem,gia_dv_di_kem, count(hop_dong_chi_tiet.id_dv_di_kem)
  as 'so_lan_su_dung'
    from hop_dong_chi_tiet
    inner join dich_vu_di_kem on hop_dong_chi_tiet.id_dv_di_kem = dich_vu_di_kem.id_dv_di_kem
    group by hop_dong_chi_tiet.id_dv_di_kem
    having count(hop_dong_chi_tiet.id_dv_di_kem) = 1;
 
 /* 15.	Hiển thi thông tin của tất cả nhân viên bao gồm IDNhanVien, HoTen, TrinhDo, TenBoPhan, 
 SoDienThoai, DiaChi mới chỉ lập được tối đa 3 hợp đồng từ năm 2018 đến 2019.*/
           /* cach 1 chua loc dieu kien <= 3 */
select nhan_vien.id_nv,ho_ten_nv,trnh_do,ten_bo_phan,sdt_nv,dia_chi_nv,count(hop_dong.id_nv) 
 as'so_lan_lam_hd'
  from nhan_vien
  inner join hop_dong on hop_dong.id_nv = nhan_vien.id_nv
  inner join trinh_do on trinh_do.id_trinh_do = nhan_vien.id_trinh_do
  inner join bo_phan on bo_phan.id_bo_phan = nhan_vien.id_bo_phan
where year(ngay_lam_hd) in(2018,2019)
group by nhan_vien.id_nv;

		  /* cach 2 ok*/
create view so_luong_hd_2018_2019  as
 select *
   from hop_dong 
where year(ngay_lam_hd) in(2018,2019);

select nhan_vien.id_nv,ho_ten_nv,trnh_do,ten_bo_phan,sdt_nv,dia_chi_nv,count(*) 
 as'so_lan_lam_hd' 
   from nhan_vien
  inner join so_luong_hd_2018_2019 on so_luong_hd_2018_2019.id_nv = nhan_vien.id_nv
  inner join trinh_do on trinh_do.id_trinh_do = nhan_vien.id_trinh_do
  inner join bo_phan on bo_phan.id_bo_phan = nhan_vien.id_bo_phan
group by so_luong_hd_2018_2019.id_nv
having count(*) <= 3;

/* 16.	Xóa những Nhân viên chưa từng lập được hợp đồng nào từ năm 2017 đến năm 2019.*/
create view so_luong_hd_2017_2019 as
 select * 
   from hop_dong 
 where year(ngay_lam_hd) in(2017,2018,2019);
 
delete from nhan_vien
where nhan_vien.id_nv not in (select so_luong_hd_2017_2019.id_nv
                                  from so_luong_hd_2017_2019);
                                  
  /*17.	Cập nhật thông tin những khách hàng có TenLoaiKhachHang từ  Platinium lên Diamond, chỉ cập
nhật những khách hàng đã từng đặt phòng với tổng Tiền thanh toán trong năm 2019 là lớn hơn 10.000.000 VNĐ.*/                                

update khach_hang
  set khach_hang.id_loai_khach = 1
where khach_hang.id_loai_khach = 2 and khach_hang.id_kh in(
 select id_kh 
  from(
   select khach_hang.id_kh
	 from khach_hang
	 inner join hop_dong on hop_dong.id_kh = khach_hang.id_kh
   where year(ngay_lam_hd) = 2020
   group by khach_hang.id_kh
   having sum(tong_tien) >= 2000000) as tempble);
 
 /*19.	Cập nhật giá cho các Dịch vụ đi kèm được sử dụng trên 10 lần trong năm 2019 
 lên gấp đôi.*/
 update dich_vu_di_kem
  set gia_dv_di_kem = gia_dv_di_kem * 2
 where dich_vu_di_kem.id_dv_di_kem in (
  select id_dv_di_kem 
   from(
    select dich_vu_di_kem.id_dv_di_kem
      from hop_dong_chi_tiet
      inner join dich_vu_di_kem on hop_dong_chi_tiet.id_dv_di_kem = dich_vu_di_kem.id_dv_di_kem
      inner join hop_dong on hop_dong_chi_tiet.id_hop_dong = hop_dong.id_hop_dong
    where year(ngay_lam_hd) = 2019  
    group by hop_dong_chi_tiet.id_dv_di_kem
    having count(hop_dong_chi_tiet.id_dv_di_kem) >= 2) as teamp);
 
 /* 20.	Hiển thị thông tin của tất cả các Nhân viên và Khách hàng có trong hệ thống, thông 
 tin hiển thị bao gồm ID (IDNhanVien, IDKhachHang), HoTen, Email, SoDienThoai, NgaySinh, DiaChi */
 
 select * 
   from nhan_vien;
 select *
   from khach_hang;