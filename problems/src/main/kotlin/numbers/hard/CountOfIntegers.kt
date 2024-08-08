package numbers.hard

/**
 * You are given two numeric strings num1 and num2 and two integers max_sum and min_sum.
 * We denote an integer x to be good if:
 * * num1 <= x <= num2
 * * min_sum <= digit_sum(x) <= max_sum.
 * 
 * Return the number of good integers. Since the answer may be large, return it modulo 10^9 + 7.
 *
 * Note that digit_sum(x) denotes the sum of the digits of x.
 *
 * [URL](https://leetcode.com/problems/count-of-integers/)
 */
object CountOfIntegers {
    fun count(num1: String, num2: String, min_sum: Int, max_sum: Int): Int {
        var result = 0
        val curr = StringBuilder(num1)
        var currSum = curr.sumOf { it - '0' }

        while (strLess(curr, num2)) {
            if (currSum in min_sum..max_sum) {
                result++
                result %= 1_000_000_007
            }
            currSum = generateNext(curr, currSum)
        }

        return result
    }

    private fun strLess(curr: StringBuilder, max: String): Boolean {
        if (curr.length > max.length) return false
        if (curr.length < max.length) return true

        for (i in curr.indices) {
            if (curr[i] < max[i]) break
            if (curr[i] > max[i]) return false
        }
        return true
    }

    private fun generateNext(curr: StringBuilder, currSum: Int): Int {
        var result = currSum
        for (i in curr.length - 1 downTo 0) {
            val digit = curr[i] - '0'
            if (digit == 9) {
                result -= 9
                curr[i] = '0'
            } else {
                curr[i] = '0' + (digit + 1)
                return result + 1
            }
        }
        curr.insert(0, '1')
        return result + 1
    }
}