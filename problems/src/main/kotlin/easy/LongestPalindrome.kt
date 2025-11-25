package easy

/**
 * Given a string s which consists of lowercase or uppercase letters, return the length of the longest
 * palindrome that can be built with those letters.
 *
 * Letters are case sensitive, for example, "Aa" is not considered a palindrome.
 *
 * [URL](https://leetcode.com/problems/longest-palindrome/)
 */
object LongestPalindrome {
    fun longestPalindrome(s: String): Int {
        val set = HashSet<Char>()

        var result = 0
        for (c in s) {
            if (set.contains(c)) {
                set.remove(c)
                result += 2
            } else {
                set.add(c)
            }
        }
        if (set.isNotEmpty()) result++

        return result
    }
}