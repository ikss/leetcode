package easy

/**
 * Given an array nums of n integers and an integer k, determine whether there exist two adjacent subarrays of length k
 * such that both subarrays are strictly increasing.
 * Specifically, check if there are two subarrays starting at indices a and b (a < b), where:
 * * Both subarrays nums[a..a + k - 1] and nums[b..b + k - 1] are strictly increasing.
 * * The subarrays must be adjacent, meaning b = a + k.
 *
 * Return true if it is possible to find two such subarrays, and false otherwise.
 *
 * [URL](https://leetcode.com/problems/adjacent-increasing-subarrays-detection-i/)
 */
object AdjacentIncreasingSubarraysDetectionI {
    fun hasIncreasingSubarrays(nums: List<Int>, k: Int): Boolean {
        if (k == 1) return true
        var prevLength = 0
        var currLength = 1

        for (i in 1 until nums.size) {
            if (nums[i] > nums[i - 1]) {
                currLength++
                continue
            }
            if ((prevLength >= k && currLength >= k) || currLength >= k * 2) {
                return true
            }
            prevLength = currLength
            currLength = 1
        }
        if ((prevLength >= k && currLength >= k) || currLength >= k * 2) {
            return true
        }

        return false
    }
}
