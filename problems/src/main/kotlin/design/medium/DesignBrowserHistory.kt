package design.medium

/**
 * You have a browser of one tab where you start on the homepage and you can visit another url,
 * get back in the history number of steps or move forward in the history number of steps.
 *
 * Implement the BrowserHistory class:
 * * BrowserHistory(string homepage) Initializes the object with the homepage of the browser.
 * * void visit(string url) Visits url from the current page. It clears up all the forward history.
 * * string back(int steps) Move steps back in history. If you can only return x steps in the history and steps > x,
 * you will return only x steps. Return the current url after moving back in history at most steps.
 * * string forward(int steps) Move steps forward in history. If you can only forward x steps in the history and
 * steps > x, you will forward only x steps. Return the current url after forwarding in history at most steps.
 *
 * [URL](https://leetcode.com/problems/design-browser-history/)
 */
object DesignBrowserHistory {
    class BrowserHistory(homepage: String) {
        private class Node(val url: String) {
            var next: Node? = null
            var prev: Node? = null

            fun setNext(url: String): Node {
                val newNode = Node(url)
                newNode.prev = this
                this.next = newNode
                return newNode
            }
        }

        private var currNode = Node(homepage)

        fun visit(url: String) {
            currNode = currNode.setNext(url)
        }

        fun back(steps: Int): String {
            var node = currNode
            for (i in 0 until steps) {
                if (node.prev == null) {
                    break
                }
                node = node.prev!!
            }
            currNode = node
            return node.url
        }

        fun forward(steps: Int): String {
            var node = currNode
            for (i in 0 until steps) {
                if (node.next == null) {
                    break
                }
                node = node.next!!
            }
            currNode = node
            return node.url
        }
    }
}