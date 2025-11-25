package easy

/**
 * Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
 *
 * [URL](https://leetcode.com/problems/first-unique-character-in-a-string/)
 */
object FirstUniqueCharacterInAString {
    fun firstUniqChar(s: String): Int {
        val count = IntArray(26)

        for (c in s) {
            count[c - 'a']++
        }

        for (i in s.indices) {
            if (count[s[i] - 'a'] == 1) return i
        }

        return -1
    }
}