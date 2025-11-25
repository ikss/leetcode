package easy

/**
 * Given a positive integer, check whether it has alternating bits: namely,
 * if two adjacent bits will always have different values.
 *
 * [URL](https://leetcode.com/problems/climbing-stairs/)
 */
object BinaryNumberWithAlternatingBits {
    fun hasAlternatingBitsBinaryString(n: Int): Boolean {
        val bits = Integer.toBinaryString(n)
        for (i in 0 until bits.length - 1) {
            if (bits[i] == bits[i + 1]) return false
        }
        return true
    }

    fun hasAlternatingBitsDivision(n: Int): Boolean {
        var cur = n % 2
        var rest = n / 2
        while (rest > 0) {
            if (cur == rest % 2) return false
            cur = rest % 2
            rest /= 2
        }
        return true
    }
}
