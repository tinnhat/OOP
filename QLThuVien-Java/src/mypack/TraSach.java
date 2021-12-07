package mypack;

import java.sql.Date;

public class TraSach {
    public ChiTietPhieuMuon chitiet;
    public Sach MSSach;
    public NhanVien MSNV;
    public Date ngayTra;
    
    public TraSach(ChiTietPhieuMuon chitiet, Sach MSSach, NhanVien MSNV, Date ngayTra)
    {
        this.chitiet = chitiet;
        this.MSSach = MSSach;
        this.MSNV = MSNV;
        this.ngayTra = ngayTra;
    }
    public TraSach(TraSach traSach)
    {
        this.chitiet = traSach.chitiet;
        this.MSSach = traSach.MSSach;
        this.MSNV = traSach.MSNV;
        this.ngayTra = traSach.ngayTra;
    }   
    
	public ChiTietPhieuMuon getChitiet() {
		return chitiet;
	}
	public void setChitiet(ChiTietPhieuMuon chitiet) {
		this.chitiet = chitiet;
	}
	public Sach getMSSach() {
		return MSSach;
	}
	public void setMSSach(Sach mSSach) {
		MSSach = mSSach;
	}
	public NhanVien getMSNV() {
		return MSNV;
	}
	public void setMSNV(NhanVien mSNV) {
		MSNV = mSNV;
	}
	public Date getNgayTra() {
		return ngayTra;
	}
	public void setNgayTra(Date ngayTra) {
		this.ngayTra = ngayTra;
	}

    
}
