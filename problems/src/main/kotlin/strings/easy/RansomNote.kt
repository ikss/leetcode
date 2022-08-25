package strings.easy

/**
 * Given two strings ransomNote and magazine, return true if ransomNote can be constructed
 * by using the letters from magazine and false otherwise.
 *
 * Each letter in magazine can only be used once in ransomNote.
 *
 * [URL](https://leetcode.com/problems/ransom-note/)
 */
object RansomNote {
    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        val hash = IntArray(26)

        magazine.forEach { m ->
            hash[m - 'a']++
        }

        ransomNote.forEach { r ->
            val i = r - 'a'
            if (hash[i] == 0) return false
            hash[i]--
        }

        return true
    }
}
