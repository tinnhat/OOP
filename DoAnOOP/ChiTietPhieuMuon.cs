using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DoAnOOP
{
    public class ChiTietPhieuMuon
    {
        public string SoPhieuMuon { get; set; }
        public string MSSACH { get; set; }
        public DateTime HanTra { get; set; }


        public ChiTietPhieuMuon(string SoPhieuMuon, string MSSACH, DateTime HanTra)
        {
            this.SoPhieuMuon = SoPhieuMuon;
            this.MSSACH = MSSACH;
            this.HanTra = HanTra;
        }
        public ChiTietPhieuMuon(ChiTietPhieuMuon phieu)
        {
            this.SoPhieuMuon = phieu.SoPhieuMuon;
            this.MSSACH = phieu.MSSACH;
            this.HanTra = phieu.HanTra;
        }

    }
}
