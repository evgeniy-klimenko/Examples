using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Parser.Core.Store
{
    class StoreSettings : ParserSettings
    {
        public string TargetURL { get; set; } = "https://www.citrus.ua/smartfony/brand-samsung/";

        public string Prefix { get; set; } = "page{CurrentId }";

        public int StartPoint { get; set; }

        public int EndPoint { get; set; }
    }
}
