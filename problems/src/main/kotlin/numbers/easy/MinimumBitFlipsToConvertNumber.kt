package numbers.easy

/**
 * A bit flip of a number x is choosing a bit in the binary representation of x and flipping it from either 0 to 1 or 1 to 0.
 *
 * * For example, for x = 7, the binary representation is 111 and we may choose any bit
 * (including any leading zeros not shown) and flip it. We can flip the first bit from the right to get 110,
 * flip the second bit from the right to get 101, flip the fifth bit from the right (a leading zero) to get 10111, etc.
 *
 * Given two integers start and goal, return the minimum number of bit flips to convert start to goal.
 *
 * [URL](https://leetcode.com/problems/minimum-bit-flips-to-convert-number/)
 */
object MinimumBitFlipsToConvertNumber {
    fun minBitFlipsSimulation(start: Int, goal: Int): Int {
        var result = 0
        var start = start
        var goal = goal

        while (start > 0 || goal > 0) {
            if (start % 2 != goal % 2) {
                result++
            }
            start /= 2
            goal /= 2
        }
        return result
    }

    fun minBitFlipsXor(start: Int, goal: Int): Int {
        var xor = start xor goal
        var result = 0

        while (xor > 0) {
            if (xor % 2 == 1) {
                result++
            }
            xor /= 2
        }
        return result
    }

    fun minBitFlipsKernighan(start: Int, goal: Int): Int {
        var xor = start xor goal
        var result = 0

        while (xor != 0) {
            xor = xor and (xor - 1) // Clear the lowest set bit
            result++
        }
        return result
    }
}
