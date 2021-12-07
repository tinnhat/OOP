package mypack;

public class BaoCaoSach {

	public boolean Xuly;
	public String TinhTrang;
	public Sach MASSach;
	public NhanVien MSNV;
	
	public BaoCaoSach(Sach MASSach, NhanVien MSNV, String TinhTrang, boolean Xuly)
    {
        this.MASSach = MASSach;
        this.MSNV = MSNV;
        this.TinhTrang = TinhTrang;
        this.Xuly = Xuly;
    }
    public BaoCaoSach(BaoCaoSach bc)
    {
        MASSach = bc.MASSach;
        MSNV = bc.MSNV;
        TinhTrang = bc.TinhTrang;
        Xuly = bc.Xuly;
    }
	
	public boolean isXuly() {
		return Xuly;
	}
	public void setXuly(boolean xuly) {
		Xuly = xuly;
	}
	public String getTinhTrang() {
		return TinhTrang;
	}
	public void setTinhTrang(String tinhTrang) {
		TinhTrang = tinhTrang;
	}
	public Sach getMASSach() {
		return MASSach;
	}
	public void setMASSach(Sach mASSach) {
		MASSach = mASSach;
	}
	public NhanVien getMSNV() {
		return MSNV;
	}
	public void setMSNV(NhanVien mSNV) {
		MSNV = mSNV;
	}
	
	
}
