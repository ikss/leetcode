package arrays.medium

/**
 * You are given an array nums that consists of non-negative integers. Let us define rev(x) as the reverse of the
 * non-negative integer x. For example, rev(123) = 321, and rev(120) = 21. A pair of indices (i, j) is nice if it
 * satisfies all of the following conditions:
 * * 0 <= i < j < nums.length
 * * `nums[i] + rev(nums[j]) == nums[j] + rev(nums[i])`
 *
 * Return the number of nice pairs of indices. Since that number can be too large, return it modulo 109 + 7.
 *
 * [URL](https://leetcode.com/problems/count-nice-pairs-in-an-array)
 */
object CountNicePairsInArray {
    fun countNicePairs(nums: IntArray): Int {
        val mod = 1_000_000_007
        val sums = HashMap<Int, Int>()

        var result = 0L
        for (n in nums) {
            val num = n - rev(n)
            sums.merge(num, 1, Integer::sum)
        }

        for ((_, count) in sums) {
            if (count == 1) continue

            result += (count.toLong() * (count - 1)) / 2
        }

        return (result % mod).toInt()
    }

    private fun rev(num: Int): Int {
        var num = num
        var result = 0
        while (num > 0) {
            result = result * 10 + num % 10
            num /= 10
        }
        return result
    }
}
