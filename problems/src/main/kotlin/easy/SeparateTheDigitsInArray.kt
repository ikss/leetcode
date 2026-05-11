package easy

/**
 * Given an array of positive integers nums, return an array answer that consists of the digits of each integer in nums after separating them in the same order they appear in nums.
 *
 * To separate the digits of an integer is to get all the digits it has in the same order.
 *
 * * For example, for the integer 10921, the separation of its digits is [1,0,9,2,1].
 *
 * [URL](https://leetcode.com/problems/separate-the-digits-in-an-array/)
 */
object SeparateTheDigitsInArray {
    fun separateDigits(nums: IntArray): IntArray {
        val digits = ArrayList<Int>()

        for (i in nums.size - 1 downTo 0) {
            var n = nums[i]
            while (n > 0) {
                digits.add(n % 10)
                n /= 10
            }
        }
        val n = digits.size
        return IntArray(n) { digits[n - 1 - it] }
    }
}
