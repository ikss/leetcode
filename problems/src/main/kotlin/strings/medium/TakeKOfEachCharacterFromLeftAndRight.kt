package strings.medium

/**
 * You are given a string s consisting of the characters 'a', 'b', and 'c' and a non-negative integer k.
 * Each minute, you may take either the leftmost character of s, or the rightmost character of s.
 *
 * Return the minimum number of minutes needed for you to take at least k of each character,
 * or return -1 if it is not possible to take k of each character.
 *
 * [URL](https://leetcode.com/problems/take-k-of-each-character-from-left-and-right/)
 */
object TakeKOfEachCharacterFromLeftAndRight {
    fun takeCharacters(s: String, k: Int): Int {
        val count = IntArray(3)

        for (c in s.toCharArray()) {
            count[c - 'a']++
        }

        for (i in 0..2) {
            if (count[i] < k) return -1
        }

        val window = IntArray(3)
        var left = 0
        var maxWindow = 0

        for (right in s.indices) {
            window[s[right] - 'a']++

            while (left <= right && (count[0] - window[0] < k || count[1] - window[1] < k || count[2] - window[2] < k)) {
                window[s[left] - 'a']--
                left++
            }

            maxWindow = maxOf(maxWindow, right - left + 1)
        }

        return s.length - maxWindow
    }
}