package strings.easy

/**
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
 * typically using all the original letters exactly once.
 *
 * [URL](https://leetcode.com/problems/valid-anagram/)
 */
object ValidAnagram {

    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false
        val chars = Array(26) { 0 }
        s.toCharArray().forEach {
            chars[it - 'a']++
        }
        t.toCharArray().forEach {
            val index = it - 'a'
            chars[index]--
            if (chars[index] < 0) return false
        }
        return true
    }
}
