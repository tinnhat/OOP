package mypack;

public class TacGia {

    public String MaTG;
    public String TenTG; 
    public boolean gioiTinh;
    public String diaChi;
    public String SDT;
    
    
    public TacGia(String MaTG, String TenTG, boolean gioiTinh, String diaChi, String SDT)
    {
        this.MaTG = MaTG;
        this.TenTG = TenTG;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.SDT = SDT;
    }
    public TacGia(TacGia tacgia)
    {
        this.MaTG = tacgia.MaTG;
        this.TenTG = tacgia.TenTG;
        this.gioiTinh = tacgia.gioiTinh;
        this.diaChi = tacgia.diaChi;
        this.SDT = tacgia.SDT;
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
