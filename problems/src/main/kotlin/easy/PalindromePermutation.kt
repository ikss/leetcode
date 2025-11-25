package easy

/**
 * Given a string s, return true if a permutation of the string could form a palindrome and false otherwise.
 *
 * [URL](https://leetcode.com/problems/buddy-strings/)
 */
object PalindromePermutation {
    fun canPermutePalindrome(s: String): Boolean {
        val hash = IntArray(26)

        for (c in s) {
            hash[c - 'a']++
        }

        var oddSeen = false

        for (count in hash) {
            if (count % 2 != 0) {
                if (oddSeen) {
                    return false
                }
                oddSeen = true
            }
        }

        return true
    }
}