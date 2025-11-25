package medium

/**
 * Given two positive integers n and k, the binary string Sn is formed as follows:
 * * S1 = "0"
 * * Si = Si - 1 + "1" + reverse(invert(Si - 1)) for i > 1
 * Where + denotes the concatenation operation, reverse(x) returns the reversed string x, and invert(x) inverts all
 * the bits in x (0 changes to 1 and 1 changes to 0).
 *
 * For example, the first four strings in the above sequence are:
 * * S1 = "0"
 * * S2 = "011"
 * * S3 = "0111001"
 * * S4 = "011100110110001"
 *
 * Return the kth bit in Sn. It is guaranteed that k is valid for the given n.
 *
 * [URL](https://leetcode.com/problems/find-kth-bit-in-nth-binary-string/)
 */
object FindKthBitInNthBinaryString {
    fun findKthBit(n: Int, k: Int): Char {
        var s = "0"
        val k = k - 1
        for (i in 1 until n) {
            s = revinv(s)
            if (k < s.length) return s[k]
        }
        return s[k]
    }

    private fun revinv(s: String): String {
        val result = StringBuilder(s)
        for (i in result.indices) {
            if (result[i] == '1') {
                result[i] = '0'
            } else {
                result[i] = '1'
            }
        }
        result.reverse().insert(0, '1').insert(0, s)
        return result.toString()
    }
}