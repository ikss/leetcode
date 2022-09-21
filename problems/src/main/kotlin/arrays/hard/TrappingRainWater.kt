package arrays.hard

/**
 * Given n non-negative integers representing an elevation map where the width of each bar is 1,
 * compute how much water it can trap after raining.
 *
 * [URL](https://leetcode.com/problems/trapping-rain-water/)
 */
object TrappingRainWater {
    fun trap(height: IntArray): Int {
        var result = 0
        var left = 0
        var right = height.size - 1
        var leftMax = 0
        var rightMax = 0

        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] < leftMax) {
                    result += leftMax - height[left]
                } else {
                    leftMax = height[left]
                }
                left++
            } else {
                if (height[right] < rightMax) {
                    result += rightMax - height[right]
                } else {
                    rightMax = height[right]
                }
                right--
            }
        }
        return result
    }
}
