using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;


namespace DoAnOOP
{
    class Program
    {
        static List<BaoCaoSach> baoCaoSach = new List<BaoCaoSach>();
        static List<ChiTietPhieuMuon> chiTietPhieuMuon = new List<ChiTietPhieuMuon>();
        static List<DocGia> docGia = new List<DocGia>();
        static List<LoaiSach> loaiSach = new List<LoaiSach>();
        static List<MuonSach> muonSach = new List<MuonSach>();
        static List<NhanVien> nhanVien = new List<NhanVien>();
        static List<NXB> nxb = new List<NXB>();
        static List<Phat> phat = new List<Phat>();
        static List<Sach> sach = new List<Sach>();
        static List<TacGia> tacGia = new List<TacGia>();
        static List<TraSach> traSach = new List<TraSach>();

        //public static void TaoBaoCaoSach()
        //{
        //    baoCaoSach.Add(new BaoCaoSach("TA01", "NV02","sach bi thieu bia", false));
        //}
        public static void TaoLoaiSach()
        {
            loaiSach.Add(new LoaiSach("LT01", "ly thuyet"));
            loaiSach.Add(new LoaiSach("NC01", "nang cao"));
            loaiSach.Add(new LoaiSach("TC01", "tu chon"));
            loaiSach.Add(new LoaiSach("GT01", "giao trinh"));
            loaiSach.Add(new LoaiSach("TK01", "tham khao"));
        }
        public static void TaoNhaXuatBan()
        {
            nxb.Add(new NXB("KD01", "Kim Dong", "248 Cong Quynh", ""));
            nxb.Add(new NXB("HN01", "Ha Noi", "4 Tong Duy Tan,Hang Bong,Ha Noi", ""));
            nxb.Add(new NXB("TR01", "Nha xuat ban Tre", "161B Ly Chinh Thang,P7,Q3", "Tam ngung"));
            nxb.Add(new NXB("HCM01", "Nha xuat ban tong hop HCM", "62 Nguyen Thi Minh Khai,Da Kao,Q1", ""));
            nxb.Add(new NXB("CT01", "Chinh Tri", "86 pho Duy Tan,quan Cau Giay,Ha Noi", ""));
            nxb.Add(new NXB("PN01", "Nha xuat ban Phu Nu", "39 Hang Chuoi Pham Dinh Ho,Hai Ba Trung, Ha Noi", ""));

        }
        public static void TaoTacGia()
        {
            tacGia.Add(new TacGia("TG01", "Nguyen Nhat Tin", true, "Bien Hoa Dong Nai", "0834667431"));
            tacGia.Add(new TacGia("TG02", "Le Dang Khoa", false, "Dong Nai", "083663123"));
            tacGia.Add(new TacGia("TG03", "Nguyen Thanh Dong", false, "Ho Chi Minh", "092187123"));
        }
        public static void TaoSach()
        {
            sach.Add(new Sach("TA01","Tieng anh 12","2003",3,20,loaiSach[0],tacGia[0],nxb[0]));
            sach.Add(new Sach("TA02", "Tieng anh 12 tap 2", "2003", 4, 30, loaiSach[0], tacGia[0], nxb[0]));
            sach.Add(new Sach("TRR1", "Toan roi rac", "2012", 5, 10, loaiSach[3], tacGia[1], nxb[1]));
            sach.Add(new Sach("LT01", "Lap Trinh C", "2000", 2, 15, loaiSach[1], tacGia[2], nxb[0]));
            sach.Add(new Sach("JS01", "Javascript co ban", "2006", 2, 10, loaiSach[4], tacGia[1], nxb[0]));
            sach.Add(new Sach("WEB1", "HTML/CSS co ban", "2006", 1, 40, loaiSach[4], tacGia[2], nxb[2]));
            sach.Add(new Sach("TA03", "Toeic 500-600", "2020", 1, 10, loaiSach[3], tacGia[2], nxb[4]));
            sach.Add(new Sach("TR01", "Truyen Doraemon", "2021", 1, 5, loaiSach[2], tacGia[1], nxb[5]));
        }
        public static void TaoNhanVien()
        {
            nhanVien.Add(new NhanVien("NV01", "Nguyen Tin Nhat", "Dong Nai", new DateTime(2006, 12, 4), true, "0834667431", "tinnhat0412@gmail.com"));
            nhanVien.Add(new NhanVien("NV02","Nguyen Dong Thanh","Ho Chi Minh", new DateTime(2007, 9, 6), false,"0834667431","dongthanh123@gmail.com"));
            nhanVien.Add(new NhanVien("NV03", "Le Khoa Dang", "Dong Nai", new DateTime(2008, 6, 9), false, "0834667431", "khoale123@gmail.com"));

        }
        public static void TaoBaoCaoSach()
        {
            baoCaoSach.Add(new BaoCaoSach(sach[0], nhanVien[1], "sach bi thieu bia", false));
            baoCaoSach.Add(new BaoCaoSach(sach[5], nhanVien[0], "sach bi rach", true));
            baoCaoSach.Add(new BaoCaoSach(sach[1], nhanVien[2], "sach bi rach", true));
            baoCaoSach.Add(new BaoCaoSach(sach[6], nhanVien[2], "sach bi uot", false));
            baoCaoSach.Add(new BaoCaoSach(sach[2], nhanVien[1], "sach bi uot", true));
        }
        public static void TaoDocGia()
        {
            docGia.Add(new DocGia("DG01", "Nguyen Van A", "Ho Chi Minh", new DateTime(2000, 9, 6), true, "vanA@gmail.com"));
            docGia.Add(new DocGia("DG02", "Nguyen Van T", "Dong Nai", new DateTime(2002, 6, 9), true, "userT@gmail.com"));
            docGia.Add(new DocGia("DG03", "Nguyen Thi K", "Vung Tau", new DateTime(2003, 9, 6), false, "thiK@gmail.com"));
            docGia.Add(new DocGia("DG04", "Nguyen Thi D", "Ha Noi", new DateTime(2006, 6, 9), false, "thiD@gmail.com"));
            docGia.Add(new DocGia("DG05", "Nguyen Van B", "Ho Chi Minh", new DateTime(2001, 9, 6), true, "userB@gmail.com"));

        }
        public static void TaoPhat()
        {
            phat.Add(new Phat(sach[3], docGia[0], "nop tre", 20000.0));
            phat.Add(new Phat(sach[4],docGia[1], "rach bia", 50000.0));
            phat.Add(new Phat(sach[7], docGia[2], "mat sach", 80000.0));
        }
        public static void TaoChiTietPhieuMuon()
        {
            chiTietPhieuMuon.Add(new ChiTietPhieuMuon("PM01", "TA01", new DateTime(2022, 11, 11)));
            chiTietPhieuMuon.Add(new ChiTietPhieuMuon("PM01", "LT01", new DateTime(2022, 11, 11)));
            chiTietPhieuMuon.Add(new ChiTietPhieuMuon("PM02", "JS01", new DateTime(2022, 11, 11)));
            chiTietPhieuMuon.Add(new ChiTietPhieuMuon("PM02", "JS01", new DateTime(2022, 11, 11)));
            chiTietPhieuMuon.Add(new ChiTietPhieuMuon("PM03", "TA01", new DateTime(2022, 11, 11)));
        }
        public static void TaoMuonSach()
        {
            muonSach.Add(new MuonSach(chiTietPhieuMuon[0],docGia[0], nhanVien[1], new DateTime(2021, 11, 11)));
            muonSach.Add(new MuonSach(chiTietPhieuMuon[1], docGia[1], nhanVien[0], new DateTime(2021, 11, 11)));
            muonSach.Add(new MuonSach(chiTietPhieuMuon[2], docGia[2], nhanVien[2], new DateTime(2021, 1, 11)));
            muonSach.Add(new MuonSach(chiTietPhieuMuon[3], docGia[0], nhanVien[2], new DateTime(2021, 3, 12)));
        }
         public static void TaoTraSach()
        {
            traSach.Add(new TraSach(chiTietPhieuMuon[0], sach[2],nhanVien[0], new DateTime(2021, 11, 20)));
            traSach.Add(new TraSach(chiTietPhieuMuon[0], sach[4], nhanVien[0], new DateTime(2021, 11, 12)));
            traSach.Add(new TraSach(chiTietPhieuMuon[1], sach[7], nhanVien[1], new DateTime(2021, 11, 8)));
            traSach.Add(new TraSach(chiTietPhieuMuon[2], sach[3], nhanVien[1], new DateTime(2021, 11, 14)));
            traSach.Add(new TraSach(chiTietPhieuMuon[2], sach[1], nhanVien[2], new DateTime(2021, 11, 10)));
        }

