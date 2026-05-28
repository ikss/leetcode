package hard

/**
 * You are given two arrays of strings wordsContainer and wordsQuery.
 *
 * For each `wordsQuery[i]`, you need to find a string from wordsContainer that has the longest common suffix with
 * `wordsQuery[i]`. If there are two or more strings in wordsContainer that share the longest common suffix,
 * find the string that is the smallest in length. If there are two or more such strings that have the same smallest length, find the one that occurred earlier in wordsContainer.
 *
 * Return an array of integers ans, where `ans[i]` is the index of the string in wordsContainer
 * that has the longest common suffix with `wordsQuery[i]`.
 *
 * [URL](https://leetcode.com/problems/longest-common-suffix-queries/)
 */
object LongestCommonSuffixQueries {
    fun stringIndices(wordsContainer: Array<String>, wordsQuery: Array<String>): IntArray {
        val trie = ReverseTrie()
        for (i in wordsContainer.indices) {
            trie.add(wordsContainer[i], i)
        }

        val result = IntArray(wordsQuery.size)

        for (i in wordsQuery.indices) {
            result[i] = trie.search(wordsQuery[i])
        }
        return result
    }


    private class ReverseTrie {
        private data class TrieNode(
            var index: Int,
            var length: Int,
        ) {
            val children = Array<TrieNode?>(26) { null }
        }

        val root = TrieNode(-1, Int.MAX_VALUE)

        fun add(word: String, index: Int) {
            val l = word.length
            var currNode = root
            for (i in l - 1 downTo 0) {
                if (l < currNode.length || (l == currNode.length && index < currNode.index)) {
                    currNode.length = l
                    currNode.index = index
                }
                var nextNode = currNode.children[word[i] - 'a']
                if (nextNode == null) {
                    nextNode = TrieNode(index, l)
                    currNode.children[word[i] - 'a'] = nextNode
                }

                currNode = nextNode
            }
            if (l < currNode.length || (l == currNode.length && index < currNode.index)) {
                currNode.length = l
                currNode.index = index
            }
        }

        fun search(word: String): Int {
            val l = word.length
            var currNode = root

            for (i in l - 1 downTo 0) {
                val nextNode = currNode.children[word[i] - 'a'] ?: break
                currNode = nextNode
            }
            return currNode.index
        }
    }
}
