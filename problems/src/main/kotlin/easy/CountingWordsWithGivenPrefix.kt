package easy

/**
 * You are given an array of strings words and a string pref.
 *
 * Return the number of strings in words that contain pref as a prefix.
 *
 * A prefix of a string s is any leading contiguous substring of s.
 *
 * [URL](https://leetcode.com/problems/counting-words-with-a-given-prefix/)
 */
object CountingWordsWithGivenPrefix {
    fun prefixCountBuildIn(words: Array<String>, pref: String): Int {
        return words.count { it.startsWith(pref) }
    }

    fun prefixCountTrie(words: Array<String>, pref: String): Int {
        val trie = Trie()

        for (word in words) {
            trie.insert(word)
        }

        return trie.countPrefix(pref)
    }

    private class Trie {
        private class TrieNode {
            val children: MutableMap<Char, TrieNode> = mutableMapOf()
            var count: Int = 0
        }

        private val root = TrieNode()

        fun insert(word: String) {
            var node = root
            for (char in word) {
                node = node.children.computeIfAbsent(char) { TrieNode() }
                node.count++
            }
        }

        fun countPrefix(prefix: String): Int {
            var node = root
            for (char in prefix) {
                node = node.children[char] ?: return 0
            }
            return node.count
        }
    }
}
