package easy

/**
 * A confusing number is a number that when rotated 180 degrees becomes a different number with each digit valid.
 *
 * We can rotate digits of a number by 180 degrees to form new digits.
 * * When 0, 1, 6, 8, and 9 are rotated 180 degrees, they become 0, 1, 9, 8, and 6 respectively.
 * * When 2, 3, 4, 5, and 7 are rotated 180 degrees, they become invalid.
 * Note that after rotating a number, we can ignore leading zeros.
 *
 * For example, after rotating 8000, we have 0008 which is considered as just 8.
 * Given an integer n, return true if it is a confusing number, or false otherwise.
 *
 * [URL](https://leetcode.com/problems/confusing-number/)
 */
object ConfusingNumber {
    fun confusingNumber(n: Int): Boolean {
        var result = 0
        var num = n

        while (num > 0) {
            val digit = num % 10
            num /= 10

            val reversed = when (digit) {
                0, 1, 8 -> digit
                6 -> 9
                9 -> 6
                else -> return false
            }
            result = result * 10 + reversed
        }
        return n != result
    }
}