package easy

/**
 * You are given a binary string s that contains at least one '1'.
 *
 * You have to rearrange the bits in such a way that the resulting binary number is the
 * maximum odd binary number that can be created from this combination.
 *
 * Return a string representing the maximum odd binary number that can be created from the given combination.
 *
 * Note that the resulting string can have leading zeros.
 *
 * [URL](https://leetcode.com/problems/maximum-odd-binary-number/)
 */
object MaximumOddBinaryNumber {
    fun maximumOddBinaryNumber(s: String): String {
        var ones = 0

        for (c in s) {
            if (c == '1') ones++
        }

        val result = StringBuilder(s.length)
        for (i in 0 until ones - 1) {
            result.append('1')
        }
        for (i in 0 until s.length - ones) {
            result.append('0')
        }
        result.append('1')

        return result.toString()
    }
}
