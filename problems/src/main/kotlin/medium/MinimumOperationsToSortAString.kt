package medium

import kotlin.math.max
import kotlin.math.min

/**
 * You are given a string s consisting of lowercase English letters.
 *
 * In one operation, you can select any substring of s that is not the entire string and sort it in non-descending alphabetical order.
 *
 * Return the minimum number of operations required to make s sorted in non-descending order.
 * If it is not possible, return -1.
 *
 * [URL](https://leetcode.com/problems/minimum-operations-to-sort-a-string/)
 */
object MinimumOperationsToSortAString {

    fun minOperations(s: String): Int {
        val n = s.length
        var mx = 'a'
        var mn = 'z'
        var sorted = true
        for (i in 0..<n) {
            mx = maxOf(mx, s[i])
            mn = minOf(mn, s[i])
            if (i > 0 && s[i - 1] > s[i]) {
                sorted = false
            }
        }
        if (sorted) {
            return 0
        }
        if (n == 2) {
            return -1
        }
        if (s[0] == mn || s[n - 1] == mx) {
            return 1
        }
        for (i in 1..<n - 1) {
            if (s[i] == mn || s[i] == mx) {
                return 2
            }
        }
        return 3
    }
}
