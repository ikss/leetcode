package numbers.medium

/**
 * Given two integers left and right that represent the range `[left, right]`,
 * return the bitwise AND of all numbers in this range, inclusive.
 *
 * [URL](https://leetcode.com/problems/bitwise-and-of-numbers-range/)
 */
object BitwiseAndOfNumbersRange {
    fun rangeBitwiseAnd(left: Int, right: Int): Int {
        var right = right
        while (left < right) {
            right = right and (right - 1)
        }
        return left and right
    }
}
