package numbers.easy

/**
 * Reverse bits of a given 32 bits unsigned integer.
 *
 * Note:
 *  * Note that in some languages, such as Java, there is no unsigned integer type. In this case,
 *  the input will be given as a signed integer type. It should not affect your implementation,
 *  as the integer's internal binary representation is the same, whether it is signed or unsigned.
 *  * In Java, the compiler represents the signed integers using 2's complement notation.
 *  Therefore, in Example 3, the input represents the signed integer. -3.
 *
 * [URL](https://leetcode.com/problems/reverse-bits/)
 */
object ReverseBits {
    fun reverseBits(n: Int): Int =
        Integer.toBinaryString(n)
            .padStart(32, '0')
            .reversed()
            .toLong(2)
            .toInt()
}
