package medium

/**
 * Design a data structure that supports adding new words and finding if a string matches any previously added string.
 *
 * Implement the WordDictionary class:
 * * WordDictionary() Initializes the object.
 * * void addWord(word) Adds word to the data structure, it can be matched later.
 * * bool search(word) Returns true if there is any string in the data structure that matches word or false otherwise.
 * word may contain dots '.' where dots can be matched with any letter.
 *
 * [URL](https://leetcode.com/problems/design-add-and-search-words-data-structure/)
 */
object DesignAddAndSearchWordsDataStructure {
    private class Trie {
        val children = Array<Trie?>(27) { null }
        var word: String? = null

        fun add(word: String) {
            var node = this
            for (c in word) {
                node = node.getAndSetChildDefault(c)
            }
            node.word = word
        }

        fun getChild(c: Char) = children[c - 'a']

        private fun getAndSetChildDefault(c: Char): Trie {
            val index = c - 'a'
            return children[index] ?: Trie().also { children[index] = it }
        }
    }

    class WordDictionary {
        private val trie = Trie()

        fun addWord(word: String) {
            trie.add(word)
        }

        fun search(word: String): Boolean {
            return check(trie, 0, word)
        }

        private fun check(node: Trie?, index: Int, word: String): Boolean {
            if (node == null) return false
            if (index == word.length) return node.word != null

            val c = word[index]

            if (c == '.') {
                for (child in node.children) {
                    if (check(child, index + 1, word)) {
                        return true
                    }
                }
                return false
            }
            return check(node.getChild(c), index + 1, word)
        }
    }
}