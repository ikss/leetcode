package medium

/**
 * You are given an integer array banned and two integers n and maxSum.
 * You are choosing some number of integers following the below rules:
 * The chosen integers have to be in the range `[1, n]`.
 * Each integer can be chosen at most once.
 * The chosen integers should not be in the array banned.
 * The sum of the chosen integers should not exceed maxSum.
 *
 * Return the maximum number of integers you can choose following the mentioned rules.
 *
 * [URL](https://leetcode.com/problems/maximum-number-of-integers-to-choose-from-a-range-i/)
 */
object MaximumNumberOfIntegersToChooseFromRangeI {
    fun maxCount(banned: IntArray, n: Int, maxSum: Int): Int {
        val bannedNums = banned.toSet()
        var result = 0
        var sum = 0
        for (i in 1..n) {
            if (i in bannedNums) continue
            sum += i
            if (sum > maxSum) break
            result++
        }
        return result
    }
}
