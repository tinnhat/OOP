package mypack;

public class NXB {
	public String MaNXB;
	public String tenNXB;
	public String DiaChiNXB;
	public String ThongTinKhac;
	public NXB(String maNXB, String tenNXB, String diaChiNXB, String thongTinKhac) {
		super();
		MaNXB = maNXB;
		this.tenNXB = tenNXB;
		DiaChiNXB = diaChiNXB;
		ThongTinKhac = thongTinKhac;
	}
	
	public String getMaNXB() {
		return MaNXB;
	}
	public void setMaNXB(String maNXB) {
		MaNXB = maNXB;
	}
	public String getTenNXB() {
		return tenNXB;
	}
	public void setTenNXB(String tenNXB) {
		this.tenNXB = tenNXB;
	}
	public String getDiaChiNXB() {
		return DiaChiNXB;
	}
	public void setDiaChiNXB(String diaChiNXB) {
		DiaChiNXB = diaChiNXB;
	}
	public String getThongTinKhac() {
		return ThongTinKhac;
	}
	public void setThongTinKhac(String thongTinKhac) {
		ThongTinKhac = thongTinKhac;
	}
	
}
