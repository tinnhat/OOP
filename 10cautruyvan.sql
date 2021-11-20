
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