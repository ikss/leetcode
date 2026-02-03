package easy

/**
 * You are given an integer array nums of length n.
 *
 * An array is trionic if there exist indices 0 < p < q < n − 1 such that:
 * * `nums[0...p]` is strictly increasing,
 * * `nums[p...q]` is strictly decreasing,
 * * `nums[q...n − 1]` is strictly increasing.
 *
 * Return true if nums is trionic, otherwise return false.
 *
 * [URL](https://leetcode.com/problems/trionic-array-i/)
 */
object TrionicArrayI {
    fun isTrionic(nums: IntArray): Boolean {
        var phase = 0

        for (i in 0 until nums.size - 1) {
            if (nums[i] == nums[i + 1]) {
                return false
            } else if (nums[i] < nums[i + 1]) {
                if (phase == 0 || phase == 1) {
                    phase = 1
                } else {
                    phase = 3
                }
            } else {
                if (phase == 1 || phase == 2) {
                    phase = 2
                } else {
                    return false
                }
            }
        }
        return phase == 3
    }
}