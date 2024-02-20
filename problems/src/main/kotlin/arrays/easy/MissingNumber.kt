package arrays.easy

/**
 * Given an array nums containing n distinct numbers in the range [0, n],
 * return the only number in the range that is missing from the array.
 *
 * [URL](https://leetcode.com/problems/missing-number/)
 */
object MissingNumber {
    fun missingNumber(nums: IntArray): Int {
        var sum = nums.size
        nums.forEachIndexed { index, it ->
            sum += index - it
        }
        return sum
    }

    fun missingNumberGauss(nums: IntArray): Int {
        val size = nums.size
        val expected = size * (size + 1) / 2
        val actual = nums.sum()

        return expected - actual
    }
}
