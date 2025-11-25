package medium

/**
 * Given a string s and an integer k, return the maximum number of vowel letters in any substring of s with length k.
 *
 * Vowel letters in English are 'a', 'e', 'i', 'o', and 'u'.
 *
 * [URL](https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/)
 */
object MaximumNumberOfVowelsInSubstringOfGivenLength {
    fun maxVowels(s: String, k: Int): Int {
        val vowels = hashSetOf('a', 'e', 'i', 'o', 'u')
        var count = 0
        for (i in 0 until k) {
            if (vowels.contains(s[i])) {
                count++
            }
        }
        var result = count
        for (i in k until s.length) {
            if (vowels.contains(s[i])) {
                count++
            }
            if (vowels.contains(s[i - k])) {
                count--
            }
            result = maxOf(result, count)
        }

        return result
    }
}
