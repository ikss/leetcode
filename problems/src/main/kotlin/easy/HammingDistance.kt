package easy

/**
 * The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
 *
 * Given two integers x and y, return the Hamming distance between them.
 *
 * [URL](https://leetcode.com/problems/hamming-distance/)
 */
object HammingDistance {
    fun hammingDistance(x: Int, y: Int): Int {
        val i = Integer.toBinaryString(x xor y)
        return i.count { it == '1' }
    }
}
