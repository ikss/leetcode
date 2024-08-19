package arrays.medium

/**
 * There is only one character 'A' on the screen of a notepad. You can perform one of two operations on this notepad for each step:
 *
 * Copy All: You can copy all the characters present on the screen (a partial copy is not allowed).
 * Paste: You can paste the characters which are copied last time.
 * Given an integer n, return the minimum number of operations to get the character 'A' exactly n times on the screen.
 *
 * [URL](https://leetcode.com/problems/2-keys-keyboard/)
 */
object `2KeysKeyboard` {
    fun minSteps(n: Int): Int {
        val dp = IntArray(n + 1)
        dp[1] = 0

        for (i in 1 until n) {
            var curr = i
            var steps = dp[i] + 1 // copy
            while (curr + i <= n) {
                dp[curr + i] = ++steps // paste
                curr += i
            }
        }

        return dp[n]
    }
}
