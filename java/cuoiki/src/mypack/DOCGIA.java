package mypack;

import java.util.Date;

public class DOCGIA {
	public String MSDG;
	public String HoTen;
	public String DiaChi;
	public Date NgaySinh;
	public boolean GioiTinh;
	public String email;
	public DOCGIA(String mSDG, String hoTen, String diaChi, Date ngaySinh, boolean gioiTinh, String email) {
		super();
		MSDG = mSDG;
		HoTen = hoTen;
		DiaChi = diaChi;
		NgaySinh = ngaySinh;
		GioiTinh = gioiTinh;
		this.email = email;
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
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
