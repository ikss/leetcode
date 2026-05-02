package medium

import data_structures.ListNode

/**
 * An integer x is a good if after rotating each digit individually by 180 degrees
 * , we get a valid number that is different from x. Each digit must be rotated - we cannot choose to leave it alone.
 *
 * A number is valid if each digit remains a digit after rotation. For example:
 *
 * * 0, 1, and 8 rotate to themselves,
 * * 2 and 5 rotate to each other (in this case they are rotated in a different direction, in other words, 2 or 5 gets mirrored),
 * * 6 and 9 rotate to each other, and
 * * the rest of the numbers do not rotate to any other number and become invalid.
 *
 * Given an integer n, return the number of good integers in the range `[1, n]`.
 *
 * [URL](https://leetcode.com/problems/rotated-digits/)
 */
object RotatedDigits {
    fun rotatedDigits(n: Int): Int {
        var result = 0

        for (num in 2 .. n) {
            if (isGood(num)) {
                result++
            }
        }

        return result
    }

    private fun isGood(num: Int): Boolean {
        var num = num
        var hasGood = false

        while (num > 0) {
            val rem = num % 10
            num /= 10
            when (rem) {
                2, 5, 6, 9 -> hasGood = true
                0, 1, 8 -> continue
                else -> return false
            }
        }

        return hasGood
    }
}
