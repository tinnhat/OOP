using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DoAnOOP
{
    public class TacGia
    {
        public string MaTG { get; set; }
        public string TenTG { get; set; }
        public bool gioiTinh { get; set; }
        public string diaChi { get; set; }
        public string SDT { get; set; }
        public TacGia(string MaTG, string TenTG, bool gioiTinh, string diaChi, string SDT)
        {
            this.MaTG = MaTG;
            this.TenTG = TenTG;
            this.gioiTinh = gioiTinh;
            this.diaChi = diaChi;
            this.SDT = SDT;
        }
        public TacGia(TacGia tacgia)
        {
            this.MaTG = tacgia.MaTG;
            this.TenTG = tacgia.TenTG;
            this.gioiTinh = tacgia.gioiTinh;
            this.diaChi = tacgia.diaChi;
            this.SDT = tacgia.SDT;
        }
    }
}
