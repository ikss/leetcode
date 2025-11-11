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
    fun findMaxForm(strs: Array<String>, m: Int, n: Int): Int {
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
}
