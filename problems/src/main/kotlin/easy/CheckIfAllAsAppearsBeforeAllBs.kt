package easy

/**
 * Given a string s consisting of only the characters 'a' and 'b', return true if every 'a' appears before every 'b'
 * in the string. Otherwise, return false.
 *
 * [URL](https://leetcode.com/problems/check-if-all-as-appears-before-all-bs/)
 */
object CheckIfAllAsAppearsBeforeAllBs {
    fun checkString(s: String): Boolean {
        var sawB = false

        for (i in s.indices) {
            val c = s[i]

            if (c == 'a' && sawB) {
                return false
            } else if (c == 'b') {
                sawB = true
            }
        }

        return true
    }
}
