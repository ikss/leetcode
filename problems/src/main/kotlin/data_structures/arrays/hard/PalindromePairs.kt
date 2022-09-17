package data_structures.arrays.hard

/**
 * Given a list of unique words, return all the pairs of the distinct indices (i, j) in the given list,
 * so that the concatenation of the two words `words[i]` + `words[j]` is a palindrome.
 *
 * [URL](https://leetcode.com/problems/palindrome-pairs/)
 */
object PalindromePairs {

    fun palindromePairs(words: Array<String>): List<List<Int>> {
        val result = mutableListOf<List<Int>>()
        val reversedMap = hashMapOf<String, Int>()
        for (i in words.indices) {
            reversedMap[words[i].reversed()] = i
        }

        for (i in words.indices) {
            val w = words[i]
            if (w != "" && isPalindrome(w) && reversedMap.containsKey("")) {
                result.add(listOf(reversedMap[""]!!, i))
            }
            for (j in w.indices) {
                val left = w.substring(0, j)
                val right = w.substring(j, w.length)
                if (isPalindrome(left) && reversedMap.containsKey(right) && reversedMap[right]!! != i) {
                    result.add(listOf(reversedMap[right]!!, i))
                }
                if (isPalindrome(right) && reversedMap.containsKey(left) && reversedMap[left]!! != i) {
                    result.add(listOf(i, reversedMap[left]!!))
                }
            }
        }
        return result
    }

    private fun isPalindrome(s: String): Boolean {
        for (i in 0 until s.length / 2) {
            if (s[i] != s[s.length - 1 - i]) return false
        }
        return true
    }
}
