using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DoAnOOP
{
    public class LoaiSach
    {
        public string MaLoaiSach { get; set; }
        public string TheLoai { get; set; }

        public LoaiSach(string MaLoaiSach,string TheLoai)
        {
            this.MaLoaiSach = MaLoaiSach;
            this.TheLoai = TheLoai;
        }
        public LoaiSach(LoaiSach Loai)
        {
            this.MaLoaiSach = Loai.MaLoaiSach;
            this.TheLoai = Loai.TheLoai;
        }
    }
}
