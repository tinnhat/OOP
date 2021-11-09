using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DoAnOOP
{
    public class TraSach
    {
        public ChiTietPhieuMuon chitiet { get; set; }
        public Sach MSSach { get; set; }
        public NhanVien MSNV { get; set; }
        public DateTime ngayMuon { get; set; }

        public TraSach(ChiTietPhieuMuon chitiet, Sach MSSach, NhanVien MSNV, DateTime ngayMuon)
        {
            this.chitiet = chitiet;
            this.MSSach = MSSach;
            this.MSNV = MSNV;
            this.ngayMuon = ngayMuon;
        }
        public TraSach(TraSach traSach)
        {
            this.chitiet = traSach.chitiet;
            this.MSSach = traSach.MSSach;
            this.MSNV = traSach.MSNV;
            this.ngayMuon = traSach.ngayMuon;
        }
    }
}
