package medium

/**
 * A binary string is monotone increasing if it consists of some number of 0's (possibly none),
 * followed by some number of 1's (also possibly none).
 *
 * You are given a binary string s. You can flip `s[i]` changing it from 0 to 1 or from 1 to 0.
 *
 * Return the minimum number of flips to make s monotone increasing.
 *
 * [URL](https://leetcode.com/problems/flip-string-to-monotone-increasing/)
 */
object FlipStringToMonotoneIncreasing {
    fun minFlipsMonoIncr(s: String): Int {
        var res = 0
        var ones = 0
        for (i in s.indices) {
            if (s[i] == '0') {
                res = minOf(res + 1, ones)
            } else {
                ones++
            }
        }

        return res
    }
}