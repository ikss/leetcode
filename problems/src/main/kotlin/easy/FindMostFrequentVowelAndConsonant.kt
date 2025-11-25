package easy

/**
 * You are given a string s consisting of lowercase English letters ('a' to 'z').
 *
 * Your task is to:
 * * Find the vowel (one of 'a', 'e', 'i', 'o', or 'u') with the maximum frequency.
 * * Find the consonant (all other letters excluding vowels) with the maximum frequency.
 *
 * Return the sum of the two frequencies.
 *
 * Note: If multiple vowels or consonants have the same maximum frequency, you may choose any one of them.
 * If there are no vowels or no consonants in the string, consider their frequency as 0.
 *
 * The frequency of a letter x is the number of times it occurs in the string.
 *
 * [URL](https://leetcode.com/problems/find-most-frequent-vowel-and-consonant/)
 */
object FindMostFrequentVowelAndConsonant {
    fun maxFreqSum(s: String): Int {
        val arr = IntArray(26)

        for (c in s) {
            arr[c - 'a']++
        }

        var maxVowl = 0
        var maxCons = 0

        for (i in arr.indices) {
            if (isVowel('a' + i)) {
                maxVowl = maxOf(maxVowl, arr[i])
            } else {
                maxCons = maxOf(maxCons, arr[i])
            }
        }

        return maxVowl + maxCons
    }

    private fun isVowel(c: Char): Boolean {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
    }
}