package strings.easy

/**
 * You are given a 0-indexed string s typed by a user. Changing a key is defined as using a key different from the
 * last used key. For example, s = "ab" has a change of a key while s = "bBBb" does not have any.
 *
 * Return the number of times the user had to change the key.
 *
 * Note: Modifiers like shift or caps lock won't be counted in changing the key that is if a user typed the letter 'a'
 * and then the letter 'A' then it will not be considered as a changing of key.
 *
 * [URL](https://leetcode.com/problems/number-of-changing-keys/)
 */
object NumberOfChangingKeys {
    fun countKeyChanges(s: String): Int {
        var result = 0
        var prev = s[0].lowercaseChar()

        for (i in 1 until s.length) {
            val curr = s[i].lowercaseChar()
            if (curr != prev) result++
            prev = curr
        }
        return result
    }
}
