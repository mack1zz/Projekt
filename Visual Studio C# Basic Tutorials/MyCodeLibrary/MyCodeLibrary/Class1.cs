using System;

namespace MyCodeLibrary
{
    public class Scrape
    {
        public string ScrapeWebpage(string url)
        {
                WebClient client = new WebClient();
            string reply = client.DownloadString("http://msdn.microsoft.com");

                Console.WriteLine(reply);
                File.WriteAll
            }

        public string ScrapeWebpage(string url, string filepath)
        {

        }
    }
}
