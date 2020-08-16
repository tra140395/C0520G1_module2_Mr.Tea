/* Creater Primary key*/
use contacts;
create table nhanvien (
    nhanvien_id int auto_increment primary key,
    name varchar(255) not null,
    password varchar(50) not null,
    email varchar(50) not null
);

create table roles (
    role_id int auto_increment,
    role_name varchar(50),
    primary key (role_id)
);

create table nhanvienroles (
    nhanvien_id int not null,
    role_id int not null,
    primary key (nhanvien_id , role_id),
    foreign key (nhanvien_id)
        references nhanvien (nhanvien_id),
    foreign key (role_id)
        references roles (role_id)
);