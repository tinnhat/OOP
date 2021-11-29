package mypack;

import java.util.Date;

public class CHITIETPHIEUMUON {
	public String SoPhieuMuon;
	public String MSSach;
	public Date HanTra;
	public CHITIETPHIEUMUON(String soPhieuMuon, String mSSach, Date hanTra) {
		super();
		SoPhieuMuon = soPhieuMuon;
		MSSach = mSSach;
		HanTra = hanTra;
	}
	public String getSoPhieuMuon() {
		return SoPhieuMuon;
	}
	public void setSoPhieuMuon(String soPhieuMuon) {
		SoPhieuMuon = soPhieuMuon;
	}
	public String getMSSach() {
		return MSSach;
	}
	public void setMSSach(String mSSach) {
		MSSach = mSSach;
	}
	public Date getHanTra() {
		return HanTra;
	}
	public void setHanTra(Date hanTra) {
		HanTra = hanTra;
	}
	
}
