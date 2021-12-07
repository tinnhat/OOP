package mypack;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
	//loai sach
	static List<LOAISACH> loaiSach =new ArrayList<LOAISACH>();
	static List<TACGIA> tacGia=new ArrayList<TACGIA>();
	static List<SACH> sach=new ArrayList<SACH>();
	static List<DOCGIA> docGia=new ArrayList<DOCGIA>();
	static List<NHANVIEN> nhanVien=new ArrayList<NHANVIEN>();
	static List<CHITIETPHIEUMUON> chitietphieumuon=new ArrayList<CHITIETPHIEUMUON>();
	static List<SACHMUON> muonSach=new ArrayList<SACHMUON>();
	static List<PHAT> phat=new ArrayList<PHAT>();
	static List<NXB> nxb=new ArrayList<NXB>();
	
    public static void TaoLoaiSach()
    {
    	loaiSach.add(new LOAISACH("LT01", "ly thuyet"));
        loaiSach.add(new LOAISACH("NC01", "nang cao"));
        loaiSach.add(new LOAISACH("TC01", "tu chon"));
        loaiSach.add(new LOAISACH("GT01", "giao trinh"));
        loaiSach.add(new LOAISACH("TK01", "tham khao"));
    }
    public static void TaoNhaXuatBan()
    {
        nxb.add(new NXB("KD01", "Kim Dong", "248 Cong Quynh", ""));
        nxb.add(new NXB("HN01", "Ha Noi", "4 Tong Duy Tan,Hang Bong,Ha Noi", ""));
        nxb.add(new NXB("TR01", "Nha xuat ban Tre", "161B Ly Chinh Thang,P7,Q3", "Tam ngung"));
        nxb.add(new NXB("HCM01", "Nha xuat ban tong hop HCM", "62 Nguyen Thi Minh Khai,Da Kao,Q1", ""));
        nxb.add(new NXB("CT01", "Chinh Tri", "86 pho Duy Tan,quan Cau Giay,Ha Noi", ""));
        nxb.add(new NXB("PN01", "Nha xuat ban Phu Nu", "39 Hang Chuoi Pham Dinh Ho,Hai Ba Trung, Ha Noi", ""));

    }
    public static void TaoTacGia()
    {
        tacGia.add(new TACGIA("TG01", "Nguyen Nhat Tin", true, "Bien Hoa Dong Nai", "0834667431"));
        tacGia.add(new TACGIA("TG02", "Le Dang Khoa", false, "Dong Nai", "083663123"));
        tacGia.add(new TACGIA("TG03", "Nguyen Thanh Dong", false, "Ho Chi Minh", "092187123"));
    }
    public static void TaoSach()
    {
        sach.add(new SACH("TA01","Tieng anh 12","2003",3,20,loaiSach.get(0),tacGia.get(0),nxb.get(0)));
        sach.add(new SACH("TA02", "Tieng anh 12 tap 2", "2003", 4, 30, loaiSach.get(0),tacGia.get(0),nxb.get(0)));
        sach.add(new SACH("TRR1", "Toan roi rac", "2012", 5, 10, loaiSach.get(3),tacGia.get(1),nxb.get(1)));
        sach.add(new SACH("LT01", "Lap Trinh C", "2000", 2, 15, loaiSach.get(1),tacGia.get(2),nxb.get(0)));
        sach.add(new SACH("JS01", "Javascript co ban", "2006", 2, 10, loaiSach.get(4),tacGia.get(1),nxb.get(0)));
        sach.add(new SACH("WEB1", "HTML/CSS co ban", "2006", 1, 40, loaiSach.get(4),tacGia.get(2),nxb.get(2)));
        sach.add(new SACH("TA03", "Toeic 500-600", "2020", 1, 10, loaiSach.get(3),tacGia.get(2),nxb.get(4)));
        sach.add(new SACH("TR01", "Truyen Doraemon", "2021", 1, 5, loaiSach.get(2),tacGia.get(1),nxb.get(5)));
    }
    public static void TaoNhanVien()
    {
        nhanVien.add(new NHANVIEN("NV01", "Nguyen Tin Nhat", "Dong Nai", new Date(2006, 12, 4), true, "0834667431", "tinnhat0412@gmail.com"));
        nhanVien.add(new NHANVIEN("NV02","Nguyen Dong Thanh","Ho Chi Minh", new Date(2007, 9, 6), false,"0834667431","dongthanh123@gmail.com"));
        nhanVien.add(new NHANVIEN("NV03", "Le Khoa Dang", "Dong Nai", new Date(2008, 6, 9), false, "0834667431", "khoale123@gmail.com"));

    }
    public static void TaoBaoCaoSach()
    {
        baoCaoSach.add(new BaoCaoSach(sach.get(0), nhanVien.get(1), "sach bi thieu bia", false));
        baoCaoSach.add(new BaoCaoSach(sach.get(5), nhanVien.get(0), "sach bi rach", true));
        baoCaoSach.add(new BaoCaoSach(sach.get(1), nhanVien.get(2), "sach bi rach", true));
        baoCaoSach.add(new BaoCaoSach(sach.get(6), nhanVien.get(2), "sach bi uot", false));
        baoCaoSach.add(new BaoCaoSach(sach.get(2), nhanVien.get(1), "sach bi uot", true));
    }
    public static void TaoDocGia()
    {
        docGia.add(new DOCGIA("DG01", "Nguyen Van A", "Ho Chi Minh", new Date(2000, 9, 6), true, "vanA@gmail.com"));
        docGia.add(new DOCGIA("DG02", "Nguyen Van T", "Dong Nai", new Date(2002, 6, 9), true, "userT@gmail.com"));
        docGia.add(new DOCGIA("DG03", "Nguyen Thi K", "Vung Tau", new Date(2003, 9, 6), false, "thiK@gmail.com"));
        docGia.add(new DOCGIA("DG04", "Nguyen Thi D", "Ha Noi", new Date(2006, 6, 9), false, "thiD@gmail.com"));
        docGia.add(new DOCGIA("DG05", "Nguyen Van B", "Ho Chi Minh", new Date(2001, 9, 6), true, "userB@gmail.com"));

    }
    public static void TaoPhat()
    {
        phat.add(new Phat(sach.get(3), docGia.get(0), "nop tre", 20000.0));
        phat.add(new Phat(sach.get(4),docGia.get(1), "rach bia", 50000.0));
        phat.add(new Phat(sach.get(7), docGia.get(2), "mat sach", 80000.0));
    }
    public static void TaoChiTietPhieuMuon()
    {
        chiTietPhieuMuon.add(new ChiTietPhieuMuon("PM01", "TA01", new Date(2022-1900, 11-1, 11)));
        chiTietPhieuMuon.add(new ChiTietPhieuMuon("PM01", "LT01", new Date(2022-1900, 11-1, 11)));
        chiTietPhieuMuon.add(new ChiTietPhieuMuon("PM02", "JS01", new Date(2022-1900, 11-1, 11)));
        chiTietPhieuMuon.add(new ChiTietPhieuMuon("PM02", "JS01", new Date(2022-1900, 11-1, 11)));
        chiTietPhieuMuon.add(new ChiTietPhieuMuon("PM03", "TA01", new Date(2022-1900, 11-1, 11)));
    }
    public static void TaoMuonSach()
    {
        muonSach.add(new MuonSach(chiTietPhieuMuon.get(0),docGia.get(0), nhanVien.get(1), new Date(2021-1900, 11-1, 11)));
        muonSach.add(new MuonSach(chiTietPhieuMuon.get(1), docGia.get(1), nhanVien.get(0), new Date(2021-1900, 11-1, 11)));
        muonSach.add(new MuonSach(chiTietPhieuMuon.get(2), docGia.get(2), nhanVien.get(2), new Date(2021-1900, 1-1, 11)));
        muonSach.add(new MuonSach(chiTietPhieuMuon.get(3), docGia.get(0), nhanVien.get(2), new Date(2021-1900, 3-1, 12)));
    }
     public static void TaoTraSach()
    {
         traSach.add(new TraSach(chiTietPhieuMuon.get(0), sach.get(2),nhanVien.get(0), new Date(2021-1900, 11-1, 20)));
         traSach.add(new TraSach(chiTietPhieuMuon.get(0), sach.get(4), nhanVien.get(0), new Date(2021-1900, 11-1, 12)));
         traSach.add(new TraSach(chiTietPhieuMuon.get(1), sach.get(7), nhanVien.get(1), new Date(2021-1900, 11-1, 8)));
         traSach.add(new TraSach(chiTietPhieuMuon.get(2), sach.get(3), nhanVien.get(1), new Date(2021-1900, 11-1, 14)));
         traSach.add(new TraSach(chiTietPhieuMuon.get(2), sach.get(1), nhanVien.get(2), new Date(2021-1900, 11-1, 10)));
    }

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {


        //nhà xuất bản
        List<NXB> nxb=new ArrayList<NXB>();

        //tác giả:
        List<TACGIA> tacGia=new ArrayList<TACGIA>();

        //sach
        List<SACH> sach=new ArrayList<SACH>();

        //doc gia
        List<DOCGIA> docGia=new ArrayList<DOCGIA>();

        //nhan vien
        List<NHANVIEN> nhanVien=new ArrayList<NHANVIEN>();

        //chi tiết phiếu mượn
        List<CHITIETPHIEUMUON> chitietphieumuon=new ArrayList<CHITIETPHIEUMUON>();
        chitietphieumuon.add(new CHITIETPHIEUMUON("PM01", "TA01",new Date(2022, 11, 11)));
        chitietphieumuon.add(new CHITIETPHIEUMUON("PM01", "LT01", new Date(2022, 11, 11)));
        chitietphieumuon.add(new CHITIETPHIEUMUON("PM02", "JS01", new Date(2022, 11, 11)));
        chitietphieumuon.add(new CHITIETPHIEUMUON("PM02", "JS01", new Date(2022, 11, 11)));
        chitietphieumuon.add(new CHITIETPHIEUMUON("PM03", "TA01", new Date(2022, 11, 11)));
        //mượn sách
        List<SACHMUON> muonSach=new ArrayList<SACHMUON>();
        muonSach.add(new SACHMUON(chitietphieumuon.get(0),docGia.get(0), nhanVien.get(1), new Date(2021, 11, 11)));
        muonSach.add(new SACHMUON(chitietphieumuon.get(1), docGia.get(1), nhanVien.get(0), new Date(2021, 2, 11)));
        muonSach.add(new SACHMUON(chitietphieumuon.get(2), docGia.get(2), nhanVien.get(2), new Date(2021, 1, 11)));
        //phat
        List<PHAT> phat=new ArrayList<PHAT>();
        phat.add(new PHAT(sach.get(3), docGia.get(0), "nop tre", 20000.0));
        phat.add(new PHAT(sach.get(4),docGia.get(1), "rach bia", 50000.0));
        phat.add(new PHAT(sach.get(7), docGia.get(2), "mat sach", 80000.0));
        //1.Cho biết tất cả các sách của thư viện
        System.out.println("1.Cho biet tat ca cac sach cua thu vien\n");
        sach.forEach((k)->{
        	System.out.println("Ma so sach:" + k.MMSach + "\tTen sach: " + k.TenSach + "\t\tMa tac gia:" + k.tacgia.MaTG + "\tMaNXB:" + k.nxb.MaNXB + "\tMa Loai Sach:" + k.loaisach.MaLoaiSach + "\tNam Xuat ban:" + k.NamXB + " Lan xuat ban:" + k.LanXB + " So luong:" + k.SoLuong);
        });
        System.out.println("=========================================================================================================");
        //2.sắp xếp sách theo số lượng tăng dần
        System.out.println("2.sap xep sach theo so luong tang dan\n");
        sach.sort((a,b)->a.SoLuong-b.SoLuong);
        sach.forEach((k)->{
        	System.out.println("Ma so sach:" + k.MMSach + "\tTen sach: " + k.TenSach + "\t\tMa tac gia:" + k.tacgia.MaTG + "\tMaNXB:" + k.nxb.MaNXB + "\tMa Loai Sach:" + k.loaisach.MaLoaiSach + "\tNam Xuat ban:" + k.NamXB + " Lan xuat ban:" + k.LanXB + " So luong:" + k.SoLuong);
        	
        });
        System.out.println("=========================================================================================================");
        //3.tính tổng tiền phạt của thư viện
        System.out.println("3.tinh tong tien phat cua thu vien\n");
        Double sum = phat.stream()
        		  .map(x -> x.getTienNop())
        		  .reduce(0.0, Double::sum);
        System.out.println("Tong tien phat: "+sum+" VND");
        System.out.println("=========================================================================================================");
        //4.cho biết các sách xuất bản từ lần thứ 3 
        System.out.println("4.cho biet cac sach xuat ban tu lan thu 3\n");
        sach.stream().filter(p->p.getLanXB()>=3).forEach(k->{
        	System.out.println("Ma so sach:" + k.MMSach + "\tTen sach: " + k.TenSach + "\t\tMa tac gia:" + k.tacgia.MaTG + "\tMaNXB:" + k.nxb.MaNXB + "\tMa Loai Sach:" + k.loaisach.MaLoaiSach + "\tNam Xuat ban:" + k.NamXB + " Lan xuat ban:" + k.LanXB + " So luong:" + k.SoLuong);
        	
        });
        System.out.println("=========================================================================================================");
        //5.cho biết thông tin độc giả cuối cùng ở Hồ Chí Minh 
        System.out.println("5.cho biết thông tin độc giả cuối cùng ở Hồ Chí Minh\n");
        DOCGIA resultLast = docGia.stream().
        		filter(c-> c.DiaChi.equals("Ho Chi Minh")).
        		reduce((first, second) -> second).get();
        System.out.println("Ho Ten: "+resultLast.HoTen + "\t"+(resultLast.GioiTinh?"Gioi tinh: Nam":"Gioi tinh: Nu")+"\tNgay sinh: "+ resultLast.NgaySinh+"\t Dia chi: "+resultLast.DiaChi);
        
        
	}

}
