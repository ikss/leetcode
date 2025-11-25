package hard

import java.util.*


/**
 * You are given a string s of length n, and an integer k.
 * You are tasked to find the longest subsequence repeated k times in string s.
 *
 * A subsequence is a string that can be derived from another string by deleting some or no characters without changing
 * the order of the remaining characters.
 *
 * A subsequence seq is repeated k times in the string s if seq * k is a subsequence of s,
 * where seq * k represents a string constructed by concatenating seq k times.
 *
 * * For example, "bba" is repeated 2 times in the string "bababcba", because the string "bbabba",
 * constructed by concatenating "bba" 2 times, is a subsequence of the string "bababcba".
 *
 * Return the longest subsequence repeated k times in string s. If multiple such subsequences are found,
 * return the lexicographically largest one. If there is no such subsequence, return an empty string.
 *
 * [URL](https://leetcode.com/problems/longest-subsequence-repeated-k-times/)
 */
object LongestSubsequenceRepeatedKTimes {

    fun longestSubsequenceRepeatedK(s: String, k: Int): String {
        val freq = IntArray(26)
        for (ch in s) {
            freq[ch - 'a']++
        }
        val candidate: MutableList<Char> = ArrayList()
        for (i in 25 downTo 0) {
            if (freq[i] >= k) {
                candidate.add('a' + i)
            }
        }

        val q: Queue<String> = LinkedList()
        for (ch in candidate) {
            q.add(ch.toString())
        }
        var ans = ""
        while (q.isNotEmpty()) {
            val curr = q.poll()
            if (curr.length > ans.length) {
                ans = curr
            }
            // generate the next candidate string
            for (ch in candidate) {
                val next = curr + ch
                if (isKRepeatedSubsequence(s, next, k)) {
                    q.add(next)
                }
            }
        }

        return ans
    }

    private fun isKRepeatedSubsequence(s: String, t: String, k: Int): Boolean {
        var pos = 0
        var matched = 0
        val m = t.length
        for (ch in s) {
            if (ch != t[pos]) continue
            if (++pos != m) continue
            pos = 0
            matched++
            if (matched == k) {
                return true
            }
        }
        return false
    }
}