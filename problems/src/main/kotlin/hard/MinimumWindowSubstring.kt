package hard

/**
 * Given two strings s and t of lengths m and n respectively,return the minimum window substring of s
 * such that every character in t (including duplicates) is included in the window.
 * If there is no such substring, return the empty string "".
 *
 * The testcases will be generated such that the answer is unique.
 *
 * A substring is a contiguous sequence of characters within the string.
 *
 * [URL](https://leetcode.com/problems/minimum-window-substring/)
 */
object MinimumWindowSubstring {
    fun minWindow(s: String, t: String): String {
        if (s.isEmpty() || t.isEmpty()) {
            return ""
        }

        // Dictionary which keeps a count of all the unique characters in t.
        val dictT = HashMap<Char, Int>()
        for (i in t.indices) {
            dictT.merge(t[i], 1, Int::plus)
        }

        // Number of unique characters in t, which need to be present in the desired window.
        val required = dictT.size

        // Left and Right pointer
        var l = 0
        var r = 0

        // formed is used to keep track of how many unique characters in t
        // are present in the current window in its desired frequency.
        // e.g. if t is "AABC" then the window must have two A's, one B and one C.
        // Thus formed would be = 3 when all these conditions are met.
        var formed = 0

        // Dictionary which keeps a count of all the unique characters in the current window.
        val windowCounts = HashMap<Char, Int>()

        // ans list of the form (window length, left, right)
        val ans = intArrayOf(-1, 0, 0)
        while (r < s.length) {
            // Add one character from the right to the window
            var c = s[r]
            windowCounts.merge(c, 1, Int::plus)

            // If the frequency of the current character added equals to the
            // desired count in t then increment the formed count by 1.
            if (windowCounts[c]!! == dictT[c]) {
                formed++
            }

            // Try and contract the window till the point where it ceases to be 'desirable'.
            while (l <= r && formed == required) {
                c = s[l]
                // Save the smallest window until now.
                if (ans[0] == -1 || r - l + 1 < ans[0]) {
                    ans[0] = r - l + 1
                    ans[1] = l
                    ans[2] = r
                }

                // The character at the position pointed by the
                // `Left` pointer is no longer a part of the window.
                windowCounts.merge(c, 1, Int::minus)
                if (dictT.containsKey(c) && windowCounts[c]!! < dictT[c]!!) {
                    formed--
                }

                // Move the left pointer ahead, this would help to look for a new window.
                l++
            }

            // Keep expanding the window once we are done contracting.
            r++
        }
        return if (ans[0] == -1) "" else s.substring(ans[1], ans[2] + 1)
    }
}
