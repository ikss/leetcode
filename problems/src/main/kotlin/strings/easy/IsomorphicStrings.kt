package strings.easy

/**
 * Given two strings s and t, determine if they are isomorphic.
 *
 * Two strings s and t are isomorphic if the characters in s can be replaced to get t.
 *
 * All occurrences of a character must be replaced with another character while preserving the order of characters.
 * No two characters may map to the same character, but a character may map to itself.
 *
 * [URL](https://leetcode.com/problems/isomorphic-strings/)
 */
object IsomorphicStrings {
    fun isIsomorphic(s: String, t: String): Boolean {
        val map = hashMapOf<Char, Char>()
        val mapInversed = hashMapOf<Char, Char>()

        for (i in s.indices) {
            val si = s[i]
            val ti = t[i]
            val mapping = map[si]
            if (map[si] == null) {
                if (mapInversed[ti] != null) {
                    return false
                }
                map[si] = ti
                mapInversed[ti] = si
            } else if (mapping != ti) {
                return false
            }

        }
        return true
    }
}