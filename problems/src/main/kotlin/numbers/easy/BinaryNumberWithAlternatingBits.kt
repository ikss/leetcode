package numbers.easy

/**
 * Given a positive integer, check whether it has alternating bits: namely,
 * if two adjacent bits will always have different values.
 *
 * [URL](https://leetcode.com/problems/climbing-stairs/)
 */
object BinaryNumberWithAlternatingBits {
    fun hasAlternatingBits(n: Int): Boolean {
        val bits = Integer.toBinaryString(n)
        for (i in 0 until bits.length - 1) {
            if (bits[i] == bits[i + 1]) return false
        }
        return true
    }
}
