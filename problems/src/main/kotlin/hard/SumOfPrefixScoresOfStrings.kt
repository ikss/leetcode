package hard

/**
 * You are given an array words of size n consisting of non-empty strings.
 *
 * We define the score of a string word as the number of strings `words[i]` such that word is a prefix of `words[i]`.
 *
 * For example, if words = ["a", "ab", "abc", "cab"], then the score of "ab" is 2, since "ab" is a prefix of both "ab" and "abc".
 * Return an array answer of size n where `answer[i]` is the sum of scores of every non-empty prefix of `words[i]`.
 *
 * Note that a string is considered as a prefix of itself.
 *
 * [URL](https://leetcode.com/problems/sum-of-prefix-scores-of-strings/)
 */
object SumOfPrefixScoresOfStrings {
    private class TrieNode {
        val children = Array<TrieNode?>(26) { null }
        var count = 0
    }

    fun sumPrefixScores(words: Array<String>): IntArray {
        val head = TrieNode()

        for (w in words) {
            var node = head
            for (c in w) {
                var curr = node.children[c - 'a']
                if (curr == null) {
                    curr = TrieNode()
                    node.children[c - 'a'] = curr
                }
                curr.count++
                node = curr
            }
        }

        val result = IntArray(words.size)

        for (i in words.indices) {
            var node = head
            var sum = 0
            for (c in words[i]) {
                node = node.children[c - 'a'] ?: break
                sum += node.count
            }
            result[i] = sum
        }

        return result
    }
}