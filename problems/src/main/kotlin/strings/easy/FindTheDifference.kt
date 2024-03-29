package strings.easy

/**
 * You are given two strings s and t.
 *
 * String t is generated by random shuffling string s and then add one more letter at a random position.
 *
 * Return the letter that was added to t.
 *
 * [URL](https://leetcode.com/problems/find-the-difference/)
 */
object FindTheDifference {

    fun findTheDifference(s: String, t: String): Char {
        val hash1 = getHash(s)
        val hash2 = getHash(t)

        for (i in hash1.indices) {
            if (hash1[i] != hash2[i]) {
                return 'a' + i
            }
        }
        return '-'
    }

    private fun getHash(str: String): IntArray {
        val hash = IntArray(26)

        for (c in str) {
            hash[c - 'a']++
        }

        return hash
    }

    fun findTheDifferenceXor(s: String, t: String): Char {
        var c = 0

        for (i in s.indices) {
            c = c xor (s[i].code) xor (t[i].code)
        }

        c = c xor (t[t.length - 1].code)
        return c.toChar()
    }
}
