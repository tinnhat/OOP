package mypack;

public class NXB {

    public String MaNXB;
    public String tenNXB; 
    public String DiaChiNXB;
    public String ThongTinKhac;
    
    public NXB(String MaNXB,String tenNXB,String DiaChiNXB,String ThongTinKhac)
    {
        this.MaNXB = MaNXB;
        this.tenNXB = tenNXB;
        this.DiaChiNXB = DiaChiNXB;
        this.ThongTinKhac = ThongTinKhac;
    }
    public NXB(NXB nxb)
    {
        this.MaNXB = nxb.MaNXB;
        this.tenNXB = nxb.tenNXB;
        this.DiaChiNXB = nxb.DiaChiNXB;
        this.ThongTinKhac = nxb.ThongTinKhac;
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
