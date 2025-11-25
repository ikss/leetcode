package easy

/**
 * Given a positive integer num, return the number of positive integers less than
 * or equal to num whose digit sums are even.
 *
 * The digit sum of a positive integer is the sum of all its digits.
 *
 * [URL](https://leetcode.com/problems/count-integers-with-even-digit-sum/)
 */
object CountIntegersWithEvenDigitSum {
    fun countEven(num: Int): Int {
        var temp = num
        var sum = 0

        while (temp > 0) {
            sum += temp % 10
            temp /= 10
        }
        return if (sum % 2 == 0) num / 2 else (num - 1) / 2
    }
}
