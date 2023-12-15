package arrays.medium

/**
 * You are given a 0-indexed array nums of n integers, and an integer k.
 *
 * The k-radius average for a subarray of nums centered at some index i with the radius k is the average of all elements
 * in nums between the indices i - k and i + k (inclusive). If there are less than k elements before
 * or after the index i, then the k-radius average is -1.
 *
 * Build and return an array avgs of length n where `avgs[i]` is the k-radius average for the subarray
 * centered at index i.
 *
 * The average of x elements is the sum of the x elements divided by x, using integer division.
 * The integer division truncates toward zero, which means losing its fractional part.
 * * For example, the average of four elements 2, 3, 1, and 5 is (2+3+1+5)/4 = 11/4 = 2.75, which truncates to 2.
 *
 * [URL](https://leetcode.com/problems/k-radius-subarray-averages/)
 */
object KRadiusSubarrayAverages {
    fun getAverages(nums: IntArray, k: Int): IntArray {
        val n = nums.size
        val l = 2 * k + 1

        val result = IntArray(n) { -1 }
        if (l > n) return result

        var sum = 0L
        for (i in 0 until l - 1) {
            sum += nums[i]
        }

        for (i in k until n - k) {
            sum += nums[i + k]
            result[i] = (sum / l).toInt()
            sum -= nums[i - k]
        }

        return result
    }
}
