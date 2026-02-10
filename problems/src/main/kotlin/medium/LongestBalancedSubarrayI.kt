package medium

/**
 * You are given an integer array nums.
 *
 * A subarray is called balanced if the number of distinct even numbers in the subarray is equal
 * to the number of distinct odd numbers.
 *
 * Return the length of the longest balanced subarray.
 *
 * [URL](https://leetcode.com/problems/longest-balanced-subarray-i/
 */
object LongestBalancedSubarrayI {
    fun longestBalanced(nums: IntArray): Int {
        var maxLen = 0

        for (i in nums.indices) {
            val even = HashMap<Int, Int>()
            val odd = HashMap<Int, Int>()

            for (j in i until nums.size) {
                val n = nums[j]
                val map = if ((n and 1) == 1) odd else even
                map[n] = map.getOrDefault(n, 0) + 1

                if (odd.size == even.size) {
                    maxLen = maxOf(maxLen, j - i + 1)
                }
            }
        }

        return maxLen
    }
}
