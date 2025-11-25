package medium

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
        val queues = Array(26) { java.util.ArrayDeque<Int>() }
        val result = StringBuilder(s)

        for (i in s.indices) {
            val c = s[i]
            if (c != '*') {
                queues[c - 'a'].offerFirst(i)
                continue
            }
            val firstQueue = queues.firstOrNull { it.isNotEmpty() }
                ?: continue
            result[firstQueue.poll()] = '*'
        }

        return result.filter { it != '*' }.toString()
    }
}