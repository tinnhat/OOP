
--1.Cho biết tất cả các sách của thư viện

SELECT * FROM dbo.SACH
--2.Cho biết các sách có loại sách là lý thuyết
SELECT * FROM dbo.SACH AS s,dbo.LOAISACH AS ls WHERE s.MaLoaiSach=ls.MaLoaiSach AND ls.LoaiSach='ly thuyet'
--3.sắp xếp sách theo số lượng tăng dần

--4.cho biết các cuốn sách đã được trả trước ngày 20 tháng 11
SELECT * FROM dbo.TRASACH WHERE NgayTra BETWEEN '2021/11/10' AND '2021/11/21'
--5.tính tổng tiền phạt của thư viện
SELECT SUM(TienNop) AS tienPhat FROM dbo.PHAT
--6.cho biết các sách xuất bản từ lần thứ 2 
SELECT * FROM dbo.SACH WHERE LanXB>=2
--7.cho biết các cuốn sách chưa được xử lý (báo cáo sách)
SELECT * FROM dbo.MUONSACH AS m,dbo.DOCGIA AS d GROUP BY d.MSDG
--8.cho biết nhân viên 01 chịu trách nhiệm cho phiếu mượn sách nào
SELECT ms.SoPhieuMuon FROM dbo.NHANVIEN AS nv,dbo.MUONSACH AS ms WHERE nv.MSNV=ms.MSNV AND nv.MSNV='NV01'
--9.liệt kê nhà xuất bản và tác giả của từng cuốn sách
SELECT TenSach,TenNXB,TenTG FROM dbo.NXB JOIN dbo.SACH ON SACH.MaNXB = NXB.MaNXB JOIN dbo.TACGIA ON TACGIA.MaTG = SACH.MaTG
--10.cho biết độc giả đầu tiên bị phạt 
SELECT TOP(1) dbo.DOCGIA.HoTen FROM dbo.PHAT,dbo.DOCGIA WHERE dbo.PHAT.MSDG=dbo.DOCGIA.MSDG

-- Le Dang Khoa 
--11/ Liệt kê sách theo loại sách
SELECT B.LoaiSach,A.TenSach FROM dbo.SACH A ,LOAISACH B WHERE A.MaLoaiSach=B.MaLoaiSach GROUP BY B.LoaiSach,A.TenSach
--12/ Tìm độc giả có trong tên có chữ "THỊ"
Select * from dbo.DOCGIA A WHERE A.HoTen Like '%Thi%'
--13/Liệt kê  các độc giả mượn sách hơn 1 lần
SELECT MSDG from MUONSACH group by MSDG having COUNT(MSDG) > 1
-- 14/ Liệt kê TOP 2 tên sách được độc giả mượn nhiều nhất 
Select TenSach FROM SACH WHERE MSSACH IN (SELECT TOP 2 MSSSACH FROM CHITIETPHIEUMUON)
-- 15/ Tháng nào trong năm 2021 được độc giả mượn nhiều nhất 
SELECT MONTH(NgayMuon) FROM MUONSACH WHERE YEAR(NgayMuon) = '2021' 
GROUP BY MONTH(NgayMuon) HAVING COUNT(MSDG) >= (SELECT TOP 1 COUNT(MSDG) FROM MUONSACH WHERE YEAR(NgayMuon) = '2021' GROUP BY MONTH(NgayMuon))
-- 16/ Liệt kê sách có số lượng 10 tới 20 và được mượn
SELECT	* FROM SACH WHERE SoLuong BETWEEN 10 AND 20 AND MSSACH IN ( SELECT MSSSACH FROM CHITIETPHIEUMUON) 
--17/ Liệt kê những độc giả chưa bao giờ mượn sách 
SELECT * FROM DOCGIA WHERE MSDG NOT IN ( SELECT MSDG FROM MUONSACH)
--18/ Liệt kê tổng số sách của từng nxb
SELECT NXB.MaNXB,COUNT(*) FROM SACH ,NXB WHERE SACH.MaNXB = NXB.MaNXB  Group By NXB.MaNXB
--19/ Liệt kê những độc giả mượn sách trong năm 2021 và nhóm theo tháng 
SELECT Month(A.NgayMuon),B.HoTen, Count(A.MSDG) FROM MUONSACH A , DOCGIA B WHERE A.MSDG = B.MSDG AND YEAR(A.NgayMuon) = '2021'
Group By Month(A.NgayMuon),B.HoTen
--20/ Liệt kê in hoa tên sách của những quyển sách đã mượn và được trả
Select UPPER(TenSach) from TraSach A, MuonSach B,SACH C where A.SoPhieuMuon = B.SoPhieuMuon AND A.MSSACH = C.MSSACH


