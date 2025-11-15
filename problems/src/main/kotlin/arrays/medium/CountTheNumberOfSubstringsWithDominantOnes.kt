package arrays.medium

/**
 * You are given a binary string s.
 *
 * Return the number of substrings with dominant ones.
 *
 * A string has dominant ones if the number of ones in the string is greater than or equal to the square of the number
 * of zeros in the string.
 *
 * [URL](https://leetcode.com/problems/count-the-number-of-substrings-with-dominant-ones/)
 */
object CountTheNumberOfSubstringsWithDominantOnes {

    fun numberOfSubstrings(s: String): Int {
        val n = s.length
        val pre = IntArray(n + 1)
        pre[0] = -1
        for (i in 0..<n) {
            if (i == 0 || (s[i - 1] == '0')) {
                pre[i + 1] = i
            } else {
                pre[i + 1] = pre[i]
            }
        }
        var result = 0
        for (i in 1..n) {
            var zeroes = if (s[i - 1] == '0') 1 else 0
            var j = i
            while (j > 0 && zeroes * zeroes <= n) {
                val cnt1 = i - pre[j] - zeroes
                if (zeroes * zeroes <= cnt1) {
                    result += minOf(j - pre[j], cnt1 - zeroes * zeroes + 1)
                }
                j = pre[j]
                zeroes++
            }
        }
        return result
    }
}
