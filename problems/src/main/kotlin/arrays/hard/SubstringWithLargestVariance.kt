package arrays.hard

/**
 * The variance of a string is defined as the largest difference between the number of occurrences of any 2 characters
 * present in the string. Note the two characters may or may not be the same.
 *
 * Given a string s consisting of lowercase English letters only, return the largest variance possible among all
 * substrings of s.
 *
 * A substring is a contiguous sequence of characters within a string.
 *
 * [URL](https://leetcode.com/problems/substring-with-largest-variance/)
 */
object SubstringWithLargestVariance {
    fun largestVariance(s: String): Int {
        val counter = IntArray(26)
        for (c in s) {
            counter[c - 'a']++
        }
        var result = 0

        for (i in 0 until 26) {
            for (j in 0 until 26) {
                if (i == j || counter[i] == 0 || counter[j] == 0) continue

                val major = 'a' + i
                val minor = 'a' + j

                var majorCount = 0
                var minorCount = 0

                var restMinor = counter[j]

                for (c in s) {
                    if (c == major) majorCount++
                    if (c == minor) {
                        minorCount++
                        restMinor--
                    }

                    if (minorCount > 0) {
                        result = maxOf(result, majorCount - minorCount)
                    }
                    if (majorCount < minorCount && restMinor > 0) {
                        majorCount = 0
                        minorCount = 0
                    }
                }
            }
        }

        return result
    }
}
