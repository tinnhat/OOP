--loai sach
INSERT INTO dbo.LOAISACH(MaLoaiSach,LoaiSach)VALUES('LT01','ly thuyet')
INSERT INTO dbo.LOAISACH(MaLoaiSach,LoaiSach)VALUES('NC01','nang cao')
INSERT INTO dbo.LOAISACH(MaLoaiSach,LoaiSach)VALUES('TC01','tu chon')
INSERT INTO dbo.LOAISACH(MaLoaiSach,LoaiSach)VALUES('GT01','giao trinh')
INSERT INTO dbo.LOAISACH(MaLoaiSach,LoaiSach)VALUES('TK01','tham khao')


--nha xuat ban
INSERT INTO dbo.NXB(MaNXB,TenNXB,DiaChiNXB,ThongTinKhac)VALUES('KD01',N'Kim Dong',N'248 Cong Quynh',N'')
INSERT INTO dbo.NXB(MaNXB,TenNXB,DiaChiNXB,ThongTinKhac)VALUES('HN01',N'Ha Noi',N'4 Tong Duy Tan,Hang Bong,Ha Noi',N'')
INSERT INTO dbo.NXB(MaNXB,TenNXB,DiaChiNXB,ThongTinKhac)VALUES('TR01',N'Nha xuat ban Tre',N'161B Ly Chinh Thang,P7,Q3',N'Tam ngung')
INSERT INTO dbo.NXB(MaNXB,TenNXB,DiaChiNXB,ThongTinKhac)VALUES('HCM01',N'Nha xuat ban tong hop HCM',N'62 Nguyen Thi Minh Khai,Da Kao,Q1',N'')
INSERT INTO dbo.NXB(MaNXB,TenNXB,DiaChiNXB,ThongTinKhac)VALUES('CT01',N'Chinh Tri',N'86 pho Duy Tan,quan Cau Giay,Ha Noi',N'')
INSERT INTO dbo.NXB(MaNXB,TenNXB,DiaChiNXB,ThongTinKhac)VALUES('PN01',N'Nha xuat ban Phu Nu',N'39 Hang Chuoi Pham Dinh Ho,Hai Ba Trung, Ha Noi',N'')
-- tac giac
INSERT INTO dbo.TACGIA( MaTG, TenTG, GioiTinh,DiaChi, SDT)VALUES('TG01',N'Nguyen Nhat Tin', 1, N'Bien Hoa Dong Nai','0834667431')
INSERT INTO dbo.TACGIA( MaTG, TenTG, GioiTinh,DiaChi, SDT)VALUES('TG02',N'Le Dang Khoa', 0, N'Dong Nai','083663123')
INSERT INTO dbo.TACGIA( MaTG, TenTG, GioiTinh,DiaChi, SDT)VALUES('TG03',N'Nguyen Thanh Dong', 0, N'Ho Chi Minh','092187123')
--sach
INSERT INTO dbo.SACH(MSSACH,TenSach,MaTG,MaNXB,MaLoaiSach,NamXB,LanXB,SoLuong)VALUES('TA01',N'Tieng anh 12','TG01','KD01','LT01',GETDATE(),3,20)
INSERT INTO dbo.SACH(MSSACH,TenSach,MaTG,MaNXB,MaLoaiSach,NamXB,LanXB,SoLuong)VALUES('TA02',N'Tieng anh 12 tap 2','TG01','KD01','LT01',GETDATE(),4,30)
INSERT INTO dbo.SACH(MSSACH,TenSach,MaTG,MaNXB,MaLoaiSach,NamXB,LanXB,SoLuong)VALUES('TRR1',N'Toan roi rac','TG02','HCM01','GT01',GETDATE(),5,10)
INSERT INTO dbo.SACH(MSSACH,TenSach,MaTG,MaNXB,MaLoaiSach,NamXB,LanXB,SoLuong)VALUES('LT01',N'Lap trinh C','TG03','KD01','NC01',GETDATE(),2,15)
INSERT INTO dbo.SACH(MSSACH,TenSach,MaTG,MaNXB,MaLoaiSach,NamXB,LanXB,SoLuong)VALUES('JS01',N'Javascript co ban','TG02','KD01','TK01',GETDATE(),2,10)
INSERT INTO dbo.SACH(MSSACH,TenSach,MaTG,MaNXB,MaLoaiSach,NamXB,LanXB,SoLuong)VALUES('WEB1',N'HTML/CSS co ban','TG02','KD01','TK01',GETDATE(),1,40)
INSERT INTO dbo.SACH(MSSACH,TenSach,MaTG,MaNXB,MaLoaiSach,NamXB,LanXB,SoLuong)VALUES('TA03',N'Toeic 500-600','TG03','KD01','GT01',GETDATE(),1,10)
INSERT INTO dbo.SACH(MSSACH,TenSach,MaTG,MaNXB,MaLoaiSach,NamXB,LanXB,SoLuong)VALUES('TR01',N'Truyen Doremon','TG02','KD01','TC01',GETDATE(),1,8)
--doc gia
INSERT INTO dbo.DOCGIA(MSDG,HoTen,DiaChi,NgaySinh,GioiTinh,Email)VALUES('DG01',N'Nguyen Van A',N'Ho Chi Minh',GETDATE(),1,'vanA@gmail.com')
INSERT INTO dbo.DOCGIA(MSDG,HoTen,DiaChi,NgaySinh,GioiTinh,Email)VALUES('DG02',N'Nguyen Van T',N'Dong Nai',GETDATE(),1,'userT@gmail.com')
INSERT INTO dbo.DOCGIA(MSDG,HoTen,DiaChi,NgaySinh,GioiTinh,Email)VALUES('DG03',N'Nguyen Thi K',N'Vung Tau',GETDATE(),0,'thiK@gmail.com')
INSERT INTO dbo.DOCGIA(MSDG,HoTen,DiaChi,NgaySinh,GioiTinh,Email)VALUES('DG04',N'Nguyen Thi D',N'Ha Noi',GETDATE(),0,'thiD@gmail.com')
INSERT INTO dbo.DOCGIA(MSDG,HoTen,DiaChi,NgaySinh,GioiTinh,Email)VALUES('DG05',N'Nguyen Van B',N'Ho Chi Minh',GETDATE(),1,'userB@gmail.com')
--nhan vien
INSERT INTO dbo.NHANVIEN(MSNV,HoTenNV,DiaChi,NgaySinh,GioiTinh,SDT,Email)VALUES('NV01',N'Nguyen Tin Nhat',N'Dong Nai',GETDATE(), 1,'0834667431','tinnhat0412@gmail.com')
INSERT INTO dbo.NHANVIEN(MSNV,HoTenNV,DiaChi,NgaySinh,GioiTinh,SDT,Email)VALUES('NV02',N'Nguyen Dong Thanh',N'Ho Chi Minh',GETDATE(), 0,'0834667431','dongthanh123@gmail.com')
INSERT INTO dbo.NHANVIEN(MSNV,HoTenNV,DiaChi,NgaySinh,GioiTinh,SDT,Email)VALUES('NV03',N'Le Khoa Dang',N'Dong Nai',GETDATE(), 0,'0834667431','khoale123@gmail.com')


