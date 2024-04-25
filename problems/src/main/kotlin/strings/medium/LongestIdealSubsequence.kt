package strings.medium

/**
 * You are given a string s consisting of lowercase letters and an integer k.
 * We call a string t ideal if the following conditions are satisfied:
 * * t is a subsequence of the string s.
 * * The absolute difference in the alphabet order of every two adjacent letters in t is less than or equal to k.
 *
 * Return the length of the longest ideal string.
 *
 * A subsequence is a string that can be derived from another string by deleting some or no characters
 * without changing the order of the remaining characters.
 *
 * Note that the alphabet order is not cyclic.
 * For example, the absolute difference in the alphabet order of 'a' and 'z' is 25, not 1.
 *
 * [URL](https://leetcode.com/problems/longest-ideal-subsequence/)
 */
object LongestIdealSubsequence {
    fun longestIdealString(s: String, k: Int): Int {
        val arr = IntArray(26)

        for (c in s) {
            val i = c - 'a'
            var max = arr[i]
            for (d in maxOf(0, i - k) .. minOf(25, i + k)) {
                val curr = arr[d]
                if (curr == 0) continue

                max = maxOf(curr, max)
            }
            arr[i] = max + 1
        }

        return arr.max()
    }
}
