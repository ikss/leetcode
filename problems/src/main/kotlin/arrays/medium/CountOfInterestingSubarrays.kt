package arrays.medium


/**
 * You are given a 0-indexed integer array nums, an integer modulo, and an integer k.
 *
 * Your task is to find the count of subarrays that are interesting.
 *
 * A subarray `nums[l .. r]` is interesting if the following condition holds:
 *
 * Let cnt be the number of indices i in the range [l, r] such that `nums[i] % modulo == k`. Then, cnt % modulo == k.
 * Return an integer denoting the count of interesting subarrays.
 *
 * Note: A subarray is a contiguous non-empty sequence of elements within an array.
 *
 * [URL](https://leetcode.com/problems/count-of-interesting-subarrays/)
 */
object CountOfInterestingSubarrays {

    fun countInterestingSubarrays(nums: List<Int>, modulo: Int, k: Int): Long {
        val n = nums.size
        val cnt = HashMap<Int, Int>()
        var res = 0L
        var prefix = 0
        cnt.put(0, 1)
        
        for (i in 0..<n) {
            prefix += if (nums[i] % modulo == k) 1 else 0
            res += cnt.getOrDefault((prefix - k + modulo) % modulo, 0)
            cnt.put(prefix % modulo, cnt.getOrDefault(prefix % modulo, 0) + 1)
        }
        return res
    }
}
