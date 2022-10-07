package strings.medium

/**
 * A valid encoding of an array of words is any reference string s and array of indices such that:
 *
 * * words.length == indices.length
 * * The reference string s ends with the '#' character.
 * * For each index indices`[i]`, the substring of s starting from indices`[i]` and up to (but not including) the next '#' character is equal to words[i].
 *
 * Given an array of words, return the length of the shortest reference string s possible of any valid encoding of words.
 *
 * [URL](https://leetcode.com/problems/decode-ways/)
 */
object ShortEncodingOfWords {
    internal class TrieNode {
        private var children: Array<TrieNode?> = arrayOfNulls(26)
        var count: Int = 0

        operator fun get(c: Char): TrieNode? {
            val index = c - 'a'
            if (children[index] == null) {
                children[index] = TrieNode()
                count++
            }
            return children[index]
        }
    }

    fun minimumLengthEncoding(words: Array<String>): Int {
        val trie = TrieNode()
        val nodes = mutableMapOf<TrieNode, Int>()
        for (i in words.indices) {
            val word = words[i]
            var cur: TrieNode = trie
            for (j in word.length - 1 downTo 0) {
                cur = cur[word[j]]!!
            }
            nodes[cur] = i
        }
        var ans = 0
        for (node in nodes.keys) {
            if (node.count == 0) {
                ans += words[nodes[node]!!].length + 1
            }
        }
        return ans
    }
}
