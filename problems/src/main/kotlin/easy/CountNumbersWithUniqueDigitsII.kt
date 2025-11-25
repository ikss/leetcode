package easy

/**
 * Given two positive integers a and b, return the count of numbers having unique digits in the range `[a, b]` (inclusive).
 *
 * [URL](https://leetcode.com/problems/count-numbers-with-unique-digits-ii/)
 */
object CountNumbersWithUniqueDigitsII {
    fun numberCount(a: Int, b: Int): Int {
        var result = 0

        for (n in a .. b) {
            if (hasUnique(n)) {
                result++
            }
        }

        return result
    }

    private fun hasUnique(n: Int): Boolean {
        val set = BooleanArray(10) { false }
        var n = n

        while (n > 0) {
            val rem = n % 10
            if (set[rem]) return false
            set[rem] = true

            n /= 10
        }
        return true
    }
}