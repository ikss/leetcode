package medium

import data_structures.ListNode

/**
 * A string originalText is encoded using a slanted transposition cipher
 * to a string encodedText with the help of a matrix having a fixed number of rows rows.
 *
 * [URL](https://leetcode.com/problems/decode-the-slanted-ciphertext/)
 */
object DecodeTheSlantedCiphertext {
    fun decodeCiphertext(encodedText: String, rows: Int): String {
        val cols = encodedText.length / rows
        val skip = rows * (rows - 1) / 2
        val result = StringBuilder()

        var start = 0
        var lastNotEmpty = -1

        while (result.length < encodedText.length - skip) {
            for (r in 0 until rows) {
                val i = start + r * cols + r
                if (i >= encodedText.length) break
                result.append(encodedText[i])
                if (encodedText[i] != ' ') {
                    lastNotEmpty = result.length
                }
            }
            start++
        }
        if (lastNotEmpty > 0) result.setLength(lastNotEmpty)

        return result.toString()
    }

}
