package medium

import java.util.*

/**
 * Given a string s and an array of strings words, return the number of `words[i]` that is a subsequence of s.
 *
 * A subsequence of a string is a new string generated from the original string with some characters (can be none)
 * deleted without changing the relative order of the remaining characters.
 * * For example, "ace" is a subsequence of "abcde".
 *
 * [URL](https://leetcode.com/problems/number-of-matching-subsequences/)
 */
object NumberOfMatchingSubsequences {
    fun numMatchingSubseq(s: String, words: Array<String>): Int {
        val map = Array(26) { LinkedList<CharIterator>() }

        for (word in words) {
            val iterator = word.iterator()
            map[iterator.next() - 'a'].offer(iterator)
        }

        var count = 0
        for (c in s.toCharArray()) {
            val queue = map[c - 'a']
            repeat(queue.size) {
                val word = queue.pop()
                if (word.hasNext()) {
                    map[word.next() - 'a'].offer(word)
                } else {
                    count++
                }
            }
        }
        return count
    }
}
