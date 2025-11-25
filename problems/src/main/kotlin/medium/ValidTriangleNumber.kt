package medium


/**
 * Given an integer array nums, return the number of triplets chosen from the array that can make triangles if
 * we take them as side lengths of a triangle.
 *
 * [URL](https://leetcode.com/problems/valid-triangle-number/)
 */
object ValidTriangleNumber {
    fun triangleNumberCubic(nums: IntArray): Int {
        var result = 0

        for (i in 0 until nums.size - 2) {
            for (j in i + 1 until nums.size - 1) {
                for (k in j + 1 until nums.size) {
                    if (valid(nums[i], nums[j], nums[k])) {
                        result++
                    }
                }
            }
        }

        return result
    }

    private fun valid(i: Int, j: Int, k: Int): Boolean {
        return i + j > k && i + k > j && j + k > i
    }

    fun triangleNumberLinear(nums: IntArray): Int {
        var result = 0
        nums.sort()

        for (i in 0..<nums.size - 2) {
            var k = i + 2
            var j = i + 1
            while (j < nums.size - 1 && nums[i] != 0) {
                while (k < nums.size && nums[i] + nums[j] > nums[k]) k++
                result += k - j - 1
                j++
            }
        }
        return result
    }
}
