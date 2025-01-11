package strings.medium

/**
 * Given a string s and an integer k, return true if you can use all the characters in s to construct k
 * palindrome strings or false otherwise.
 *
 * [URL](https://leetcode.com/problems/construct-k-palindrome-strings/)
 */
object ConstructKPalindromeStrings {
    fun canConstruct(s: String, k: Int): Boolean {
        if (s.length < k) return false
        if (s.length == k) return true

        val hash = IntArray(26)
        for (c in s) {
            hash[c - 'a']++
        }

        var odds = 0
        for (i in hash.indices) {
            if (hash[i] % 2 != 0) {
                odds++
            }
        }
        return odds <= k
    }
}