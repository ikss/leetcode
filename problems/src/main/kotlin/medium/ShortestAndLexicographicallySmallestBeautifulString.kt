package medium

/**
 * You are given a binary string s and a positive integer k.
 *
 * A substring of s is beautiful if the number of 1's in it is exactly k.
 *
 * Let len be the length of the shortest beautiful substring.
 *
 * Return the lexicographically smallest beautiful substring of string s with length equal to len.
 * If s doesn't contain a beautiful substring, return an empty string.
 *
 * A string a is lexicographically larger than a string b (of the same length) if in the first position where a and b
 * differ, a has a character strictly larger than the corresponding character in b.
 *
 * * For example, "abcd" is lexicographically larger than "abcc" because the first position they differ is at the
 * fourth character, and d is greater than c.
 *
 * [URL](https://leetcode.com/problems/shortest-and-lexicographically-smallest-beautiful-string/)
 */
object ShortestAndLexicographicallySmallestBeautifulString {
    fun shortestBeautifulSubstring(s: String, k: Int): String {
        val n = s.length
        var currStart = 0
        var currEnd = 0
        var currCount = 0
        while (currStart < n && s[currStart] != '1') {
            currStart++
        }
        while (currCount < k && currEnd < n) {
            if (s[currEnd++] == '1') {
                currCount++
            }
        }
        if (currCount < k) {
            return ""
        }

        var beatifulStart = currStart
        var beatifulEnd = currEnd
        while (currEnd < n) {
            if (s[currEnd++] != '1') {
                continue
            }
            while (s[++currStart] != '1') {

            }
            if (currEnd - currStart < beatifulEnd - beatifulStart) {
                beatifulEnd = currEnd
                beatifulStart = currStart
            } else if (currEnd - currStart == beatifulEnd - beatifulStart) {
                for (i in 0 until currEnd - currStart) {
                    if (s[currStart + i] == s[beatifulStart + i]) {
                        continue
                    } else if (s[currStart + i] < s[beatifulStart + i]) {
                        beatifulEnd = currEnd
                        beatifulStart = currStart
                        break
                    } else {
                        break
                    }
                }
            }
        }
        return s.substring(beatifulStart, beatifulEnd)
    }
}