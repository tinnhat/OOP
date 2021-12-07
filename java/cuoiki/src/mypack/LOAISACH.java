package mypack;

public class LoaiSach {

    public String MaLoaiSach;
    public String TheLoai;
    
    public LoaiSach(String MaLoaiSach,String TheLoai)
    {
        this.MaLoaiSach = MaLoaiSach;
        this.TheLoai = TheLoai;
    }
    public LoaiSach(LoaiSach Loai)
    {
        this.MaLoaiSach = Loai.MaLoaiSach;
        this.TheLoai = Loai.TheLoai;
    }
    
    
	public String getMaLoaiSach() {
		return MaLoaiSach;
	}
	public void setMaLoaiSach(String maLoaiSach) {
		MaLoaiSach = maLoaiSach;
	}
	public String getTheLoai() {
		return TheLoai;
	}
	public void setTheLoai(String theLoai) {
		TheLoai = theLoai;
	}
    
    
}
