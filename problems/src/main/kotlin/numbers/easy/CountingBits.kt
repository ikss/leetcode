package numbers.easy

/**
 * Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n),
 * `ans[i]` is the number of 1's in the binary representation of i.
 *
 * [URL](https://leetcode.com/problems/counting-bits/)
 */
object CountingBits {
    fun countBits(n: Int): IntArray {
        val result = IntArray(n + 1)

        for (i in result.indices) {
            result[i] = result[i / 2] + i % 2
        }

        return result
    }
}