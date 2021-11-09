using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DoAnOOP
{
    class BaoCaoSach
    {
        public bool Xuly { get; set; }
        public string TinhTrang { get; set; }
        public Sach MASSach { get; set; }
        public NhanVien MSNV { get; set; }

        public BaoCaoSach(Sach MASSach, NhanVien MSNV, string TinhTrang, bool Xuly)
        {
            this.MASSach = MASSach;
            this.MSNV = MSNV;
            this.TinhTrang = TinhTrang;
            this.Xuly = Xuly;
        }
        public BaoCaoSach(BaoCaoSach bc)
        {
            MASSach = bc.MASSach;
            MSNV = bc.MSNV;
            TinhTrang = bc.TinhTrang;
            Xuly = bc.Xuly;
        }

    }
}
