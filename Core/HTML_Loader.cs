using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Net.Http;
 
namespace Parser.Core
{
    class HTML_Loader
    {
        readonly HttpClient client;

        readonly string URL;

        public HTML_Loader()
        {
        }

        public HTML_Loader(ParserSettings settings)
        {
            URL = $"{settings.TargetURL}/{settings.Prefix}/";

            client = new HttpClient() ;
        }

        public async Task<string> GetPageById(int id)
        {
            var currentURL = URL.Replace("{CurrentId}", id.ToString());

            var responce = await client.GetAsync(currentURL);

            string source = null;

            if(responce != null && responce.StatusCode == System.Net.HttpStatusCode.OK)
            {

                source = await responce.Content.ReadAsStringAsync();

            }

            return source;

        }

        
    }
}
