package medium

/**
 * You are given two strings of the same length s and t.
 * In one step you can choose any character of t and replace it with another character.
 *
 * Return the minimum number of steps to make t an anagram of s.
 *
 * An Anagram of a string is a string that contains the same characters with a different (or the same) ordering.
 *
 * [URL](https://leetcode.com/problems/minimum-number-of-steps-to-make-two-strings-anagram/)
 */
object MinimumNumberOfStepsToMakeTwoStringsAnagram {
    fun minSteps(s: String, t: String): Int {
        val h1 = getHash(s)
        val h2 = getHash(t)

        var result = 0

        for (i in h1.indices) {
            val count1 = h1[i]
            val count2 = h2[i]
            result += Math.abs(count1 - count2)
        }

        return result / 2
    }

    private fun getHash(str: String): IntArray {
        val hash = IntArray(26)

        for (c in str) {
            hash[c - 'a']++
        }

        return hash
    }
}
