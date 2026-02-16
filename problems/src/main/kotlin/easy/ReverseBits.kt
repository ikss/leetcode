package easy

/**
 * Reverse bits of a given 32 bits unsigned integer.
 *
 * Note:
 * * Note that in some languages, such as Java, there is no unsigned integer type. In this case,
 *  the input will be given as a signed integer type. It should not affect your implementation,
 *  as the integer's internal binary representation is the same, whether it is signed or unsigned.
 * * In Java, the compiler represents the signed integers using 2's complement notation.
 *  Therefore, in Example 3, the input represents the signed integer. -3.
 *
 * [URL](https://leetcode.com/problems/reverse-bits/)
 */
object ReverseBits {
    fun reverseBitsNaive(n: Int): Int =
        Integer.toBinaryString(n)
            .padStart(32, '0')
            .reversed()
            .toLong(2)
            .toInt()

    fun reverseBitsBitByBit(n: Int): Int {
        var n = n
        var result = 0
        for (i in 0..31) {
            result += n and 1
            n = n ushr 1 // CATCH: must do unsigned shift
            if (i < 31) // CATCH: for last digit, don't shift!
                result = result shl 1
        }
        return result
    }

    fun reverseBitsMaskAndShift(n: Int): Int {
        var n = n
        n = (n ushr 16) or (n shl 16)
        n = ((n and -0xff0100) ushr 8) or ((n and 0xff00ff) shl 8)
        n = ((n and -0xf0f0f10) ushr 4) or ((n and 0xf0f0f0f) shl 4)
        n = ((n and -0x33333334) ushr 2) or ((n and 0x33333333) shl 2)
        n = ((n and -0x55555556) ushr 1) or ((n and 0x55555555) shl 1)
        return n
    }
}
