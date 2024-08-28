package strings.hard

/**
 * You are given a string s and a positive integer k.
 *
 * Let vowels and consonants be the number of vowels and consonants in a string.
 *
 * A string is beautiful if:
 * * vowels == consonants.
 * * (vowels * consonants) % k == 0, in other terms the multiplication of vowels and consonants is divisible by k.
 *
 * Return the number of non-empty beautiful substrings in the given string s.
 *
 * A substring is a contiguous sequence of characters in a string.
 *
 * Vowel letters in English are 'a', 'e', 'i', 'o', and 'u'.
 *
 * Consonant letters in English are every letter except vowels.
 *
 * [URL](https://leetcode.com/problems/count-beautiful-substrings-ii/)
 */
object CountBeautifulSubstringsII {
    private val vowels = setOf('a', 'e', 'i', 'o', 'u')

    fun beautifulSubstrings(s: String, k: Int): Long {
        val possibleLengths = getPossibleStringLength(s, k)
        if (possibleLengths.isEmpty()) {
            return 0L
        }

        val prefixVowels = IntArray(s.length)
        prefixVowels[0] = if (s[0] in vowels) 1 else 0

        for (i in 1 until prefixVowels.size) {
            prefixVowels[i] = prefixVowels[i - 1] + if (s[i] in vowels) 1 else 0
        }

        var result = 0L

        for (len in possibleLengths) {
            for (l in 0..s.length - len) {
                val r = l + len - 1
                val vows = prefixVowels[r] - if (l == 0) 0 else prefixVowels[l - 1]
                val cons = len - vows
                if (vows == cons) result++
            }
        }

        return result
    }

    private fun getPossibleStringLength(s: String, k: Int): List<Int> {
        val result = ArrayList<Int>()

        for (i in 1..s.length) {
            if (2 * i > s.length) break
            val mul = i * i
            
            if (mul % k == 0) {
                result.add(2 * i)
            }
        }

        return result
    }
}
