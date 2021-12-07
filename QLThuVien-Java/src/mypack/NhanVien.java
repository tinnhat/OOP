package mypack;

import java.sql.Date;

public class NhanVien {

    public String MSNV; 
    public String HoTenNV;
    public String DiaChi; 
    public Date NgaySinh;
    public boolean GioiTinh;
    public String SDT; 
    public String Email;
    
  
    public NhanVien(String MSNV, String HoTenNV, String DiaChi, Date NgaySinh, boolean GioiTinh, String SDT, String Email)
    {
        this.MSNV = MSNV;
        this.HoTenNV = HoTenNV;
        this.DiaChi = DiaChi;
        this.NgaySinh = NgaySinh;
        this.GioiTinh = GioiTinh;
        this.SDT = SDT;
        this.Email = Email;
    }
    public NhanVien(NhanVien nv)
    {
        this.MSNV = nv.MSNV;
        this.HoTenNV = nv.HoTenNV;
        this.DiaChi = nv.DiaChi;
        this.NgaySinh = nv.NgaySinh;
        this.GioiTinh = nv.GioiTinh;
        this.SDT = nv.SDT;
        this.Email = nv.Email;
    }
}
