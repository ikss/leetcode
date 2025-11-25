package medium

/**
 * You are given an array of positive integers nums of length n.
 *
 * A polygon is a closed plane figure that has at least 3 sides.
 * The longest side of a polygon is smaller than the sum of its other sides.
 *
 * Conversely, if you have k (k >= 3) positive real numbers a1, a2, a3, ..., ak
 * where a1 <= a2 <= a3 <= ... <= ak and a1 + a2 + a3 + ... + ak-1 > ak,
 * then there always exists a polygon with k sides whose lengths are a1, a2, a3, ..., ak.
 *
 * The perimeter of a polygon is the sum of lengths of its sides.
 *
 * Return the largest possible perimeter of a polygon whose sides can be formed from nums,
 * or -1 if it is not possible to create a polygon.
 *
 * [URL](https://leetcode.com/problems/find-polygon-with-the-largest-perimeter/)
 */
object FindPolygonWithTheLargestPerimeter {
    fun largestPerimeterRollingSum(nums: IntArray): Long {
        nums.sort()

        val rollingsum = LongArray(nums.size)

        for (i in nums.indices) {
            rollingsum[i] = nums[i].toLong() + (rollingsum.getOrNull(i - 1) ?: 0)
        }

        for (i in nums.size - 1 downTo 2) {
            if (nums[i] < rollingsum[i - 1]) {
                return rollingsum[i]
            }
        }

        return -1
    }

    fun largestPerimeterSimplified(nums: IntArray): Long {
        nums.sort()

        var prevsum = 0L
        var results = -1L
        for (num in nums) {
            if (num < prevsum) {
                results = num + prevsum
            }
            prevsum += num
        }
        return results
    }
}