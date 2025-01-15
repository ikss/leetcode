package numbers.medium

/**
 * Given two positive integers num1 and num2, find the positive integer x such that:
 * * x has the same number of set bits as num2, and
 * * The value x XOR num1 is minimal.
 *
 * Note that XOR is the bitwise XOR operation.
 *
 * Return the integer x. The test cases are generated such that x is uniquely determined.
 *
 * The number of set bits of an integer is the number of 1's in its binary representation.
 *
 * [URL](https://leetcode.com/problems/minimize-xor/)
 */
object MinimizeXOR {
    fun minimizeXor(num1: Int, num2: Int): Int {
        val bits1 = Integer.bitCount(num1)
        val bits2 = Integer.bitCount(num2)

        if (bits1 == bits2) {
            return num1
        }

        if (bits2 > bits1) {
            return addBits(num1, bits2 - bits1)
        }

        return removeBits(num1, bits1 - bits2)
    }

    private fun addBits(num1: Int, diffBits: Int): Int {
        var diff = diffBits

        var num = num1
        var bit = 0
        while (diff > 0) {
            val isNotSet = num and (1 shl bit) == 0
            if (isNotSet) {
                num = num or (1 shl bit)
                diff--
            }
            bit++
        }

        return num
    }


    private fun removeBits(num1: Int, removeBits: Int): Int {
        var diff = removeBits

        var num = num1
        var bit = 0
        while (diff > 0) {
            val isNotSet = num and (1 shl bit) > 0
            if (isNotSet) {
                num = num and (1 shl bit).inv()
                diff--
            }
            bit++
        }

        return num
    }
}