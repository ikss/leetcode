package easy

/**
 * You are given an integer n.
 *
 * Return the total number of commas used when writing all integers from `[1, n]` (inclusive) in standard number formatting.
 *
 * In standard formatting:
 * * A comma is inserted after every three digits from the right.
 * * Numbers with fewer than 4 digits contain no commas.
 *
 * [URL](https://leetcode.com/problems/count-commas-in-range/)
 */
object CountCommasInRange {
    fun countCommas(n: Int): Int {
        var result = 0
        var currCommas = 0
        var curr = 0
        var nextMax = 1_000

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