        public static void cau11()
        {
            var orderGroups =
               from p in sach
               group p by p.loaiSach.TheLoai into g
               select new { loaiSach = g.Key, sach = g };
            Console.WriteLine("\n\t\t======11/ LIỆT KÊ DANH SÁCH SÁCH THEO THỂ LOẠI SÁCH =========");
            foreach (var c in orderGroups)
            {
                Console.WriteLine("LoaiSach: {0} ", c.loaiSach);
                foreach (var p in c.sach)
                {
                    Console.WriteLine("\tSach: MSSACH={0} TenSach={1} MaTG={2} SoLuong={3} ",
                        p.MSSACH, p.TenSach, p.tacGia.MaTG, p.SoLuong);
                }
            }
        }
        public static void cau12()
        {
            var results = from c in docGia
                          where c.HoTen.Contains("Thi")
                          select c;
            Console.WriteLine("\n\t\t======12/ LIỆT KÊ CÁC ĐỘC GIẢ TRONG TÊN CÓ HỌ LÀ 'THỊ'=========");
            foreach (var c in results)
            {
                Console.WriteLine("MSDG : {0}   Ho Ten : {1}  Dia Chi : {2} Email : {3} ",c.MSDG,c.HoTen,c.DiaChi,c.Email);
            }
        }
        public static void cau13()
        {
            var results = from m in muonSach
                          group m by new
                          {
                              m.MSDG
                          } into g
                          where g.Count(p => p.MSDG != null) > 1
                          select new
                          {
                              g.Key
                          };
            Console.WriteLine("\n\t\t======13/ LIỆT KÊ CÁC ĐỘC GIẢ MƯỢN SÁCH HƠN 1 LẦN =========");
            foreach (var c in results)
            {
                Console.WriteLine(c.Key.MSDG.MSDG);
            }
        }
        public static void cau14()
        {
            var results = from x in sach
                          where((from c in chiTietPhieuMuon
                                  select new
                                  {
                                      c.MSSACH
                                  }).Take(2)).Contains(new { MSSACH = x.MSSACH })
                                  select new
                                  {
                                      x.TenSach
                                  };
            Console.WriteLine("\n\t\t======14/LIỆT KÊ TOP 2 TÊN SÁCH ĐƯỢC ĐỘC GIẢ MƯỢN NHIỀU NHẤT=========");
            foreach (var c in results)
            {
                Console.WriteLine(c.TenSach);
            }
        }
        public static void cau15()
        {
            var results = from x in muonSach
                          where
                            Convert.ToString(x.ngayMuon.Year) == "2021"
                          group x by new
                          {
                              thang = (int)x.ngayMuon.Month
                          } into g
                          where g.Count(p => p.MSDG != null) >=
                              ((from x2 in muonSach
                                where
                                 Convert.ToString(x2.ngayMuon.Year) == "2021"
                                group x2 by new
                                {
                                    thang = (int)x2.ngayMuon.Month
                                } into f
                                select new
                                {
                                    thang = f.Count(p => p.MSDG != null)
                                }).Take(1).First().thang)
                          select new
                          {
                              thang = g.Key.thang
                          };
            Console.WriteLine("\n\t\t====== 15 /THÁNG NÀO TRONG NĂM 2021 ĐƯỢC ĐỘC GIẢ MƯỢN SÁCH NHIỀU NHẤT ========= ");
            foreach (var c in results)
            {
                Console.WriteLine("THANG : {0}",c.thang);
            }
        }
        public static void cau16()
        {
            var results = from x in sach
                          where
                            x.SoLuong >= 10 && x.SoLuong <= 20 &&
                              (from y in chiTietPhieuMuon
                               select new
                               {
                                   y.MSSACH
                               }).Contains(new { MSSACH = x.MSSACH })
                          select new
                          {
                              x.MSSACH,
                              TenSach = x.TenSach,
                              MaTG = x.tacGia,
                              MaNXB = x.nxb,
                              MaLoaiSach = x.loaiSach,
                              NamXB = x.NamXB,
                              LanXB = x.LanXB,
                              SoLuong = x.SoLuong
                          };
            Console.WriteLine("\n\t\t====== 16/ LIỆT KÊ SÁCH CÓ SỐ LƯỢNG 10 TỚI 20 VÀ ĐƯỢC MƯỢN  ========= ");
            foreach (var c in results)
            {
                Console.WriteLine(c);
            }
        }
        public static void cau17()
        {
            var results = from x in docGia
                          where!(from p in muonSach
                               select new
                               {
                                   p.MSDG.MSDG
                               }).Contains(new { MSDG = x.MSDG })
                          select new
                          {
                              x.MSDG,
                              HoTen = x.HoTen,
                              DiaChi = x.DiaChi,
                              NgaySinh = x.NgaySinh,
                              GioiTinh = x.GioiTinh,
                              Email = x.Email
                          };
            Console.WriteLine("\n\t\t====== 17/ LIỆT KÊ NHỮNG ĐỘC GIẢ CHƯA BAO GIỜ MƯỢN SÁCH ========= ");
            foreach (var c in results)
            {
                Console.WriteLine(c);
            }
        }
        public static void cau18()
        {
            var results = from x in sach
                          group x.nxb by new
                          {
                              x.nxb.MaNXB
                          } into g
                          select new
                          {
                              g.Key.MaNXB,
                              TongSoSach = g.Count()
                          };
            Console.WriteLine("\n\t\t====== 18/ LIỆT KÊ TỔNG SỐ SÁCH CỦA TỪNG NHÀ XUẤT BẢN SÁCH========= ");
            foreach (var c in results)
            {
                Console.WriteLine(c);
            }
        }
        public static void cau19()
        {
            var results = from A in muonSach
                          where
                            Convert.ToString(A.ngayMuon.Year) == "2021"
                          group new { A, A.MSDG.HoTen } by new
                          {
                              thang = (int)A.ngayMuon.Month,
                              A.MSDG.HoTen
                          } into g
                          select new
                          {
                              thang = g.Key.thang,
                              g.Key.HoTen,
                              sl = g.Count(p => p.A.MSDG != null)
                          };
            Console.WriteLine("\n\t\t====== 19/ LIỆT KÊ NHỮNG ĐỘC GIẢ MƯỢN SÁCH TRONG NĂM 2021 NHÓM THEO THÁNG ========= ");
            foreach (var c in results)
            {
                Console.WriteLine("THÁNG : {0} HO TEN : {1}", c.thang, c.HoTen);
            }
        }
        public static void cau20()
        {
            var results = from A in traSach
                          from B in muonSach
                          where
                            A.chitiet == B.chitiet
                          select new
                          {
                              inhoa = A.MSSach.TenSach.ToUpper()
                          };
            Console.WriteLine("\n\t\t====== \t20/ LIỆT KÊ IN HOA TÊN SÁCH CỦA NHỮNG QUYỂN SÁCH ĐÃ MƯỢN VÀ ĐƯỢC TRẢ  ========= ");
            foreach (var v in results)
            {
                Console.WriteLine(v.inhoa);
            }
        }

