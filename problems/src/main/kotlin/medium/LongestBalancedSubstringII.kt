package medium

/**
 * You are given a string s consisting only of the characters 'a', 'b', and 'c'.
 *
 * A substring of s is called balanced if all distinct characters in the substring appear the same number of times.
 *
 * Return the length of the longest balanced substring of s.
 *
 * [URL](https://leetcode.com/problems/longest-balanced-substring-ii/)
 */
object LongestBalancedSubstringII {
    fun longestBalanced(s: String): Int {
        val res = maxOf(
            find1(s),
            find2(s, 'a', 'b'),
            find2(s, 'a', 'c'),
            find2(s, 'b', 'c'),
            find3(s),
        )

        return res
    }

    private fun find1(s: String): Int {
        var cur_a = 0
        var cur_b = 0
        var cur_c = 0
        var max_a = 0
        var max_b = 0
        var max_c = 0

        for (i in s.indices) {
            if (s[i] == 'a') {
                cur_a = if (i > 0 && s[i - 1] == 'a') cur_a + 1 else 1
                max_a = maxOf(max_a, cur_a)
            } else if (s[i] == 'b') {
                cur_b = if (i > 0 && s[i - 1] == 'b') cur_b + 1 else 1
                max_b = maxOf(max_b, cur_b)
            } else {
                cur_c = if (i > 0 && s[i - 1] == 'c') cur_c + 1 else 1
                max_c = maxOf(max_c, cur_c)
            }
        }
        return maxOf(max_a, max_b, max_c)
    }

    private fun find2(s: String, x: Char, y: Char): Int {
        val n = s.length
        var max_len = 0
        val first = IntArray(2 * n + 1) { -2 }

        var clear_idx = -1
        var diff = n
        first[diff] = -1

        for (i in 0..<n) {
            if (s[i] != x && s[i] != y) {
                clear_idx = i
                diff = n
                first[diff] = clear_idx
            } else {
                if (s[i] == x) diff++
                else diff--

                if (first[diff] < clear_idx) {
                    first[diff] = i
                } else {
                    max_len = maxOf(max_len, i - first[diff])
                }
            }
        }

        return max_len
    }

    private fun find3(s: String): Int {
        var state = Long.MAX_VALUE / 2
        val first = HashMap<Long, Int>()
        first[state] = -1

        var max_len = 0

        for (i in s.indices) {
            if (s[i] == 'a') state += 1000001
            else if (s[i] == 'b') state -= 1000000
            else state--

            val prev = first[state]
            if (prev != null) {
                max_len = maxOf(max_len, i - prev)
            } else {
                first[state] = i
            }
        }

        return max_len
    }
}
