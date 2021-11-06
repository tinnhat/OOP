CREATE DATABASE OOP;

CREATE TABLE NHANVIEN(
	MSNV VARCHAR(255) PRIMARY KEY NOT NULL,
	HoTenNV NVARCHAR(255),
	DiaChi NVARCHAR(255),
	NgaySinh DATE,
	GioiTinh INT,
	SDT VARCHAR(12),
	Email VARCHAR(255)
)
CREATE TABLE TRASACH(
	SoPhieuMuon VARCHAR(255) PRIMARY KEY NOT NULL,
	MSSACH VARCHAR(255),
	MSNV VARCHAR(255),
	NgayTra DATE
)
CREATE TABLE MUONSACH(
	SoPhieuMuon VARCHAR(255) PRIMARY KEY NOT NULL,
	MSDG VARCHAR(255),
	MSNV VARCHAR(255),
	NgayMuon DATE
)
CREATE TABLE CHITIETPHIEUMUON(
	SoPhieuMuon VARCHAR(255) PRIMARY KEY NOT NULL,
	MSSSACH VARCHAR(255),
	HanTra DATE
)
CREATE TABLE DOCGIA(
	MSDG VARCHAR(255) PRIMARY KEY NOT NULL,
	HoTen NVARCHAR(255),
	DiaChi NVARCHAR(255),
	NgaySinh DATE,
	GioiTinh INT,
	Email VARCHAR(255)
)
CREATE TABLE PHAT(
	MSSACH VARCHAR(255) NOT NULL,
	MSDG VARCHAR(255),
	PRIMARY KEY (MSSACH,MSDG),
	LyDoPhat NVARCHAR(255),
	TienNop FLOAT

)
CREATE TABLE BAOCAOSACH(
	MSSACH VARCHAR(255) NOT NULL,
	MSNV  VARCHAR(255),
	TinhTrang NVARCHAR(255),
	XuLy INT
)
CREATE TABLE LOAISACH(
	MaLoaiSach VARCHAR(255) PRIMARY KEY NOT NULL,
	LoaiSach VARCHAR(255)
)
CREATE TABLE SACH(
	MSSACH VARCHAR(255) PRIMARY KEY NOT NULL,
	TenSach NVARCHAR(255),
	MaTG VARCHAR(255),
	MaNXB VARCHAR(255),
	MaLoaiSach VARCHAR(255),
	NamXB DATE,
	LanXB INT,
	SoLuong INT
)
CREATE TABLE NXB(
	MaNXB VARCHAR(255) PRIMARY KEY NOT NULL,
	TenNXB NVARCHAR(255),
	DiaChiNXB NVARCHAR(255),
	ThongTinKhac NVARCHAR(255)
)
CREATE TABLE TACGIA(
	MaTG VARCHAR(255) PRIMARY KEY NOT NULL,
	TenTG NVARCHAR(255),
	GioiTinh INT,
	DiaChi NVARCHAR(255),
	SDT VARCHAR(12),
)
ALTER TABLE dbo.SACH
ADD FOREIGN KEY (MaLoaiSach) REFERENCES dbo.LOAISACH(MaLoaiSach);
ALTER TABLE dbo.SACH
ADD FOREIGN KEY (MaNXB) REFERENCES dbo.NXB(MaNXB);
ALTER TABLE dbo.SACH 
ADD FOREIGN KEY (MaTG) REFERENCES dbo.TACGIA(MaTG);
ALTER TABLE dbo.MUONSACH
ADD FOREIGN KEY (MSNV) REFERENCES dbo.NHANVIEN(MSNV);
ALTER TABLE dbo.MUONSACH
ADD FOREIGN KEY (MSDG) REFERENCES dbo.DOCGIA(MSDG);
ALTER TABLE dbo.TRASACH
ADD FOREIGN KEY (MSNV) REFERENCES dbo.NHANVIEN(MSNV);

ALTER TABLE dbo.TRASACH
ADD FOREIGN KEY (MSSACH) REFERENCES dbo.SACH(MSSACH);

ALTER TABLE dbo.PHAT
ADD FOREIGN KEY (MSSACH) REFERENCES dbo.SACH(MSSACH);

ALTER TABLE dbo.PHAT
ADD FOREIGN KEY (MSDG) REFERENCES dbo.DOCGIA(MSDG);

ALTER TABLE dbo.BAOCAOSACH
ADD FOREIGN KEY (MSSACH) REFERENCES dbo.SACH(MSSACH);

ALTER TABLE dbo.BAOCAOSACH
ADD FOREIGN KEY (MSNV) REFERENCES dbo.NHANVIEN(MSNV);


ALTER TABLE dbo.CHITIETPHIEUMUON
ADD FOREIGN KEY (MSSSACH) REFERENCES dbo.SACH(MSSACH);