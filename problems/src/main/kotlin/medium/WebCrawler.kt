package medium

/**
 * Given a url startUrl and an interface HtmlParser, implement a web crawler to crawl all links
 * that are under the same hostname as startUrl.
 *
 * Return all urls obtained by your web crawler in any order.
 *
 * Your crawler should:
 * * Start from the page: startUrl
 * * Call HtmlParser.getUrls(url) to get all urls from a webpage of given url.
 * * Do not crawl the same link twice.
 * * Explore only the links that are under the same hostname as startUrl.
 *
 * As shown in the example url above, the hostname is example.org. For simplicity sake, you may assume all urls use http
 * protocol without any port specified. For example, the urls http://leetcode.com/problems and http://leetcode.com/contest
 * are under the same hostname, while urls http://example.org/test and http://example.com/abc are not under the same hostname.
 *
 * The HtmlParser interface is defined as such:
 *
 * interface HtmlParser {
 *   // Return a list of all urls from a webpage of given url.
 *   public List<String> getUrls(String url);
 * }
 * Below are two examples explaining the functionality of the problem, for custom testing purposes you'll have three
 * variables urls, edges and startUrl. Notice that you will only have access to startUrl in your code, while urls and
 * edges are not directly accessible to you in code.
 *
 * Note: Consider the same URL with the trailing slash "/" as a different URL.
 * For example, "http://news.yahoo.com", and "http://news.yahoo.com/" are different urls.
 *
 * [URL](https://leetcode.com/problems/web-crawler/)
 */
object WebCrawler {
    interface HtmlParser {
        fun getUrls(url: String): List<String>
    }

    fun crawl(startUrl: String, htmlParser: HtmlParser): List<String> {
        val visited = HashSet<String>()
        val hostName = extractHostname(startUrl)
        val queue = java.util.ArrayDeque<String>()
        queue.offer(startUrl)
        visited.add(startUrl)

        while (queue.isNotEmpty()) {
            val currUrl = queue.poll()

            for (link in htmlParser.getUrls(currUrl)) {
                if (extractHostname(link) != hostName || !visited.add(link)) {
                    continue
                }
                queue.offer(link)
            }
        }

        return visited.toList()
    }

    private fun extractHostname(url: String): String {
        val prefixEnd = 7
        val end = url.indexOf('/', prefixEnd)

        return if (end == -1) {
            url.substring(prefixEnd)
        } else {
            url.substring(prefixEnd, end)
        }
    }
}
