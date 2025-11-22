package arrays.easy

/**
 * You are given an integer array nums. In one operation, you can add or subtract 1 from any element of nums.
 *
 * Return the minimum number of operations to make all elements of nums divisible by 3.
 *
 * [URL](https://leetcode.com/problems/find-minimum-operations-to-make-all-elements-divisible-by-three/)
 */
object FindMinimumOperationsToMakeAllElementsDivisibleByThree {
    fun minimumOperations(nums: IntArray): Int {
        var result = 0

        for (n in nums) {
            if (n % 3 != 0) result++
        }

        return result
    }
}
