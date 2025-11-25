package easy

/**
 * You are given a string s.
 *
 * Your task is to remove all digits by doing this operation repeatedly:
 *
 * Delete the first digit and the closest non-digit character to its left.
 * Return the resulting string after removing all digits.
 *
 * [URL](https://leetcode.com/problems/clear-digits/)
 */
object ClearDigits {
    fun clearDigits(s: String): String {
        val result = StringBuilder()
        for (c in s) {
            if (c.isDigit()) {
                val length = result.length
                if (length > 0) {
                    result.setLength(length - 1)
                }
            } else {
                result.append(c)
            }
        }
        return result.toString()
    }
}
