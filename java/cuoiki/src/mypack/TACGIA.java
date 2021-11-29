package mypack;

public class TACGIA {
	public String MaTG;
	public String TenTG;
	public boolean gioiTinh;
	public String diaChi;
	public String SDT;
	public TACGIA(String maTG, String tenTG, boolean gioiTinh, String diaChi, String sDT) {
		super();
		MaTG = maTG;
		TenTG = tenTG;
		this.gioiTinh = gioiTinh;
		this.diaChi = diaChi;
		SDT = sDT;
	}
	public String getMaTG() {
		return MaTG;
	}
	public void setMaTG(String maTG) {
		MaTG = maTG;
	}
	public String getTenTG() {
		return TenTG;
	}
	public void setTenTG(String tenTG) {
		TenTG = tenTG;
	}
	public boolean isGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(boolean gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getSDT() {
		return SDT;
	}
	public void setSDT(String sDT) {
		SDT = sDT;
	}
	
	
}
