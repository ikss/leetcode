package medium

/**
 * Alice and Bob take turns playing a game, with Alice starting first.
 *
 * You are given a string num of even length consisting of digits and '?' characters.
 * On each turn, a player will do the following if there is still at least one '?' in num:
 * 1. Choose an index i where `num[i] == '?'`.
 * 2. Replace `num[i]` with any digit between '0' and '9'.
 *
 * The game ends when there are no more '?' characters in num.
 *
 * For Bob to win, the sum of the digits in the first half of num must be equal to the sum of the digits in the
 * second half. For Alice to win, the sums must not be equal.
 * * For example, if the game ended with num = "243801", then Bob wins because 2+4+3 = 8+0+1.
 *
 * If the game ended with num = "243803", then Alice wins because 2+4+3 != 8+0+3.
 * Assuming Alice and Bob play optimally, return true if Alice will win and false if Bob will win.
 *
 * [URL](https://leetcode.com/problems/sum-game/)
 */
object SumGame {

    fun sumGame(num: String): Boolean {
        val n = num.length
        val left = calculate(num.substring(0, n / 2))
        val right = calculate(num.substring(n / 2, n))

        val (n0, q0) = left
        val (n1, q1) = right

        return (q0 + q1) % 2 == 1 || n0 - n1 != ((q1 - q0) * 9) / 2
    }

    private fun calculate(s: String): Pair<Int, Int> {
        var sum = 0
        var questionCount = 0
        for (c in s) {
            if (c == '?') {
                questionCount++
            } else {
                sum += c - '0'
            }
        }
        return sum to questionCount
    }
}
