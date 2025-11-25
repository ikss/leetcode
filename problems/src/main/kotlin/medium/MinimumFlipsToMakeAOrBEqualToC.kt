package medium

/**
 * Given 3 positives numbers a, b and c. Return the minimum flips required in some bits of a and b to
 * make (a OR b == c). (bitwise OR operation).
 * Flip operation consists of change any single bit 1 to 0 or change the bit 0 to 1 in their binary representation.
 *
 * [URL](https://leetcode.com/problems/minimum-flips-to-make-a-or-b-equal-to-c/)
 */
object MinimumFlipsToMakeAOrBEqualToC {
    fun minFlips(a: Int, b: Int, c: Int): Int {
        val el = (a or b) xor c
        return Integer.bitCount(el) + Integer.bitCount(a and b and el)
    }
}