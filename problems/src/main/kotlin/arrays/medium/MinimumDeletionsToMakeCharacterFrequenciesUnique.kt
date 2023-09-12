package arrays.medium

/**
 * A string s is called good if there are no two different characters in s that have the same frequency.
 *
 * Given a string s, return the minimum number of characters you need to delete to make s good.
 *
 * The frequency of a character in a string is the number of times it appears in the string.
 * For example, in the string "aab", the frequency of 'a' is 2, while the frequency of 'b' is 1.
 *
 * [URL](https://leetcode.com/problems/minimum-deletions-to-make-character-frequencies-unique/)
 */
object MinimumDeletionsToMakeCharacterFrequenciesUnique {
    fun minDeletions(s: String): Int {
        val freq = IntArray(26)

        for (c in s) {
            freq[c - 'a'] += 1
        }

        freq.sortDescending()
        var result = 0

        for (i in 0 until freq.size - 1) {
            val curr = freq[i]
            val next = freq[i + 1]
            if (next == 0) break
            if (curr <= next) {
                val diff = minOf(next - curr + 1, next)
                result += diff
                freq[i + 1] -= diff
            }
        }
        return result
    }

}