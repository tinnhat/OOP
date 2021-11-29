package mypack;

public class PHAT {
	public SACH MSSach;
	public DOCGIA MSDG;
	public String LyDoPhat;
	public double TienNop;
	public PHAT(SACH mSSach, DOCGIA mSDG, String lyDoPhat, double tienNop) {
		super();
		MSSach = mSSach;
		MSDG = mSDG;
		LyDoPhat = lyDoPhat;
		TienNop = tienNop;
	}
	public SACH getMSSach() {
		return MSSach;
	}
	public void setMSSach(SACH mSSach) {
		MSSach = mSSach;
	}
	public DOCGIA getMSDG() {
		return MSDG;
	}
	public void setMSDG(DOCGIA mSDG) {
		MSDG = mSDG;
	}
	public String getLyDoPhat() {
		return LyDoPhat;
	}
	public void setLyDoPhat(String lyDoPhat) {
		LyDoPhat = lyDoPhat;
	}
	public double getTienNop() {
		return TienNop;
	}
	public void setTienNop(double tienNop) {
		TienNop = tienNop;
	}
	
}
