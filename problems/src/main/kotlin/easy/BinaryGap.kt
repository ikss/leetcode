package easy

/**
 * Given a positive integer n, find and return the longest distance between any two adjacent 1's in the binary
 * representation of n. If there are no two adjacent 1's, return 0.
 *
 * Two 1's are adjacent if there are only 0's separating them (possibly no 0's).
 * The distance between two 1's is the absolute difference between their bit positions.
 * For example, the two 1's in "1001" have a distance of 3.
 *
 * [URL](https://leetcode.com/problems/binary-gap/)
 */
object BinaryGap {
    fun binaryGap(n: Int): Int {
        var n = n

        var result = 0
        var step = -1
        while (n > 0) {
            if (n and 1 == 1) {
                if (step != -1) {
                    result = maxOf(result, step)
                }
                step = 1
            } else if (step != -1) {
                step++
            }
            n /= 2
        }

        return result
    }
}
