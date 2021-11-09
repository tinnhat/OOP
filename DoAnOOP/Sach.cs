using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DoAnOOP
{
    public class Sach
    {
        public string MSSACH { get; set; }
        public string TenSach { get; set; }
        public string NamXB { get; set; }
        public int LanXB { get; set; }
        public int SoLuong { get; set; }
        public LoaiSach loaiSach { get; set; }
        public TacGia tacGia { get; set; }
        public NXB nxb { get; set; }
        public Sach(string MSSACH, string TenSach, string NamXB, int LanXB, int SoLuong, LoaiSach loaiSach, TacGia tacGia, NXB nxb)
        {
            this.MSSACH = MSSACH;
            this.TenSach = TenSach;
            this.NamXB = NamXB;
            this.LanXB = LanXB;
            this.SoLuong = SoLuong;
            this.loaiSach = loaiSach;
            this.tacGia = tacGia;
            this.nxb = nxb;
        }
        public Sach(Sach sach)
        {
            MSSACH = sach.MSSACH;
            TenSach = sach.TenSach;
            NamXB = sach.NamXB;
            LanXB = sach.LanXB;
            SoLuong = sach.SoLuong;
            loaiSach = sach.loaiSach;
            tacGia = sach.tacGia;
            nxb = sach.nxb;
        }

    }
}
