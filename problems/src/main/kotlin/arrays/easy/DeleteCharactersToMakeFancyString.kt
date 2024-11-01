package arrays.easy

/**
 * A fancy string is a string where no three consecutive characters are equal.
 *
 * Given a string s, delete the minimum possible number of characters from s to make it fancy.
 *
 * Return the final string after the deletion. It can be shown that the answer will always be unique.
 *
 * [URL](https://leetcode.com/problems/delete-characters-to-make-fancy-string/)
 */
object DeleteCharactersToMakeFancyString {
    fun makeFancyString(s: String): String {
        val result = StringBuilder(s.length)

        var prev = '_'
        var prevprev = '_'
        for (c in s) {
            if (c == prev && c == prevprev) continue
            result.append(c)
            prevprev = prev
            prev = c
        }

        return result.toString()
    }
}
