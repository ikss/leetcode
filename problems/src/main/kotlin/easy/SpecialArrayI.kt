package easy

/**
 * An array is considered special if every pair of its adjacent elements contains two numbers with different parity.
 *
 * You are given an array of integers nums. Return true if nums is a special array, otherwise, return false.
 *
 * [URL](https://leetcode.com/problems/can-place-flowers/)
 */
object SpecialArrayI {
    fun isArraySpecial(nums: IntArray): Boolean {
        for (i in 1 until nums.size) {
            if (nums[i - 1] % 2 == nums[i] % 2) {
                return false
            }
        }
        return true
    }
}
