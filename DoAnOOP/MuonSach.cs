using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DoAnOOP
{
    class MuonSach
    {
        public ChiTietPhieuMuon chitiet { get; set; }
        public DocGia MSDG { get; set; }
        public NhanVien MSNV { get; set; }
        public DateTime ngayMuon { get; set; }

        public MuonSach(ChiTietPhieuMuon chitiet, DocGia MSDG, NhanVien MSNV, DateTime ngayMuon)
        {
            this.chitiet = chitiet;
            this.MSDG = MSDG;
            this.MSNV = MSNV;
            this.ngayMuon = ngayMuon;
        }
        public MuonSach(MuonSach muonSach)
        {
            this.chitiet = muonSach.chitiet;
            this.MSDG = muonSach.MSDG;
            this.MSNV = muonSach.MSNV;
            this.ngayMuon = muonSach.ngayMuon;
        }
    }
}
