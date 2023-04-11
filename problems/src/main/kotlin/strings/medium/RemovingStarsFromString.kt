package strings.medium

/**
 * You are given a string s, which contains stars *.
 *
 * In one operation, you can:
 * * Choose a star in s.
 * * Remove the closest non-star character to its left, as well as remove the star itself.
 * * Return the string after all stars have been removed.
 *
 * __Note:__
 * * The input will be generated such that the operation is always possible.
 * * It can be shown that the resulting string will always be unique.
 *
 * [URL](https://leetcode.com/problems/break-a-palindrome/)
 */
object RemovingStarsFromString {
    fun removeStars(s: String): String {
        val result = StringBuilder()
        for (c in s) {
            when (c) {
                '*' -> result.setLength(result.length - 1)
                else -> result.append(c)
            }
        }

        return result.toString()
    }
}
