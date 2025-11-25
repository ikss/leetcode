package easy

/**
 * You are given an integer num. You know that Bob will sneakily remap one of the 10 possible digits (0 to 9) to another digit.
 *
 * Return the difference between the maximum and minimum values Bob can make by remapping exactly one digit in num.
 *
 * Notes:
 *
 * When Bob remaps a digit d1 to another digit d2, Bob replaces all occurrences of d1 in num with d2.
 * Bob can remap a digit to itself, in which case num does not change.
 * Bob can remap different digits for obtaining minimum and maximum values respectively.
 * The resulting number after remapping can contain leading zeroes.
 *
 * [URL](https://leetcode.com/problems/maximum-difference-by-remapping-a-digit/)
 */
object MaximumDifferenceByRemappingDigit {
    fun minMaxDifference(num: Int): Int {
        val numstr = num.toString()

        val min = getMin(numstr)

        val max = getMax(numstr)

        return max - min
    }

    private fun getMin(numstr: String): Int {
        val result = StringBuilder()

        val replacement = numstr[0]
        for (c in numstr) {
            if (c == replacement) {
                result.append('0')
            } else {
                result.append(c)
            }
        }
        val trimmed = result.trimStart('0').toString()
        return if (trimmed.isEmpty()) 0 else trimmed.toInt()
    }

    private fun getMax(numstr: String): Int {
        val result = StringBuilder()

        var replacement = '_'
        for (c in numstr) {
            if (c == '9') {
                result.append(c)
            } else if (replacement == '_') {
                replacement = c
                result.append('9')
            } else if (c == replacement) {
                result.append('9')
            } else {
                result.append(c)
            }
        }

        return result.toString().toInt()
    }
}