--phat
INSERT INTO dbo.PHAT(MSSACH,MSDG,LyDoPhat,TienNop)VALUES('LT01','DG01',N'nop tre',20000.0)
INSERT INTO dbo.PHAT(MSSACH,MSDG,LyDoPhat,TienNop)VALUES('JS01','DG02',N'rach bia',50000.0)
INSERT INTO dbo.PHAT(MSSACH,MSDG,LyDoPhat,TienNop)VALUES('TR01','DG03',N'mat sach',80000.0)

--phieu muon
INSERT INTO dbo.CHITIETPHIEUMUON(SoPhieuMuon,MSSSACH,HanTra)VALUES('PM01','TA01',GETDATE())
INSERT INTO dbo.CHITIETPHIEUMUON(SoPhieuMuon,MSSSACH,HanTra)VALUES('PM01','LT01',GETDATE())
INSERT INTO dbo.CHITIETPHIEUMUON(SoPhieuMuon,MSSSACH,HanTra)VALUES('PM02','JS01',GETDATE())
INSERT INTO dbo.CHITIETPHIEUMUON(SoPhieuMuon,MSSSACH,HanTra)VALUES('PM02','JS01',GETDATE())
INSERT INTO dbo.CHITIETPHIEUMUON(SoPhieuMuon,MSSSACH,HanTra)VALUES('PM03','TA01',GETDATE())

--muon sach
INSERT INTO dbo.MUONSACH(SoPhieuMuon,MSDG,MSNV,NgayMuon)VALUES('PM01','DG01','NV02',GETDATE())
INSERT INTO dbo.MUONSACH(SoPhieuMuon,MSDG,MSNV,NgayMuon)VALUES('PM02','DG02','NV01',GETDATE())
INSERT INTO dbo.MUONSACH(SoPhieuMuon,MSDG,MSNV,NgayMuon)VALUES('PM03','DG03','NV03',GETDATE())

--tra sach
INSERT INTO dbo.TRASACH(SoPhieuMuon,MSSACH,MSNV,NgayTra)VALUES('PM01','TRR1','NV01',GETDATE())
INSERT INTO dbo.TRASACH(SoPhieuMuon,MSSACH,MSNV,NgayTra)VALUES('PM01','JS01','NV01',GETDATE())
INSERT INTO dbo.TRASACH(SoPhieuMuon,MSSACH,MSNV,NgayTra)VALUES('PM02','TR01','NV02',GETDATE())
INSERT INTO dbo.TRASACH(SoPhieuMuon,MSSACH,MSNV,NgayTra)VALUES('PM03','LT01','NV02',GETDATE())
INSERT INTO dbo.TRASACH(SoPhieuMuon,MSSACH,MSNV,NgayTra)VALUES('PM03','TA02','NV03',GETDATE())

--bao cao sach
INSERT INTO dbo.BAOCAOSACH(MSSACH,MSNV,TinhTrang,XuLy)VALUES('TA01', 'NV02', N'sach bi thieu bia', 0)
INSERT INTO dbo.BAOCAOSACH(MSSACH,MSNV,TinhTrang,XuLy)VALUES('WEB1', 'NV01', N'sach bi rach', 1)
INSERT INTO dbo.BAOCAOSACH(MSSACH,MSNV,TinhTrang,XuLy)VALUES('TA02', 'NV03', N'sach bi rach', 0)
INSERT INTO dbo.BAOCAOSACH(MSSACH,MSNV,TinhTrang,XuLy)VALUES('TA03', 'NV03', N'sach bi uot', 1)
INSERT INTO dbo.BAOCAOSACH(MSSACH,MSNV,TinhTrang,XuLy)VALUES('TRR1', 'NV02', N'sach bi uot', 1)