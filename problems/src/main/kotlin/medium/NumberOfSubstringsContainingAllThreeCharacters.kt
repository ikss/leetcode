package medium

/**
 * Given a string s consisting only of characters a, b and c.
 *
 * Return the number of substrings containing at least one occurrence of all these characters a, b and c.
 *
 * [URL](https://leetcode.com/problems/number-of-substrings-containing-all-three-characters/)
 */
object NumberOfSubstringsContainingAllThreeCharacters {
    fun numberOfSubstrings(s: String): Int {
        val lastSeen = intArrayOf(-1, -1, -1)
        var total = 0

        for (i in s.indices) {
            val c = s[i]
            lastSeen[c - 'a'] = i

            total += 1 + lastSeen.min()
        }

        return total
    }
}