using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DoAnOOP
{
    public class NXB
    {
        public string MaNXB { get; set; }
        public string tenNXB { get; set; }
        public string DiaChiNXB { get; set; }
        public string ThongTinKhac { get; set; }
        public NXB(string MaNXB,string tenNXB,string DiaChiNXB,string ThongTinKhac)
        {
            this.MaNXB = MaNXB;
            this.tenNXB = tenNXB;
            this.DiaChiNXB = DiaChiNXB;
            this.ThongTinKhac = ThongTinKhac;
        }
        public NXB(NXB nxb)
        {
            this.MaNXB = nxb.MaNXB;
            this.tenNXB = nxb.tenNXB;
            this.DiaChiNXB = nxb.DiaChiNXB;
            this.ThongTinKhac = nxb.ThongTinKhac;
        }

    }
}
