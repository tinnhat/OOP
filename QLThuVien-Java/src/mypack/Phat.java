package mypack;

public class Phat {

	  public Sach MSSach;
      public DocGia MSDG;
      public String LyDoPhat;
      public double TienNop;
      
      public Phat(Sach MSSach, DocGia MSDG, String LyDoPhat, double TienNop)
      {
          this.MSSach = MSSach;
          this.MSDG = MSDG;
          this.LyDoPhat = LyDoPhat;
          this.TienNop = TienNop;
      }
      public Phat(Phat phat)
      {
          MSSach = phat.MSSach;
          MSDG = phat.MSDG;
          LyDoPhat = phat.LyDoPhat;
          TienNop = phat.TienNop;
      }
      
	public Sach getMSSach() {
		return MSSach;
	}
	public void setMSSach(Sach mSSach) {
		MSSach = mSSach;
	}
	public DocGia getMSDG() {
		return MSDG;
	}
	public void setMSDG(DocGia mSDG) {
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
