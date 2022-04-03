package collections.arrays.medium

/**
 * Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai).
 * n vertical lines are drawn such that the two endpoints of the line i is at (i, ai) and (i, 0).
 * Find two lines, which, together with the x-axis forms a container, such that the container contains the most water.
 *
 * [URL](https://leetcode.com/problems/container-with-most-water/)
 */
object ContainerWithMostWater {
    fun maxArea(height: IntArray): Int {
        var left = 0
        var max = 0
        var right = height.size - 1
        while (right > left) {
            val area = Math.min(height[left], height[right]) * (right - left)
            if (area > max) {
                max = area
            }
            if (height[left] > height[right]) {
                right--
            } else {
                left++
            }
        }
        return max
    }

}
