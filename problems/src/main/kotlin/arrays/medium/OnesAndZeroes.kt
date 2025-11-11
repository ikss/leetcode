package arrays.medium

/**
 * You are given an array of binary strings strs and two integers m and n.
 *
 * Return the size of the largest subset of strs such that there are at most m 0's and n 1's in the subset.
 *
 * A set x is a subset of a set y if all elements of x are also elements of y.
 *
 * [URL](https://leetcode.com/problems/ones-and-zeroes/)
 */
object OnesAndZeroes {
    fun findMaxFormBacktrack(strs: Array<String>, m: Int, n: Int): Int {
        val counts = strs.map { str ->
            val countZeros = str.count { it == '0' }
            val countOnes = str.length - countZeros
            countZeros to countOnes
        }
        return backtrack(counts, 0, m, n, 0, 0)
    }

    private fun backtrack(strs: List<Pair<Int, Int>>, index: Int, m: Int, n: Int, zeroes: Int, ones: Int): Int {
        if (index >= strs.size || zeroes > m || ones > n) return 0
        var result = 0
        val (countZeros, countOnes) = strs[index]
        result = maxOf(
            result, // prev
            backtrack(strs, index + 1, m, n, zeroes, ones), // skip
        )
        if (zeroes + countZeros <= m && ones + countOnes <= n) {
            result = maxOf(
                result,
                1 + backtrack(strs, index + 1, m, n, zeroes + countZeros, ones + countOnes) // take
            )
        }

        return result
    }

    fun findMaxFormBacktrackMemoized(strs: Array<String>, m: Int, n: Int): Int {
        val counts = strs.map { str ->
            val countZeros = str.count { it == '0' }
            val countOnes = str.length - countZeros
            countZeros to countOnes
        }
        val memo = Array(strs.size) { Array(m + 1) { IntArray(n + 1) { -1 } } }
        return backtrack(counts, 0, m, n, 0, 0, memo)
    }

    private fun backtrack(strs: List<Pair<Int, Int>>, index: Int, m: Int, n: Int, zeroes: Int, ones: Int, memo: Array<Array<IntArray>>): Int {
        if (index >= strs.size || zeroes > m || ones > n) return 0
        if (memo[index][zeroes][ones] != -1) return memo[index][zeroes][ones]
        var result = 0
        val (countZeros, countOnes) = strs[index]
        result = maxOf(
            result, // prev
            backtrack(strs, index + 1, m, n, zeroes, ones, memo), // skip
        )
        if (zeroes + countZeros <= m && ones + countOnes <= n) {
            result = maxOf(
                result,
                1 + backtrack(strs, index + 1, m, n, zeroes + countZeros, ones + countOnes, memo) // take
            )
        }
        memo[index][zeroes][ones] = result

        return result
    }

    fun findMaxFormDP(strs: Array<String>, m: Int, n: Int): Int {
        val dp = Array(m + 1) { IntArray(n + 1) { 0 } }
        for (str in strs) {
            val countZeros = str.count { it == '0' }
            val countOnes = str.length - countZeros
            for (i in m downTo countZeros) {
                for (j in n downTo countOnes) {
                    dp[i][j] = maxOf(dp[i][j], 1 + dp[i - countZeros][j - countOnes])
                }
            }
        }

        return dp[m][n]
    }
}
