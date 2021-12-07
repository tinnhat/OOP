package mypack;

import java.sql.Date;

public class ChiTietPhieuMuon {

    public String SoPhieuMuon;
    public String MSSACH;
    public Date HanTra;
    
    public ChiTietPhieuMuon(String SoPhieuMuon, String MSSACH, Date HanTra)
    {
        this.SoPhieuMuon = SoPhieuMuon;
        this.MSSACH = MSSACH;
        this.HanTra = HanTra;
    }
    public ChiTietPhieuMuon(ChiTietPhieuMuon phieu)
    {
        this.SoPhieuMuon = phieu.SoPhieuMuon;
        this.MSSACH = phieu.MSSACH;
        this.HanTra = phieu.HanTra;
    }
    
	public String getSoPhieuMuon() {
		return SoPhieuMuon;
	}
	public void setSoPhieuMuon(String soPhieuMuon) {
		SoPhieuMuon = soPhieuMuon;
	}
	public String getMSSACH() {
		return MSSACH;
	}
	public void setMSSACH(String mSSACH) {
		MSSACH = mSSACH;
	}
	public Date getHanTra() {
		return HanTra;
	}
	public void setHanTra(Date hanTra) {
		HanTra = hanTra;
	}
    
    

}
