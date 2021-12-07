using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DoAnOOP
{
    public class Phat
    {
        public Sach MSSach { get; set; }
        public DocGia MSDG { get; set; }
        public string LyDoPhat { get; set; }
        public double TienNop { get; set; }

        public Phat(Sach MSSach, DocGia MSDG, string LyDoPhat, double TienNop)
        {
            this.MSSach = MSSach;
            this.MSDG = MSDG;
            this.LyDoPhat = LyDoPhat;
            this.TienNop = TienNop;
        }
        public Phat(Phat phat)
        {
            MSSach = phat.MSSach;
            MSDG = phat.MSDG;
            LyDoPhat = phat.LyDoPhat;
            TienNop = phat.TienNop;
        }
    }
}