        static void Main(string[] args)
        {
            Console.OutputEncoding = System.Text.Encoding.UTF8;
            TaoDocGia();
            TaoNhanVien();
            TaoNhaXuatBan();
            TaoTacGia();
            TaoLoaiSach();
            TaoSach();
            TaoBaoCaoSach();
            TaoPhat();
            TaoChiTietPhieuMuon();
            TaoMuonSach();
            TaoTraSach();

            ////1.Cho biết tất cả các sách của thư viện
            //var cau1 = from k in sach select k;
            //Console.WriteLine("\t\t\t 17110239 - Nguyen Nhat Tin\n");
            //Console.WriteLine("1.Cho biet tat ca cac sach cua thu vien\n");
            //foreach (var k in cau1)
            //{
            //    Console.WriteLine("Ma so sach:" + k.MSSACH + "\tTen sach: " + k.TenSach + "\t\tMa tac gia:" + k.tacGia.MaTG + "\tMaNXB:" + k.nxb.MaNXB + "\tMa Loai Sach:" + k.loaiSach.MaLoaiSach + "\tNam Xuat ban:" + k.NamXB + " Lan xuat ban:" + k.LanXB + " So luong:" + k.SoLuong);
            //}
            //Console.WriteLine("=========================================================================================================");
            ////2.Cho biết các sách có loại sách là lý thuyết
            //Console.WriteLine("2.Cho biet cac sach co loai sach la ly thuyet\n");
            //var cau2 = from s in sach join ls in loaiSach on s.loaiSach.MaLoaiSach equals ls.MaLoaiSach where ls.TheLoai == "ly thuyet" select new { s };
            //foreach (var t in cau2)
            //{
            //    Console.WriteLine("Ma so sach:" + t.s.MSSACH + "\tTen sach: " + t.s.TenSach + "\t\tMa tac gia:" + t.s.tacGia.MaTG + "\tMaNXB:" + t.s.nxb.MaNXB + "\tMa Loai Sach:" + t.s.loaiSach.MaLoaiSach + "\tNam Xuat ban:" + t.s.NamXB + " Lan xuat ban:" + t.s.LanXB + " So luong:" + t.s.SoLuong);
            //}
            //Console.WriteLine("=========================================================================================================");
            ////3.sắp xếp sách theo số lượng tăng dần
            //Console.WriteLine("3.sap xep sach theo so luong tang dan\n");
            //var cau3 =
            //       from p in sach
            //       orderby p.SoLuong
            //       select p;
            //foreach (var k in cau3)
            //{
            //    Console.WriteLine("Ma so sach:" + k.MSSACH + "\tTen sach: " + k.TenSach + "\t\tMa tac gia:" + k.tacGia.MaTG + "\tMaNXB:" + k.nxb.MaNXB + "\tMa Loai Sach:" + k.loaiSach.MaLoaiSach + "\tNam Xuat ban:" + k.NamXB + " Lan xuat ban:" + k.LanXB + " So luong:" + k.SoLuong);
            //}
            //Console.WriteLine("=========================================================================================================");
            ////--4.cho biết các cuốn sách đã được trả từ 11/11/2021 đến 21/11/2021 
            //Console.WriteLine("4.cho biet cac cuon sach da duoc tra truoc ngay 20 thang 11\n");
            //DateTime start = new DateTime(2021, 11, 11);
            //DateTime end = new DateTime(2021, 11, 21);
            //var cau4 = from p in traSach
            //             where p.ngayTra >= start && p.ngayTra <= end
            //             select new { p.MSNV, p.MSSach, p.ngayTra };
            //foreach (var r in cau4)
            //{
            //    Console.WriteLine("MSNV: " + r.MSNV.MSNV + "\t Ma so sach: " + r.MSSach.MSSACH + "\t Ten sach: " + r.MSSach.TenSach + "\t\t Ngay tra:" + r.ngayTra);
            //}
            //Console.WriteLine("=========================================================================================================");
            ////5.tính tổng tiền phạt của thư viện
            //Console.WriteLine("5.tinh tong tien phat cua thu vien\n");
            //var TongTien =
            //      phat.Sum(w => w.TienNop);
            //Console.WriteLine("Tong tien phat " + TongTien + " VNĐ");
            //Console.WriteLine("=========================================================================================================");
            ////6.cho biết các sách xuất bản từ lần thứ 3
            //Console.WriteLine("6.cho biet cac sach xuat ban tu lan thu 3\n");
            //var cau6 =
            //    from p in sach
            //    where p.LanXB >= 3
            //    select p;
            //foreach (var k in cau6)
            //{
            //    Console.WriteLine("Ma so sach:" + k.MSSACH + "\tTen sach: " + k.TenSach + "\t\tMa tac gia:" + k.tacGia.MaTG + "\tMaNXB:" + k.nxb.MaNXB + "\tMa Loai Sach:" + k.loaiSach.MaLoaiSach + "\tNam Xuat ban:" + k.NamXB + " Lan xuat ban:" + k.LanXB + " So luong:" + k.SoLuong);
            //}
            //Console.WriteLine("=========================================================================================================");
            ////7.cho biết số lượng sách mượn của từng độc giả
            //Console.WriteLine("7.cho biet so luong sach muon cua tung đoc gia\n");
            //var cau7 = from p in muonSach
            //           group p by p.MSDG into p
            //           select new
            //           {
            //               MaDG = p.Key,
            //               soSachMuon = p.Count()
            //           };
            //foreach (var r in cau7)
            //{
            //    Console.WriteLine("Ma doc gia: " + r.MaDG.MSDG + "\t Ten doc gia: " + r.MaDG.HoTen + "\tSo luong sach muon: " + r.soSachMuon);
            //}
            //Console.WriteLine("=========================================================================================================");
            ////8.Lấy thông tin nhà xuất bản bỏ qua 4 dòng đầu
            //Console.WriteLine("8.Lay thong tin nha xuat ban bo qua 4 dong dau\n");
            //var cau8 = (from p in nxb select p).Skip(4);
            //foreach (var p in cau8)
            //{
            //    Console.WriteLine("Ma NXB: " + p.MaNXB + "\tTen NXB: " + p.tenNXB + "\tDia Chi: " + p.DiaChiNXB);
            //}
            //Console.WriteLine("=========================================================================================================");
            ////9.liệt kê nhà xuất bản và tác giả của từng cuốn sách
            //Console.WriteLine("9.liet ke nha xuat ban va tac gia cua tung cuon sach\n");
            //var cau9 =
            //    from s in sach
            //    join n in nxb on s.nxb.MaNXB equals n.MaNXB
            //    join t in tacGia on s.tacGia.MaTG equals t.MaTG
            //    select new { tenSach = s.TenSach, tenNXB = n.tenNXB, tenTG = t.TenTG };
            //foreach (var r in cau9)
            //{
            //    Console.WriteLine("Ten sach: " + r.tenSach + "\t\tTen NXB: " + r.tenNXB + "\tTen tac gia: " + r.tenTG);
            //}
            //Console.WriteLine("=========================================================================================================");
            ////10.cho biết thông tin độc giả đầu tiên ở Hồ Chí Minh
            //Console.WriteLine("10.cho biet ten doc gia cuoi cung o Ho Chi Minh\n");
            //var resultLast = (from p in docGia
            //                  where p.DiaChi=="Ho Chi Minh" select p).Last();
            //Console.WriteLine("Ho Ten: "+resultLast.HoTen + "\t"+(resultLast.GioiTinh?"Gioi tinh: Nam":"Gioi tinh: Nu")+"\tNgay sinh: "+ resultLast.NgaySinh+"\t Dia chi: "+resultLast.DiaChi);

            //LÊ ĐĂNG KHOA (CÂU 11 - 20)
            //11. Liệt kê sách theo loại sách
            Console.WriteLine("\t\t==============LE DANG KHOA CAU 11 -> 20===================");
            cau11();
            cau12();
            cau13();
            cau14();
            cau15();
            cau16();
            cau17();
            cau18();
            cau19();
            cau20();
            Console.ReadLine();
        }
        //fdfs
    }
}
