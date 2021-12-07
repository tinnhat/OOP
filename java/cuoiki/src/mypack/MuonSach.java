package mypack;

import java.sql.Date;

public class MuonSach {
	public ChiTietPhieuMuon chitiet;
    public DocGia MSDG;
    public NhanVien MSNV;
    public Date ngayMuon;
    
    public MuonSach(ChiTietPhieuMuon chitiet, DocGia MSDG, NhanVien MSNV, Date ngayMuon)
    {
        this.chitiet = chitiet;
        this.MSDG = MSDG;
        this.MSNV = MSNV;
        this.ngayMuon = ngayMuon;
    }
    public MuonSach(MuonSach muonSach)
    {
        this.chitiet = muonSach.chitiet;
        this.MSDG = muonSach.MSDG;
        this.MSNV = muonSach.MSNV;
        this.ngayMuon = muonSach.ngayMuon;
    }
    
	public ChiTietPhieuMuon getChitiet() {
		return chitiet;
	}
	public void setChitiet(ChiTietPhieuMuon chitiet) {
		this.chitiet = chitiet;
	}
	public DocGia getMSDG() {
		return MSDG;
	}
	public void setMSDG(DocGia mSDG) {
		MSDG = mSDG;
	}
	public NhanVien getMSNV() {
		return MSNV;
	}
	public void setMSNV(NhanVien mSNV) {
		MSNV = mSNV;
	}
	public Date getNgayMuon() {
		return ngayMuon;
	}
	public void setNgayMuon(Date ngayMuon) {
		this.ngayMuon = ngayMuon;
	}
    
    
    
    
    
}
