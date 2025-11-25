package hard

/**
 * You are given a 0-indexed integer array nums. In one operation you can replace any element of the array
 * with any two elements that sum to it.
 *
 * * For example, consider `nums = [5,6,7]`. In one operation, we can replace `nums[1]` with 2 and 4 and convert
 * nums to `[5,2,4,7]`.
 * Return the minimum number of operations to make an array that is sorted in non-decreasing order.
 *
 * [URL](https://leetcode.com/problems/minimum-replacements-to-sort-the-array/)
 */
object MinimumReplacementsToSortArray {
    fun minimumReplacement(nums: IntArray): Long {
        var result = 0L

        for (i in nums.size - 2 downTo 0) {
            val curr = nums[i]
            val next = nums[i + 1]

            if (curr > next) {
                val elements = (curr - 1) / next + 1
                result += elements - 1
                nums[i] = curr / elements
            }
        }

        return result
    }
}
