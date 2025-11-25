package medium

/**
 * You are given a string s consisting only of characters 'a' and 'b'
 *
 * You can delete any number of characters in s to make s balanced. s is balanced if there is no pair of indices (i,j)
 * such that i < j and `s[i] = 'b' and s[j]= 'a'`.
 *
 * Return the minimum number of deletions needed to make s balanced.
 *
 * [URL](https://leetcode.com/problems/minimum-deletions-to-make-string-balanced/)
 */
object MinimumDeletionsToMakeStringBalanced {
    fun minimumDeletionsThreePass(s: String): Int {
        val bCount = IntArray(s.length)
        val aCount = IntArray(s.length)

        for (i in 1 until bCount.size) {
            bCount[i] = bCount[i - 1]
            if (s[i - 1] == 'b') bCount[i]++
        }

        for (i in aCount.size - 2 downTo 0) {
            aCount[i] = aCount[i + 1]
            if (s[i + 1] == 'a') aCount[i]++
        }

        var result = bCount.size

        for (i in bCount.indices) {
            result = minOf(result, bCount[i] + aCount[i])
        }

        return result
    }

    fun minimumDeletionsDp1D(s: String): Int {
        val n = s.length
        val dp = IntArray(n + 1)

        var bCount = 0
        for (i in s.indices) {
            if (s[i] == 'b') {
                dp[i + 1] = dp[i]
                bCount++                
            } else {
                dp[i + 1] = minOf(dp[i] + 1, bCount)
            }
        }

        return dp[n]
    }

    fun minimumDeletionsDp(s: String): Int {
        var bCount = 0
        var prev = 0
        var curr = 0
        for (i in s.indices) {
            if (s[i] == 'b') {
                curr = prev
                bCount++
            } else {
                curr = minOf(prev + 1, bCount)
            }
            prev = curr
        }

        return curr
    }
}
