package arrays.medium


/**
 * You are given an array nums consisting of positive integers.
 *
 * A special subsequence is defined as a subsequence of length 4, represented by indices (p, q, r, s),
 * where p < q < r < s. This subsequence must satisfy the following conditions:
 * * `nums[p] * nums[r] == nums[q] * nums[s]`
 * * There must be at least one element between each pair of indices.
 * In other words, q - p > 1, r - q > 1 and s - r > 1.
 *
 * Return the number of different special subsequences in nums.
 *
 * [URL](https://leetcode.com/problems/count-special-subsequences/)
 */
object CountSpecialSubsequences {
    fun numberOfSubsequences(nums: IntArray): Long {
        val n = nums.size
        val counts = HashMap<Double, Long>()

        var result = 0L

        for (q in 2 until n - 4) {
            val r = q + 2

            for (p in 0 until q - 1) {
                val key = nums[p].toDouble() / nums[q]

                counts.merge(key, 1, Long::plus)
            }
            for (s in r + 2 until n) {
                val key = nums[s].toDouble() / nums[r]

                result += counts.getOrDefault(key, 0)
            }
        }

        return result
    }
}
