package medium

/**
 * Imagine you have a special keyboard with the following keys:
 *
 * * A: Print one 'A' on the screen.
 * * Ctrl-A: Select the whole screen.
 * * Ctrl-C: Copy selection to buffer.
 * * Ctrl-V: Print buffer on screen appending it after what has already been printed.
 *
 * Given an integer n, return the maximum number of 'A' you can print on the screen with at most n presses on the keys.
 *
 * [URL](https://leetcode.com/problems/4-keys-keyboard/)
 */
object `4KeysKeyboard` {
    fun maxA(n: Int): Int {
        val dp = IntArray(n + 1) { it }

        for (i in 0 .. n - 3) {
            for (j in i + 3 .. minOf(n, i + 6)) {
                dp[j] = maxOf(dp[j], (j - i - 1) * dp[i])
            }
        }
        return dp[n]
    }
}
