using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DoAnOOP
{
   public class NhanVien
    {
        public string MSNV { get; set; }
        public string HoTenNV { get; set; }
        public string DiaChi { get; set; }
        public DateTime NgaySinh { get; set; }
        public bool GioiTinh { get; set; }
        public string SDT { get; set; }
        public string Email { get; set; }

        public NhanVien(string MSNV, string HoTenNV, string DiaChi, DateTime NgaySinh, bool GioiTinh, string SDT, string Email)
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
}
