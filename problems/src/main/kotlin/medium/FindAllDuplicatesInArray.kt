package medium

/**
 * Given an integer array nums of length n where all the integers of nums are in the range `[1, n]` and each integer
 * appears once or twice, return an array of all the integers that appears twice.
 *
 * You must write an algorithm that runs in O(n) time and uses only constant extra space.
 *
 * [URL](https://leetcode.com/problems/find-all-duplicates-in-an-array/)
 */
object FindAllDuplicatesInArray {
    fun findDuplicates(nums: IntArray): List<Int> {
        val result = ArrayList<Int>()

        for (n in nums) {
            val absn = Math.abs(n)
            if (nums[absn - 1] < 0) {
                result.add(absn)
            } else {
                nums[absn - 1] = -nums[absn - 1]
            }
        }

        return result
    }
}
