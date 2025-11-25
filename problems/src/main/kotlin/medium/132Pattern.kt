package medium

/**
 * Given an array of n integers nums, a 132 pattern is a subsequence of three integers `nums[i]`,`nums[j]` and `nums[k]`
 * such that i < j < k and `nums[i] < nums[k] < nums[j]`.
 *
 * Return true if there is a 132 pattern in nums, otherwise, return false.
 *
 * [URL](https://leetcode.com/problems/132-pattern/)
 */
object `132Pattern` {
    fun find132pattern(nums: IntArray): Boolean {
        if (nums.size < 3) return false

        val min = IntArray(nums.size)
        min[0] = nums[0]
        for (i in 1 until nums.size) {
            min[i] = minOf(min[i - 1], nums[i])
        }
        var j = nums.size - 1
        var k = nums.size
        while (j >= 0) {
            if (nums[j] > min[j]) {
                while (k < nums.size && nums[k] <= min[j]) k++
                if (k < nums.size && nums[k] < nums[j]) {
                    return true
                }
                nums[--k] = nums[j]
            }
            j--
        }
        return false
    }
}
