package strings.easy

import java.util.*

/**
 * You are given an array of strings words (0-indexed).
 *
 * In one operation, pick two distinct indices i and j, where `words[i]` is a non-empty string,
 * and move any character from `words[i]` to any position in `words[j]`.
 *
 * Return true if you can make every string in words equal using any number of operations, and false otherwise.
 *
 * [URL](https://leetcode.com/problems/redistribute-characters-to-make-all-strings-equal/)
 */
object RedistributeCharactersToMakeAllStringsEqual {
    fun makeEqual(words: Array<String>): Boolean {
        val hash = IntArray(26)
        for (w in words) {
            for (c in w) {
                hash[c - 'a']++
            }
        }

        for (count in hash) {
            if (count > 0 && count % words.size != 0) {
                return false
            }
        }
        return true
    }
}