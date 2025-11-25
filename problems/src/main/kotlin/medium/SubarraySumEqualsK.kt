package medium

/**
 * Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.
 *
 * A subarray is a contiguous non-empty sequence of elements within an array.
 *
 * [URL](https://leetcode.com/problems/subarray-sum-equals-k/)
 */
object SubarraySumEqualsK {
    fun subarraySum(nums: IntArray, k: Int): Int {
        val map = HashMap<Int, Int>()
        map[0] = 1

        var sum = 0
        var result = 0
        for (n in nums) {
            sum += n
            result += map.getOrDefault(sum - k, 0)

            map.merge(sum, 1, Int::plus)
        }

        return result
    }
}
