package medium

/**
 * You are given an integer n.
 *
 * Return the total number of commas used when writing all integers from `[1, n]` (inclusive) in standard number formatting.
 *
 * In standard formatting:
 * * A comma is inserted after every three digits from the right.
 * * Numbers with fewer than 4 digits contain no commas.
 *
 * [URL](https://leetcode.com/problems/count-commas-in-range-ii/)
 */
object CountCommasInRangeII {
    fun countCommas(n: Long): Long {
        var result = 0L
        var currCommas = 0L
        var curr = 0L
        var nextMax = 1_000L

        while (n * 1000 >= nextMax) {
            val upperBound = minOf(n, nextMax)

            result += (upperBound - curr + 1) * currCommas

            currCommas++
            curr = nextMax
            nextMax *= 1000
        }


        return result
    }
}
