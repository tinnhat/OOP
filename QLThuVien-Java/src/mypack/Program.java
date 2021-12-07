package mypack;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.function.Function;
import static java.util.stream.Collectors.*;


public class Program {
	static List<BaoCaoSach> baoCaoSach = new ArrayList<BaoCaoSach>();        
	static List<ChiTietPhieuMuon> chiTietPhieuMuon = new ArrayList<ChiTietPhieuMuon>();
	static List<DocGia> docGia = new ArrayList<DocGia>();
	static  List<LoaiSach> loaiSach = new ArrayList<LoaiSach>();
	static List<MuonSach> muonSach = new ArrayList<MuonSach>();
	static List<NhanVien> nhanVien = new ArrayList<NhanVien>();
	static List<NXB> nxb = new ArrayList<NXB>();
	static List<Phat> phat = new ArrayList<Phat>();
	static  List<Sach> sach = new ArrayList<Sach>();
	static  List<TacGia> tacGia = new ArrayList<TacGia>();
	static  List<TraSach> traSach = new ArrayList<TraSach>();
	
	 public static void TaoLoaiSach()
     {
         loaiSach.add(new LoaiSach("LT01", "ly thuyet"));
         loaiSach.add(new LoaiSach("NC01", "nang cao"));
         loaiSach.add(new LoaiSach("TC01", "tu chon"));
         loaiSach.add(new LoaiSach("GT01", "giao trinh"));
         loaiSach.add(new LoaiSach("TK01", "tham khao"));
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
         tacGia.add(new TacGia("TG01", "Nguyen Nhat Tin", true, "Bien Hoa Dong Nai", "0834667431"));
         tacGia.add(new TacGia("TG02", "Le Dang Khoa", false, "Dong Nai", "083663123"));
         tacGia.add(new TacGia("TG03", "Nguyen Thanh Dong", false, "Ho Chi Minh", "092187123"));
     }
     public static void TaoSach()
     {
         sach.add(new Sach("TA01","Tieng anh 12","2003",3,20,loaiSach.get(0),tacGia.get(0),nxb.get(0)));
         sach.add(new Sach("TA02", "Tieng anh 12 tap 2", "2003", 4, 30, loaiSach.get(0), tacGia.get(0), nxb.get(0)));
         sach.add(new Sach("TRR1", "Toan roi rac", "2012", 5, 10, loaiSach.get(3), tacGia.get(1), nxb.get(1)));
         sach.add(new Sach("LT01", "Lap Trinh C", "2000", 2, 15, loaiSach.get(1), tacGia.get(2), nxb.get(0)));
         sach.add(new Sach("JS01", "Javascript co ban", "2006", 2, 10, loaiSach.get(4), tacGia.get(1), nxb.get(0)));
         sach.add(new Sach("WEB1", "HTML/CSS co ban", "2006", 1, 40, loaiSach.get(4), tacGia.get(2), nxb.get(2)));
         sach.add(new Sach("TA03", "Toeic 500-600", "2020", 1, 10, loaiSach.get(3), tacGia.get(2), nxb.get(4)));
         sach.add(new Sach("TR01", "Truyen Doraemon", "2021", 1, 5, loaiSach.get(2), tacGia.get(1), nxb.get(5)));
     }
     public static void TaoNhanVien()
     {
         nhanVien.add(new NhanVien("NV01", "Nguyen Tin Nhat", "Dong Nai", new Date(2006 - 1900,12-1,2), true, "0834667431", "tinnhat0412@gmail.com"));
         nhanVien.add(new NhanVien("NV02","Nguyen Dong Thanh","Ho Chi Minh", new Date(2007-1900, 9-1, 6), false,"0834667431","dongthanh123@gmail.com"));
         nhanVien.add(new NhanVien("NV03", "Le Khoa Dang", "Dong Nai", new Date(2008-1900, 6-1, 9), false, "0834667431", "khoale123@gmail.com"));

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
         docGia.add(new DocGia("DG01", "Nguyen Van A", "Ho Chi Minh", new Date(2000-1900, 9-1, 6), true, "vanA@gmail.com"));
         docGia.add(new DocGia("DG02", "Nguyen Van T", "Dong Nai", new Date(2002-1900, 6-1, 9), true, "userT@gmail.com"));
         docGia.add(new DocGia("DG03", "Nguyen Thi K", "Vung Tau", new Date(2003-1900, 9-1, 6), false, "thiK@gmail.com"));
         docGia.add(new DocGia("DG04", "Nguyen Thi D", "Ha Noi", new Date(2006-1900, 6-1, 9), false, "thiD@gmail.com"));
         docGia.add(new DocGia("DG05", "Nguyen Van B", "Ho Chi Minh", new Date(2001-1900, 9-1, 6), true, "userB@gmail.com"));

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
      
      public static void cau1() {
    	  System.out.println("1.Cho biet tat ca cac sach cua thu vien\n");
          sach.forEach((k)->{
          	System.out.println("Ma so sach:" + k.MSSACH + "\tTen sach: " + k.TenSach + "\t\tMa tac gia:" + k.getTacGia().MaTG + "\tMaNXB:" + k.nxb.MaNXB + "\tMa Loai Sach:" + k.getLoaiSach().MaLoaiSach + "\tNam Xuat ban:" + k.NamXB + " Lan xuat ban:" + k.LanXB + " So luong:" + k.SoLuong);
          });
      }
      public static void cau2() {
    	  System.out.println("2.sap xep sach theo so luong tang dan\n");
          sach.sort((a,b)->a.SoLuong-b.SoLuong); //sắp xếp theo tăng dần (a> b true)
          sach.forEach((k)->{
          	System.out.println("Ma so sach:" + k.MSSACH + "\tTen sach: " + k.TenSach + "\t\tMa tac gia:" + k.getTacGia().MaTG + "\tMaNXB:" + k.nxb.MaNXB + "\tMa Loai Sach:" + k.getLoaiSach().MaLoaiSach + "\tNam Xuat ban:" + k.NamXB + " Lan xuat ban:" + k.LanXB + " So luong:" + k.SoLuong);
          	
          });
      }
      public static void cau3() {
    	  System.out.println("3.tinh tong tien phat cua thu vien\n");
          Double sum = phat.stream()
          		  .map(x -> x.getTienNop()) //lấy số tiền của từng record
          		  .reduce(0.0, Double::sum); //tổng lại theo kiểu dữ liệu double
          System.out.println("Tong tien phat: "+sum+" VND");
      }
      public static void cau4() {
    	  System.out.println("4.cho biet cac sach xuat ban tu lan thu 3\n");
    	  //filter tìm kiếm theo điều kiện
          sach.stream().filter(p->p.getLanXB()>=3).forEach(k->{
          	System.out.println("Ma so sach:" + k.MSSACH + "\tTen sach: " + k.TenSach + "\t\tMa tac gia:" + k.getTacGia().MaTG + "\tMaNXB:" + k.nxb.MaNXB + "\tMa Loai Sach:" + k.getLoaiSach().MaLoaiSach + "\tNam Xuat ban:" + k.NamXB + " Lan xuat ban:" + k.LanXB + " So luong:" + k.SoLuong);
          	
          });
      }
      public static void cau5() {
    	  System.out.println("5.cho biết thông tin độc giả cuối cùng ở Hồ Chí Minh\n");
          DocGia resultLast = docGia.stream().
          		filter(c-> c.DiaChi.equals("Ho Chi Minh")).
          		reduce((first, second) -> second).get(); 
      }
      
      //LE DANG KHOA CAU 6 -> CAU 10
      public static void cau6() {
    	  	List<String> x1 = loaiSach.stream()							//lấy MaLoaiSach tu loaiSach
	  						.map(x -> x.getMaLoaiSach())	
	  						 .collect(Collectors.toList());
       	  	List<String> x2 = sach.stream()
							.map(x-> x.getLoaiSach().getMaLoaiSach())	//lấy MaLoaiSach tu sach
							 .collect(Collectors.toList());
       	 	List<String> x3 = x1.stream()
   	 						 .filter(x->x2.contains(x))					//lấy MaLoaiSach co x1.MaLoaiSach=x2.MaLoaiSach
   	 						 .collect(Collectors.toList());				//Ta sẽ có danh sách MaLoaiSach 
        System.out.println("\n\t\t======11/ LIỆT KÊ DANH SÁCH SÁCH THEO THỂ LOẠI SÁCH =========");			
       	 for(int i = 0; i < x3.size(); i++) {		//nếu từ ds sách có MaLoaiSach = MaLoaiSach (từ list x3)
             String d = x3.get(i);					//ta sẽ bỏ vào list kết quả
			 List<Sach> kq =sach.stream()
					.filter(x -> x.getLoaiSach().getMaLoaiSach().contains(d))// so sánh MaLoaiSach
					.collect(Collectors.toList());							// có bằng với MaLoaiSach từ list x3 không
		    System.out.println("Thể Loại : " + kq.get(0).getLoaiSach().getTheLoai());
       	 	kq.stream()
       	 	.forEachOrdered(p->System.out.println(
       	 			"\tMSSACH : " + p.getMSSACH() + " || Tên Sách : "+ p.getTenSach() 
       	 			+ " || Mã Tác Giả : " + p.getTacGia().getTenTG() + " || Số lượng : " + p.getSoLuong() ));
         }      	 
      }
      
      public static void cau7() {
    	System.out.println("\n\t\t======12/ LIỆT KÊ CÁC ĐỘC GIẢ TRONG TÊN CÓ HỌ LÀ 'THỊ'=========");
  	  	List<DocGia> kq = docGia.stream()  						
					.filter(x -> x.getHoTen().contains("Thi"))	//nếu họ tên có chứa thị thì bỏ vào mảng kq
				    .collect(Collectors.toList());
  	  	kq.stream().forEachOrdered(p->System.out.println("MSDG : " + p.getMSDG() + " || Họ Tên : "+ p.getHoTen()
  	  										+ " || Địa chỉ : " + p.getDiaChi() + " || Email : " + p.getEmail()));	  
      }
      public static void cau8() {
    		System.out.println("\n\t\t====== 17/ LIỆT KÊ NHỮNG ĐỘC GIẢ CHƯA BAO GIỜ MƯỢN SÁCH ========= ");
    	  	List<String> x2 = muonSach.stream()						
    	  					.map(x -> x.getMSDG().getMSDG())		//lấy MSDG của các độc giả mượn sách
    	  					.distinct()
	  						.collect(Collectors.toList());
    	  	List<String> x1 = docGia.stream()
		    	  					.map(o -> o.getMSDG())			// lấy MSDG không ở trong danh sách mượn x2 ở trên 
		    	  					.filter(x -> !x2.contains(x))
		    	  					.collect(Collectors.toList());
    	   	 for(int i = 0; i < x1.size(); i++) {
    	         String d = x1.get(i);
    	   		 List<DocGia> kq =docGia.stream()				//từ danh sách độc giả 
    	   				 		.filter(x -> x.getMSDG().contains(d))	// nếu MSDG bằng với danh sách độc giả ko mượn
    	   				 		.collect(Collectors.toList());			//thì bỏ vào list kq
    	   		kq.stream()
           	 	.forEachOrdered(p->System.out.println(
           	 			"\tMSDG : " + p.getMSDG() + " || Tên Độc Gỉa : "+ p.getHoTen() 
           	 			+ " || Địa Chỉ : " + p.getDiaChi() + " || Ngày Sinh : " + p.getNgaySinh() + " || Email : " + p.getEmail() ));      	   		 
    	   	 }
      }
      public static void cau9() {
    	  System.out.println("\n\t\t====== 16/ LIỆT KÊ SÁCH CÓ SỐ LƯỢNG 10 TỚI 20 VÀ ĐƯỢC MƯỢN  ========= ");
     	  	List<String> x2 = chiTietPhieuMuon.stream()		//lấy MSSACH được mượn
			  					.map(x -> x.getMSSACH())
			  					.distinct()
			  					.collect(Collectors.toList());
    	  	List<Sach> x1 = sach.stream()					// lấy sách có số lượng 10 -> 20
							.filter(x -> (x.getSoLuong()>=10 && x.getSoLuong()<=20))
							.collect(Collectors.toList());    	  	
    	  	 for(int i = 0; i < x2.size(); i++) {	// duyệt ds MSSACH được mượn x2
    	         String d = x2.get(i);
    	   		 List<Sach> kq =x1.stream()		//từ list x1 có số lượng 10->20
    	   				 		.filter(x -> x.getMSSACH().contains(d))	// nếu x1.MSSACH = x2.MSSACH
    	   				 		.collect(Collectors.toList());	 //thì bỏ vào list kq
    	   		kq.stream()
           	 	.forEachOrdered(p->System.out.println(
           	 			"\tTên Sách : " + p.getTenSach() ));      	   		 
    	   	 }  	   
      }
      public static void cau10() {
          System.out.println("\n\t\t====== 18/ LIỆT KÊ TỔNG SỐ SÁCH CỦA TỪNG NHÀ XUẤT BẢN SÁCH========= ");
   	  	List<NXB> x1 = nxb.stream()
						.collect(Collectors.toList());   //lấy list NXB 
   	  	
	  	 for(int i = 0; i < x1.size(); i++) { 	//duyệt list NXB x1
	  		 String d = x1.get(i).getMaNXB();	
	  		 List<Sach> kq =sach.stream()		//từ list sach nếu MaNXB = x1.NXB
	  				 		.filter(x->x.getNxb().getMaNXB().contains(d))
	  				 		.collect(Collectors.toList());	 //thì bỏ vào list kq
	  		 long count = kq.stream().count();
	  		 System.out.println("Mã NXB : " + d + "|| Tên NXB : " + x1.get(i).getTenNXB()  + " || Số Lượng : " + count);		 
	  	 } 	  
      }
  	public static void main(String[] args) {
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
        //Nguyen Nhat Tin  cau 1 -> cau 5
        cau1();
        cau2();
        cau3();
        cau4();
        cau5();
        //Le Dang Khoa cau 6 -> cau 10
  		//cau6();
        //cau7();
        //cau8();
        //cau9();
        //cau10();
	}

}
