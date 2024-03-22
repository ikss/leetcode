package strings.easy

/**
 * Given a string s, remove the vowels 'a', 'e', 'i', 'o', and 'u' from it, and return the new string.
 *
 * [URL](https://leetcode.com/problems/remove-vowels-from-a-string/)
 */
object RemoveVowelsFromString {
    fun removeVowelsOneLiner(s: String): String {
        return s.filter { it !in setOf('a', 'e', 'i', 'o', 'u') }
    }

    fun removeVowelsStringBuilder(s: String): String {
        val vowels = setOf('a', 'e', 'i', 'o', 'u')
        val result = StringBuilder()
        for (c in s) {
            if (c !in vowels) {
                result.append(c)
            }
        }
        return result.toString()
    }
}