package strings.medium

import java.util.TreeMap

/**
 * You are given a string s. It may contain any number of '*' characters. Your task is to remove all '*' characters.
 *
 * While there is a '*', do the following operation:
 *
 * Delete the leftmost '*' and the smallest non-'*' character to its left. If there are several smallest characters,
 * you can delete any of them.
 * Return the lexicographically smallest resulting string after removing all '*' characters.
 *
 * [URL](https://leetcode.com/problems/lexicographically-minimum-string-after-removing-stars/)
 */
object LexicographicallyMinimumStringAfterRemovingStars {
    fun clearStars(s: String): String {
        val map = TreeMap<Char, ArrayList<Int>>()
        val result = StringBuilder(s)

        for (i in s.indices) {
            val c = s[i]
            if (c != '*') {
                map.computeIfAbsent(c) { ArrayList() }.add(i)
                continue
            }
            val firstEntry = map.firstEntry()
                ?: continue
            result[firstEntry.value.removeLast()] = '*'
            if (firstEntry.value.isEmpty()) {
                map.remove(firstEntry.key)
            }
        }

        return result.filter { it != '*' }.toString()
    }
}