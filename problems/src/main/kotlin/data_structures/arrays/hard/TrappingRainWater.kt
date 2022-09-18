package data_structures.arrays.hard

/**
 * Given n non-negative integers representing an elevation map where the width of each bar is 1,
 * compute how much water it can trap after raining.
 *
 * [URL](https://leetcode.com/problems/trapping-rain-water/)
 */
object TrappingRainWater {
    fun trap(height: IntArray): Int {
        var left = 0
        var leftMax = 0
        var right = height.size - 1
        var rightMax = 0
        var ans = 0
        while (left < right) {
            val hLeft = height[left]
            val hRight = height[right]
            if (hLeft < hRight) {
                if (hLeft >= leftMax) {
                    leftMax = hLeft
                } else {
                    ans += leftMax - hLeft
                }
                ++left
            } else {
                if (hRight >= rightMax) {
                    rightMax = hRight
                } else {
                    ans += rightMax - hRight
                }
                --right
            }
        }
        return ans
    }
}
