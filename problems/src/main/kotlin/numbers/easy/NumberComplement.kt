package numbers.easy

/**
 * The complement of an integer is the integer you get when you flip all the 0's to 1's and all the 1's to 0's in its
 * binary representation.
 *
 * For example, The integer 5 is "101" in binary and its complement is "010" which is the integer 2.
 * Given an integer num, return its complement.
 *
 * [URL](https://leetcode.com/problems/number-complement/)
 */
object NumberComplement {
    fun findComplement(num: Int): Int {
        var result = 0

        var bit = 1
        while (bit > 0 && bit < num) {
            val bitSet = num and bit
            if (bitSet == 0) {
                result = result or bit
            }
            bit = bit shl 1
        }

        return result
    }

    fun findComplementHighestOneBit(num: Int): Int {
        return (Integer.highestOneBit(num) shl 1) - 1 - num
    }

    fun findComplementHackerDelight(num: Int): Int {
        // bitmask has the same length as num and contains only ones 1...1
        var bitmask = num
        bitmask = bitmask or (bitmask shr 1)
        bitmask = bitmask or (bitmask shr 2)
        bitmask = bitmask or (bitmask shr 4)
        bitmask = bitmask or (bitmask shr 8)
        bitmask = bitmask or (bitmask shr 16)
        // flip all bits 
        return bitmask xor num
    }
}
