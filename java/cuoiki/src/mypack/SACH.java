package mypack;

public class SACH {
	public String MMSach;
	public String TenSach;
	public String NamXB;
	public int LanXB;
	public int SoLuong;
	public LOAISACH loaisach;
	public TACGIA tacgia;
	public NXB nxb;
	public SACH(String mMSach, String tenSach, String namXB, int lanXB, int soLuong, LOAISACH loaisach, TACGIA tacgia,
			NXB nxb) {
		super();
		MMSach = mMSach;
		TenSach = tenSach;
		NamXB = namXB;
		LanXB = lanXB;
		SoLuong = soLuong;
		this.loaisach = loaisach;
		this.tacgia = tacgia;
		this.nxb = nxb;
	}
	public String getMMSach() {
		return MMSach;
	}
	public void setMMSach(String mMSach) {
		MMSach = mMSach;
	}
	public String getTenSach() {
		return TenSach;
	}
	public void setTenSach(String tenSach) {
		TenSach = tenSach;
	}
	public String getNamXB() {
		return NamXB;
	}
	public void setNamXB(String namXB) {
		NamXB = namXB;
	}
	public int getLanXB() {
		return LanXB;
	}
	public void setLanXB(int lanXB) {
		LanXB = lanXB;
	}
	public int getSoLuong() {
		return SoLuong;
	}
	public void setSoLuong(int soLuong) {
		SoLuong = soLuong;
	}
	public LOAISACH getLoaisach() {
		return loaisach;
	}
	public void setLoaisach(LOAISACH loaisach) {
		this.loaisach = loaisach;
	}
	public TACGIA getTacgia() {
		return tacgia;
	}
	public void setTacgia(TACGIA tacgia) {
		this.tacgia = tacgia;
	}
	public NXB getNxb() {
		return nxb;
	}
	public void setNxb(NXB nxb) {
		this.nxb = nxb;
	}
	
	
}
