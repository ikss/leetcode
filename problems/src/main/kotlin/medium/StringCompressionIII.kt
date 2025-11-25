package medium

/**
 * Given a string word, compress it using the following algorithm:
 *
 * * Begin with an empty string comp. While word is not empty, use the following operation:
 * * * Remove a maximum length prefix of word made of a single character c repeating at most 9 times.
 * * * Append the length of the prefix followed by c to comp.
 *
 * Return the string comp.
 *
 * [URL](https://leetcode.com/problems/string-compression-iii/)
 */
object StringCompressionIII {
    fun compressedString(word: String): String {
        val result = StringBuilder(word.length)

        var count = 1
        var prev = word[0]
        for (i in 1 until word.length) {
            val curr = word[i]
            if (curr == prev && count < 9) {
                count++
                continue
            }
            result.append(count).append(prev)
            prev = curr
            count = 1
        }
        result.append(count).append(prev)

        return result.toString()
    }
}
