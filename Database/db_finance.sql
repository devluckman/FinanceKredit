create database kredit;

use kredit;

create table adm (
	nama varchar(40) not null primary key,
	ttl date not null,
	alamat_adm varchar(50) not null,
	password varchar(15) not null,
	no_telepon varchar(20) not null
);

insert into adm values
('Laela Syifa','1994/06/02','Kp. Marga Mulya Desa Nagreg','syifaadm001','089686777832'),
('adm','1994/07/05','Kp. Marga Mulya Desa Nagreg','1234','085777971993');

create table pesanan (
	no_pesanan varchar(10) not null primary key,
	tipe_rmh varchar(50) not null,
	ukuran varchar(50) not null,
	harga int not null,
	uang_muka int not null,
	tanggal date not null,
	jangka_waktu int not null,
	angsuran int not null
);


create table biodata (
	no_pesanan varchar(10) not null,
	nama_lengkap varchar(50) not null,
	jenis_kelamin varchar(50) not null,
	jenis_kartu_identitas varchar(50) not null,
	no_identitasi varchar(50) not null,
	alamat varchar(50) not null,
	handphone varchar(50) not null,
	email varchar(50) not null,
	pekerjaan varchar(50) not null,
	primary key (no_pesanan,no_identitasi),
	foreign key (no_pesanan) references pesanan (no_pesanan)
	on update cascade on delete cascade
);





Create view vw_simulasi as
	Select 	biodata.no_pesanan, tanggal, nama_lengkap, harga, uang_muka,
			(harga - uang_muka) as hutang,
			angsuran as cicilan,
			jangka_waktu
	From	pesanan, biodata
	where   biodata.no_pesanan = pesanan.no_pesanan;
