package numbers.easy

/**
 * Given two non-negative integers low and high. Return the count of odd numbers between low and high (inclusive).
 *
 * [URL](https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/)
 */
object CountOddNumbersInAnIntervalRange {
    fun countOddsMy(low: Int, high: Int): Int {
        var result = 0
        if (low % 2 != 0) {
            result++
        }
        if (high % 2 != 0) {
            result++
        }

        return result + (high - low - result) / 2
    }

    fun countOddsOfficial(low: Int, high: Int): Int {
        // If low is even, make it odd.
        var low = low
        if (low and 1 == 0) {
            low++
        }

        // low could become greater than high due to incrementation
        // if it is, the answer is 0; otherwise, use the formula.
        return if (low > high) 0 else (high - low) / 2 + 1
    }
}
