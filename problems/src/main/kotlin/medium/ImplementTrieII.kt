package medium

/**
 * A trie (pronounced as "try") or prefix tree is a tree data structure used to efficiently store and retrieve keys in
 * a dataset of strings. There are various applications of this data structure, such as autocomplete and spellchecker.
 *
 * Implement the Trie class:
 * * Trie() Initializes the trie object.
 * * void insert(String word) Inserts the string word into the trie.
 * * int countWordsEqualTo(String word) Returns the number of instances of the string word in the trie.
 * * int countWordsStartingWith(String prefix) Returns the number of strings in the trie that have the string prefix
 * as a prefix.
 * * void erase(String word) Erases the string word from the trie.
 *
 * [URL](https://leetcode.com/problems/implement-trie-ii-prefix-tree/)
 */
object ImplementTrieII {
    class Trie {
        private class TrieNode {
            val nodes = Array<TrieNode?>(26) { null }
            var count = 0
            var isWord = false
        }

        private val head = TrieNode()

        fun insert(word: String) {
            var node = head

            for (c in word) {
                var curr = node.nodes[c - 'a']
                if (curr == null) {
                    curr = TrieNode()
                    node.nodes[c - 'a'] = curr
                }
                node = curr
            }
            node.count++
            node.isWord = true
        }

        fun countWordsEqualTo(word: String): Int {
            var node = head

            for (c in word) {
                val curr = node.nodes[c - 'a']
                    ?: return 0
                node = curr
            }
            return if (node.isWord) node.count else 0
        }

        fun countWordsStartingWith(prefix: String): Int {
            var node = head

            for (c in prefix) {
                val curr = node.nodes[c - 'a']
                    ?: return 0
                node = curr
            }

            val queue = java.util.ArrayDeque<TrieNode>()

            queue.offer(node)

            var result = 0
            while (queue.isNotEmpty()) {
                val curr = queue.poll()
                result += curr.count
                for (next in curr.nodes) {
                    next?.let(queue::offer)
                }

            }
            return result
        }

        fun erase(word: String) {
            var node = head

            for (c in word) {
                val curr = node.nodes[c - 'a']
                    ?: return
                node = curr
            }
            if (!node.isWord) return
            node.count--
            if (node.count == 0) {
                node.isWord = false
            }
        }

    }
}