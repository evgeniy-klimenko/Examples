using AngleSharp.Parser.Html;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Parser.Core
{
    class ParserController<T> where T : class
    {

        Parser<T> parser;

        ParserSettings parserSettings;

        HTML_Loader hTML_Loader;

        bool isActive;

        #region Properties

        public Parser<T> Parser
        {
            get
            {
                return parser;
            }

            set
            {
                parser = value;
            }
        }

        public ParserSettings Settings
        {
            get
            {
                return parserSettings;
            }

            set
            {
                parserSettings = value;

                hTML_Loader = new HTML_Loader(value);
            }
        }

        public bool IsActive
        {
            get
            {
                return isActive;
            }
        }

        #endregion

        public event Action<object, T> OnNewData;

        public event Action<object> OnComplete;

        public ParserController(Parser<T> parser)
        {
            this.parser = parser;
        }

        public ParserController(Parser<T> parser, ParserSettings parserSettings) : this(parser)
        {
            this.parserSettings = parserSettings;
        }

        public void Start()
        {
            isActive = true;

            Run();
        }

        public void Stop()
        {
            isActive = false;
        }

        private async void Run()
        {
            for(int i = parserSettings.StartPoint; i <= parserSettings.EndPoint; i++)
            {
                if(!isActive)
                {
                    OnComplete?.Invoke(this);
                    return;
                }

                var source = await hTML_Loader.GetPageById(i);

                var domParser = new HtmlParser();

                var document = await domParser.ParseAsync(source);

                var result = parser.Parse(document);

                OnNewData?.Invoke(this, result);
            }

            OnComplete?.Invoke(this);
            isActive = false;
        }


    }
}
