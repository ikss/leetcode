package numbers.hard

/**
 * Given an integer n, you must transform it into 0 using the following operations any number of times:
 *  * Change the rightmost (0th) bit in the binary representation of n.
 *  * Change the ith bit in the binary representation of n if the (i-1)th bit is set to 1 and the (i-2)th through
 * 0th bits are set to 0.
 *
 * Return the minimum number of operations to transform n into 0.
 *
 * [URL](https://leetcode.com/problems/minimum-one-bit-operations-to-make-integers-zero/)
 */
object MinimumOneBitOperationsToMakeIntegersZero {
    fun minimumOneBitOperations(n: Int): Int {
        var result = n

        result = result xor (result shr 16)
        result = result xor (result shr 8)
        result = result xor (result shr 4)
        result = result xor (result shr 2)
        result = result xor (result shr 1)

        return result
    }
}
