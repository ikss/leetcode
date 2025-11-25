package hard

/**
 * Given a string s, your task is to find the length of the longest self-contained substring of s.
 *
 * A substring t of a string s is called self-contained if t != s and for every character in t,
 * it doesn't exist in the rest of s.
 *
 * Return the length of the longest self-contained substring of s if it exists, otherwise, return -1.
 *
 * [URL](https://leetcode.com/problems/find-longest-self-contained-substring/)
 */
object FindLongestSelfContainedSubstring {
    fun maxSubstringLength(s: String): Int {
        val firstOccurrences = IntArray(26) { -1 }
        val lastOccurrences = IntArray(26) { -1 }

        for (i in s.indices) {
            val c = s[i] - 'a'
            if (firstOccurrences[c] == -1) {
                firstOccurrences[c] = i
                lastOccurrences[c] = i
            } else {
                lastOccurrences[c] = i
            }
        }

        var result = -1
        for (i in firstOccurrences.indices) {
            val start = firstOccurrences[i]
            if (start == -1) {
                continue
            }
            for (j in lastOccurrences.indices) {
                val end = lastOccurrences[j]
                if (end == -1 || end < start || (start == 0 && end == s.length - 1)) {
                    continue
                }

                var isSelfContained = true
                for (k in start..end) {
                    val char = s[k] - 'a'
                    if (firstOccurrences[char] < start || lastOccurrences[char] > end) {
                        isSelfContained = false
                        break
                    }
                }
                if (isSelfContained) {
                    result = maxOf(result, end - start + 1)
                }
            }
        }

        return result
    }
}