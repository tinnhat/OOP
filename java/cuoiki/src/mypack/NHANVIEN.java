package mypack;

import java.util.Date;

public class NHANVIEN {
	public String MSNV;
	public String HoTenNV;
	public String DiaChi;
	public Date NgaySinh;
	public boolean GioiTinh;
	public String SDT;
	public String Email;
	public NHANVIEN(String mSNV, String hoTenNV, String diaChi, Date ngaySinh, boolean gioiTinh, String sDT,
			String email) {
		super();
		MSNV = mSNV;
		HoTenNV = hoTenNV;
		DiaChi = diaChi;
		NgaySinh = ngaySinh;
		GioiTinh = gioiTinh;
		SDT = sDT;
		Email = email;
	}
	public String getMSNV() {
		return MSNV;
	}
	public void setMSNV(String mSNV) {
		MSNV = mSNV;
	}
	public String getHoTenNV() {
		return HoTenNV;
	}
	public void setHoTenNV(String hoTenNV) {
		HoTenNV = hoTenNV;
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
	public String getSDT() {
		return SDT;
	}
	public void setSDT(String sDT) {
		SDT = sDT;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	
}
