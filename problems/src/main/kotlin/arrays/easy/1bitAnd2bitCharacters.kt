package arrays.easy

/**
 * We have two special characters:
 * * The first character can be represented by one bit 0.
 * * The second character can be represented by two bits (10 or 11).
 *
 * Given a binary array bits that ends with 0, return true if the last character must be a one-bit character.
 *
 * [URL](https://leetcode.com/problems/1-bit-and-2-bit-characters/)
 */
object `1bitAnd2bitCharacters` {
    fun isOneBitCharacter(bits: IntArray): Boolean {
        if (bits.size == 1) return true

        var i = 0

        while (i < bits.size - 1) {
            if (bits[i] == 0) {
                i++
                continue
            }
            if (i == bits.size - 2) return false
            i += 2
        }

        return true
    }
}
