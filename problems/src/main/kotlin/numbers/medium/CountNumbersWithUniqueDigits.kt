package numbers.medium

/**
 * Given an integer n, return the count of all numbers with unique digits, x, where 0 <= x < 10n.
 *
 * [URL](https://leetcode.com/problems/count-numbers-with-unique-digits/)
 */
object CountNumbersWithUniqueDigits {
    fun countNumbersWithUniqueDigits(n: Int): Int {
        if (n == 0) return 1
        
        var n = n
        var result = 10
        var uniqueNumbers = 9
        var availableNumber = 9
        
        while (n-- > 1 && availableNumber > 0) {
            uniqueNumbers *= availableNumber
            result += uniqueNumbers
            availableNumber--
        }
        
        return result
    }
}