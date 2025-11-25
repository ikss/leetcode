package easy

/**
 * You are given a string s of even length. Split this string into two halves of equal lengths,
 * and let a be the first half and b be the second half.
 *
 * Two strings are alike if they have the same number of vowels ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U').
 * Notice that s contains uppercase and lowercase letters.
 *
 * Return true if a and b are alike. Otherwise, return false.
 *
 * [URL](https://leetcode.com/problems/determine-if-string-halves-are-alike/)
 */
object DetermineIfStringHalvesAreAlike {
    private val vowels = hashSetOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')

    fun halvesAreAlike(s: String): Boolean {
        var first = 0
        var second = 0

        val mid = s.length / 2
        for (i in s.indices) {
            if (s[i] in vowels) {
                if (i < mid) {
                    first++
                } else {
                    second++
                }
            }
        }
        return first == second
    }
}