using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DoAnOOP
{
    public class DocGia
    {
        public string MSDG { get; set; }
        public string HoTen { get; set; }
        public string DiaChi { get; set; }

        public DateTime NgaySinh { get; set; }
        public bool GioiTinh { get; set; }
        public string Email { get; set; }

        public DocGia(string MSDG, string HoTen, string DiaChi, DateTime NgaySinh, bool GioiTinh, string Email)
        {
            this.MSDG = MSDG;
            this.HoTen = HoTen;
            this.DiaChi = DiaChi;
            this.NgaySinh = NgaySinh;
            this.GioiTinh = GioiTinh;
            this.Email = Email;
        }
        public DocGia(DocGia dg)
        {
            this.MSDG = dg.MSDG;
            this.HoTen = dg.HoTen;
            this.DiaChi = dg.DiaChi;
            this.NgaySinh = dg.NgaySinh;
            this.GioiTinh = dg.GioiTinh;
            this.Email = dg.Email;
        }

    }
}
