package easy

import java.util.*

/**
 * You are given a 0-indexed string array words, where `words[i]` consists of lowercase English letters.
 *
 * In one operation, select any index i such that 0 < i < words.length and words[i - 1] and `words[i]` are anagrams,
 * and delete` `words[i]` from words. Keep performing this operation as long as you can select an index
 * that satisfies the conditions.
 *
 * Return words after performing all operations. It can be shown that selecting the indices for each operation in any
 * arbitrary order will lead to the same result.
 *
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase using all the original
 * letters exactly once. For example, "dacb" is an anagram of "abdc".
 *
 * [URL](https://leetcode.com/problems/find-resultant-array-after-removing-anagrams/)
 */
object FindResultantArrayAfterRemovingAnagrams {
    fun removeAnagrams(words: Array<String>): List<String> {
        if (words.size == 1) return words.toList()
        val result = ArrayList<String>()
        result.add(words[0])

        var curr = 1
        var prevHash = getHash(words[0])
        while (curr < words.size) {
            val currHash = getHash(words[curr])
            if (sameHash(prevHash, currHash)) {
                curr++
                continue
            }
            result.add(words[curr])
            prevHash = currHash
            curr++
        }

        return result
    }

    private fun getHash(word: String): IntArray {
        val result = IntArray(26)
        for (c in word) {
            result[c - 'a']++
        }

        return result
    }

    private fun sameHash(first: IntArray, second: IntArray): Boolean {
        for (i in 0 until 26) {
            if (first[i] != second[i]) {
                return false
            }
        }

        return true
    }
}
