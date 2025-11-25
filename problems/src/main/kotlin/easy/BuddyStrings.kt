package easy

/**
 * Given two strings s and goal, return true if you can swap two letters in s so the result is equal to goal,
 * otherwise, return false.
 *
 * Swapping letters is defined as taking two indices i and j (0-indexed) such that i != j and swapping the characters
 * at `s[i]` and `s[j]`.
 *
 * For example, swapping at indices 0 and 2 in "abcd" results in "cbad".
 *
 * [URL](https://leetcode.com/problems/buddy-strings/)
 */
object BuddyStrings {

    fun buddyStrings(s: String, goal: String): Boolean {
        if (s.length != goal.length) return false

        if (s == goal) {
            val freq = IntArray(26)
            for (c in s) {
                freq[c - 'a']++
                if (freq[c - 'a'] > 1) return true
            }
            return false
        }

        var ind1 = -1
        var ind2 = -1
        for (i in s.indices) {
            if (s[i] != goal[i]) {
                if (ind1 == -1) {
                    ind1 = i
                } else if (ind2 == -1) {
                    ind2 = i
                } else {
                    return false
                }
            }
        }
        if (ind2 == -1) return false
        return s[ind1] == goal[ind2] && s[ind2] == goal[ind1]
    }
}