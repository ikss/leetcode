package strings.medium

/**
 * You are given a string word and a non-negative integer k.
 *
 * Return the total number of substrings of word that contain every vowel
 * ('a', 'e', 'i', 'o', and 'u') at least once and exactly k consonants.
 *
 * [URL](https://leetcode.com/problems/count-of-substrings-containing-every-vowel-and-k-consonants-ii/)
 */
object CountOfSubstringsContainingEveryVowelAndKConsonantsII {
    private val vowelsChars = setOf('a', 'e', 'i', 'o', 'u')

    fun countOfSubstrings(word: String, k: Int): Long {
        return atLeastK(word, k) - atLeastK(word, k + 1)
    }

    private fun atLeastK(word: String, k: Int): Long {
        var result = 0L
        var start = 0
        var end = 0
        
        val counts = IntArray(26)
        
        var consonants = 0
        var vowels = 0

        while (end < word.length) {
            val cend = word[end]
            counts[cend - 'a']++

            if (cend in vowelsChars) {
                if (counts[cend - 'a'] == 1) {
                    vowels++
                }
            } else {
                consonants++
            }

            while (vowels == 5 && consonants >= k) {
                result += word.length - end
                
                val cstart = word[start]
                counts[cstart - 'a']--
                
                if (cstart in vowelsChars) {
                    if (counts[cstart - 'a'] == 0) {
                        vowels--
                    }
                } else {
                    consonants--
                }
                start++
            }
            end++
        }

        return result
    }

}