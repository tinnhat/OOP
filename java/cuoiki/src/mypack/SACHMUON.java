package mypack;

import java.util.Date;

public class SACHMUON {
	public CHITIETPHIEUMUON chitietphieumuon;
	public DOCGIA docgia;
	public NHANVIEN nhanvien;
	public Date ngayMuon;
	public SACHMUON(CHITIETPHIEUMUON chitietphieumuon, DOCGIA docgia, NHANVIEN nhanvien, Date ngayMuon) {
		super();
		this.chitietphieumuon = chitietphieumuon;
		this.docgia = docgia;
		this.nhanvien = nhanvien;
		this.ngayMuon = ngayMuon;
	}
	public CHITIETPHIEUMUON getChitietphieumuon() {
		return chitietphieumuon;
	}
	public void setChitietphieumuon(CHITIETPHIEUMUON chitietphieumuon) {
		this.chitietphieumuon = chitietphieumuon;
	}
	public DOCGIA getDocgia() {
		return docgia;
	}
	public void setDocgia(DOCGIA docgia) {
		this.docgia = docgia;
	}
	public NHANVIEN getNhanvien() {
		return nhanvien;
	}
	public void setNhanvien(NHANVIEN nhanvien) {
		this.nhanvien = nhanvien;
	}
	public Date getNgayMuon() {
		return ngayMuon;
	}
	public void setNgayMuon(Date ngayMuon) {
		this.ngayMuon = ngayMuon;
	}
	
}
