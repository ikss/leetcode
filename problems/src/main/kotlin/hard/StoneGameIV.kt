package hard

/**
 * Alice and Bob take turns playing a game, with Alice starting first.
 *
 * Initially, there are n stones in a pile. On each player's turn,
 * that player makes a move consisting of removing any non-zero square number of stones in the pile.
 *
 * Also, if a player cannot make a move, he/she loses the game.
 *
 * Given a positive integer n, return true if and only if Alice wins the game otherwise return false,
 * assuming both players play optimally.
 *
 * [URL](https://leetcode.com/problems/stone-game-iv/)
 */
object StoneGameIV {
    fun winnerSquareGameRecursive(n: Int): Boolean {
        val memo = IntArray(n + 1)
        memo[0] = -1

        val possibleTakes = getTakes(n)

        return canWin(n, memo, possibleTakes)
    }

    private fun getTakes(n: Int): List<Int> {
        val result = ArrayList<Int>()
        for (i in 1..Math.sqrt(n.toDouble()).toInt()) {
            result.add(i * i)
        }

        return result
    }

    private fun canWin(num: Int, memo: IntArray, takes: List<Int>): Boolean {
        val memoized = memo[num]
        if (memoized == 1) {
            return true
        } else if (memoized == -1) {
            return false
        }

        var result = false
        for (taken in takes) {
            if (taken > num) break

            if (!canWin(num - taken, memo, takes)) {
                result = true
                break
            }
        }
        memo[num] = if (result) 1 else -1

        return result
    }

    fun winnerSquareGameDp(n: Int): Boolean {
        val dp = BooleanArray(n + 1)

        for (i in 1..n) {
            var j = 1

            while (j * j <= i) {
                if (!dp[i - j * j]) {
                    dp[i] = true
                }
                j++
            }
        }

        return dp[n]
    }
}
