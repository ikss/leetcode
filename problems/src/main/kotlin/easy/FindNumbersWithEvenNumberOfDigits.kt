package easy

/**
 * Given an array nums of integers, return how many of them contain an even number of digits.
 *
 * [URL](https://leetcode.com/problems/find-numbers-with-even-number-of-digits/)
 */
object FindNumbersWithEvenNumberOfDigits {
    fun findNumbers(nums: IntArray): Int {
        var result = 0
        for (n in nums) {
            if (evenDigits(n)) {
                result++
            }
        }

        return result
    }

    private fun evenDigits(n: Int): Boolean {
        var count = 0
        var n = n

        while (n > 0) {
            n /= 10
            count++
        }

        return count % 2 == 0
    }
}
