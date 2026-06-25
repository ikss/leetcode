package hard

/**
 * You are given an integer array nums and an integer target.
 *
 * Return the number of subarrays of nums in which target is the majority element.
 *
 * The majority element of a subarray is the element that appears strictly more than half of the times in that subarray.
 *
 * [URL](https://leetcode.com/problems/count-subarrays-with-majority-element-ii/)
 */
object CountSubarraysWithMajorityElementII {

    fun countMajoritySubarrays(nums: IntArray, target: Int): Long {
        val n = nums.size
        val pre = IntArray(n * 2 + 1)
        pre[n] = 1
        var cnt = n
        var result = 0L
        var presum = 0L
        for (i in 0..<n) {
            if (nums[i] == target) {
                presum += pre[cnt]
                ++cnt
                ++pre[cnt]
            } else {
                --cnt
                presum -= pre[cnt]
                ++pre[cnt]
            }
            result += presum
        }
        return result
    }
}
