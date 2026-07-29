package medium

/**
 * Given an array of strings words, find the longest string in words such that every prefix of it is also in words.
 *
 * For example, let words = ["a", "app", "ap"]. The string "app" has prefixes "ap" and "a", all of which are in words.
 * Return the string described above. If there is more than one string with the same length,
 * return the lexicographically smallest one, and if no string exists, return "".
 *
 * [URL](https://leetcode.com/problems/longest-word-with-all-prefixes/)
 */
object LongestWordWithAllPrefixes {
    fun longestWordSet(words: Array<String>): String {
        val set = HashSet<String>()

        for (w in words) {
            set.add(w)
        }

        val sorted = words.sortedWith { w1, w2 ->
            if (w1.length == w2.length) {
                w1.compareTo(w2)
            } else w2.length - w1.length
        }

        for (w in sorted) {
            var found = true
            for (i in w.length - 1 downTo 1) {
                val substr = w.substring(0, i)
                if (substr !in set) {
                    found = false
                    break
                }
            }
            if (found) return w
        }
        return ""
    }

    private class Trie {
        private class TrieNode(val c: Char) {
            val children = arrayOfNulls<TrieNode>(26)
            var isWord = false
        }

        val root = TrieNode('-')

        fun add(word: String) {
            var curr = root
            for (c in word) {
                var node = curr.children[c - 'a']
                if (node == null) {
                    node = TrieNode(c)
                    curr.children[c - 'a'] = node
                }
                curr = node
            }
            curr.isWord = true
        }

        fun hasAllPrefixes(word: String): Boolean {
            var curr = root
            for (c in word) {
                val node = curr.children[c - 'a']
                if (node == null || !node.isWord) {
                    return false
                }
                curr = node
            }
            return true
        }
    }

    fun longestWordTrie(words: Array<String>): String {
        val trie = Trie()

        for (w in words) {
            trie.add(w)
        }

        var result = ""
        for (w in words) {
            if (trie.hasAllPrefixes(w)) {
                if (w.length > result.length || (w.length == result.length && w < result)) {
                    result = w
                }
            }
        }

        return result
    }
}