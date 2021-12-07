package mypack;

import java.sql.Date;

public class DocGia {

	   public String MSDG;
       public String HoTen;
       public String DiaChi;

       public Date NgaySinh;
       public boolean GioiTinh;
       public String Email;
       
       public DocGia(String MSDG, String HoTen, String DiaChi, Date NgaySinh, boolean GioiTinh, String Email)
       {
           this.MSDG = MSDG;
           this.HoTen = HoTen;
           this.DiaChi = DiaChi;
           this.NgaySinh = NgaySinh;
           this.GioiTinh = GioiTinh;
           this.Email = Email;
       }
       public DocGia(DocGia dg)
       {
           this.MSDG = dg.MSDG;
           this.HoTen = dg.HoTen;
           this.DiaChi = dg.DiaChi;
           this.NgaySinh = dg.NgaySinh;
           this.GioiTinh = dg.GioiTinh;
           this.Email = dg.Email;
       }
       
       
       
	public String getMSDG() {
		return MSDG;
	}
	public void setMSDG(String mSDG) {
		MSDG = mSDG;
	}
	public String getHoTen() {
		return HoTen;
	}
	public void setHoTen(String hoTen) {
		HoTen = hoTen;
	}
	public String getDiaChi() {
		return DiaChi;
	}
	public void setDiaChi(String diaChi) {
		DiaChi = diaChi;
	}
	public Date getNgaySinh() {
		return NgaySinh;
	}
	public void setNgaySinh(Date ngaySinh) {
		NgaySinh = ngaySinh;
	}
	public boolean isGioiTinh() {
		return GioiTinh;
	}
	public void setGioiTinh(boolean gioiTinh) {
		GioiTinh = gioiTinh;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
       
       
       
}
