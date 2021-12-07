package mypack;

public class Sach {

	   public String MSSACH;
       public String TenSach; 
       public String NamXB;
       public int LanXB;
       public int SoLuong;
       public LoaiSach loaiSach ;
       public TacGia tacGia ;
       public NXB nxb ;
       
   public Sach(String MSSACH, String TenSach, String NamXB, int LanXB, int SoLuong, LoaiSach loaiSach, TacGia tacGia, NXB nxb)
   {
           this.MSSACH = MSSACH;
           this.TenSach = TenSach;
           this.NamXB = NamXB;
           this.LanXB = LanXB;
           this.SoLuong = SoLuong;
           this.loaiSach = loaiSach;
           this.tacGia = tacGia;
           this.nxb = nxb;
   }
   public Sach(Sach sach)
   {
           MSSACH = sach.MSSACH;
           TenSach = sach.TenSach;
           NamXB = sach.NamXB;
           LanXB = sach.LanXB;
           SoLuong = sach.SoLuong;
           loaiSach = sach.loaiSach;
           tacGia = sach.tacGia;
           nxb = sach.nxb;
   }
   public Sach()
   {
       
   }
       
       
	public String getMSSACH() {
		return MSSACH;
	}
	public void setMSSACH(String mSSACH) {
		MSSACH = mSSACH;
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
	public LoaiSach getLoaiSach() {
		return loaiSach;
	}
	public void setLoaiSach(LoaiSach loaiSach) {
		this.loaiSach = loaiSach;
	}
	public TacGia getTacGia() {
		return tacGia;
	}
	public void setTacGia(TacGia tacGia) {
		this.tacGia = tacGia;
	}
	public NXB getNxb() {
		return nxb;
	}
	public void setNxb(NXB nxb) {
		this.nxb = nxb;
	}
       
       
}
