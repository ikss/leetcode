package medium

/**
 * Given an integer array nums and an integer k, you are asked to construct the array ans of size n-k+1 where `ans[i]`
 * is the number of distinct numbers in the subarray `nums[i:i+k-1] = [nums[i], nums[i+1], ..., nums[i+k-1]]`.
 *
 * Return the array ans.
 *
 * [URL](https://leetcode.com/problems/distinct-numbers-in-each-subarray/)
 */
object DistinctNumbersInEachSubarray {
    fun distinctNumbers(nums: IntArray, k: Int): IntArray {
        val n = nums.size
        val result = IntArray(n - k + 1)
        val map = HashMap<Int, Int>()

        for (i in 0 until k) {
            map[nums[i]] = map.getOrDefault(nums[i], 0) + 1
        }
        result[0] = map.size

        for (i in k until n) {
            val prev = map[nums[i - k]]!!
            if (prev == 1) {
                map.remove(nums[i - k])
            } else {
                map[nums[i - k]] = prev - 1
            }
            map[nums[i]] = map.getOrDefault(nums[i], 0) + 1

            result[i - k + 1] = map.size
        }

        return result
    }

}