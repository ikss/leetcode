package easy

/**
 * Given an array nums, return true if the array was originally sorted in non-decreasing order,
 * then rotated some number of positions (including zero). Otherwise, return false.
 *
 * There may be duplicates in the original array.
 *
 * Note: An array A rotated by x positions results in an array B of the same length such that
 * `A[i] == B[(i+x) % A.length]`, where % is the modulo operation.
 *
 * [URL](https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/)
 */
object CheckIfArrayIsSortedAndRotated {
    fun check(nums: IntArray): Boolean {
        val n = nums.size
        if (n <= 1) return true

        var inversionCount = 0

        for (i in 1..<n) {
            if (nums[i] < nums[i - 1]) {
                ++inversionCount
            }
        }

        if (nums[0] < nums[n - 1]) {
            ++inversionCount
        }

        return inversionCount <= 1
    }
}
