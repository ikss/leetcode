package medium

import java.util.*

/**
 * You are given two integers num1 and num2 representing an inclusive range `[num1, num2]`.
 *
 * The waviness of a number is defined as the total count of its peaks and valleys:
 * * A digit is a peak if it is strictly greater than both of its immediate neighbors.
 * * A digit is a valley if it is strictly less than both of its immediate neighbors.
 * * The first and last digits of a number cannot be peaks or valleys.
 * * Any number with fewer than 3 digits has a waviness of 0.
 *
 * Return the total sum of waviness for all numbers in the range `[num1, num2]`.than 2^31 - 1,
 * then return 2^31 - 1, and if the quotient is strictly less than -2^31, then return -2^31.
 *
 * [URL](https://leetcode.com/problems/total-waviness-of-numbers-in-range-i/)
 */
object TotalWavinessOfNumbersInRangeI {

    fun totalWaviness(num1: Int, num2: Int): Int {
        val num2Waviness = solve(num2)
        val num1Waviness = solve(num1 - 1)

        return (num2Waviness - num1Waviness).toInt()
    }

    // calculate the sum of the volatility values of all numbers in the range [0, num]
    private fun solve(num: Int): Long {
        // if the number is less than 3, the fluctuation value is 0
        if (num < 100) {
            return 0L
        }
        val s = num.toString()
        val n = s.length

        // memoized search uses two independent arrays
        // memo_cnt[pos][x][y]: the number of valid filling schemes where the current position is pos, and the previous two positions are x, y
        val memoCnt = Array(16) { Array(10) { LongArray(10) } }
        // memo_sum[pos][x][y]: the fluctuation value when the current position is pos and the two left digits are x and y
        val memoSum = Array(16) { Array(10) { LongArray(10) } }

        for (i in 0..15) {
            for (j in 0..9) {
                Arrays.fill(memoCnt[i][j], -1)
                Arrays.fill(memoSum[i][j], -1)
            }
        }

        val result = dfs(0, -1, -1, true, true, s, n, memoCnt, memoSum)
        return result[1]
    }

    private fun dfs(
        pos: Int,
        prev: Int,
        curr: Int,
        isLimit: Boolean,
        isLeading: Boolean,
        s: String,
        n: Int,
        memoCnt: Array<Array<LongArray>>,
        memoSum: Array<Array<LongArray>>,
    ): LongArray {
        // end position
        if (pos == n) {
            return longArrayOf(1L, 0L)
        }
        // only use memoization when not limited by an upper bound and not containing leading zeros
        if (!isLimit && !isLeading && prev >= 0 && curr >= 0) {
            if (memoCnt[pos][prev][curr] != -1L) {
                return longArrayOf(memoCnt[pos][prev][curr], memoSum[pos][prev][curr])
            }
        }

        // calculate the number of solutions and volatility value under current conditions
        var cnt: Long = 0
        var sum: Long = 0
        val up = if (isLimit) (s[pos] - '0') else 9
        for (digit in 0..up) {
            val newLeading = isLeading && (digit == 0)
            // the previous number is updated to curr
            val newPrev = curr
            // the current number is updated to digit
            val newCurr = if (newLeading) -1 else digit
            val newLimit = isLimit && (digit == up)
            val sub = dfs(pos + 1, newPrev, newCurr, newLimit, newLeading, s, n, memoCnt, memoSum)
            val subCnt = sub[0]
            val subSum = sub[1]
            // only calculate the volatility value when there are no leading zeros
            if (!newLeading && prev >= 0 && curr >= 0) {
                // when the value is a peak or a trough, update the current fluctuation value
                if ((prev < curr && curr > digit) || (prev > curr && curr < digit)) {
                    sum += subCnt
                }
            }

            cnt += subCnt
            sum += subSum
        }

        if (!isLimit && !isLeading && prev >= 0 && curr >= 0) {
            // update the memoization array
            memoCnt[pos][prev][curr] = cnt
            memoSum[pos][prev][curr] = sum
        }

        return longArrayOf(cnt, sum)
    }
}
