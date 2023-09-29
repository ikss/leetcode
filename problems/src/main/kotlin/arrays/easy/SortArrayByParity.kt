package arrays.easy

/**
 * Given an integer array nums, move all the even integers at the beginning of the array
 * followed by all the odd integers.
 *
 * Return any array that satisfies this condition.
 *
 * [URL](https://leetcode.com/problems/sort-array-by-parity/)
 */
object SortArrayByParity {
    fun sortArrayByParity(nums: IntArray): IntArray {
        var i = 0
        var j = nums.size - 1
        while (i < j) {
            if (nums[i] % 2 > nums[j] % 2) {
                val tmp = nums[i]
                nums[i] = nums[j]
                nums[j] = tmp
            }
            if (nums[i] % 2 == 0) i++
            if (nums[j] % 2 == 1) j--
        }
        return nums
    }
}
