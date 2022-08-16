package strings.easy

/**
 * Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
 *
 * [URL](https://leetcode.com/problems/first-unique-character-in-a-string/)
 */
object FirstUniqueCharacter {

    fun firstUniqChar(s: String): Int {
        val chars = s.toCharArray()
        val counts = IntArray(26)

        chars.forEach { char ->
            counts[char - 'a']++
        }

        chars.forEachIndexed { index, i ->
            if (counts[i - 'a'] == 1) return index
        }
        return -1
    }
}
