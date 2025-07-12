package arrays.hard

/**
 * There is a tournament where n players are participating. The players are standing in a single row and are numbered
 * from 1 to n based on their initial standing position
 * (player 1 is the first player in the row, player 2 is the second player in the row, etc.).
 *
 * The tournament consists of multiple rounds (starting from round number 1). In each round, the ith player from the
 * front of the row competes against the ith player from the end of the row, and the winner advances to the next round.
 * When the number of players is odd for the current round, the player in the middle automatically advances to the next round.
 *
 * For example, if the row consists of players 1, 2, 4, 6, 7
 * Player 1 competes against player 7.
 * Player 2 competes against player 6.
 * Player 4 automatically advances to the next round.
 * After each round is over, the winners are lined back up in the row based on the original ordering assigned to them
 * initially (ascending order).
 *
 * The players numbered firstPlayer and secondPlayer are the best in the tournament. They can win against any other
 * player before they compete against each other. If any two other players compete against each other,
 * either of them might win, and thus you may choose the outcome of this round.
 *
 * Given the integers n, firstPlayer, and secondPlayer, return an integer array containing two values, the earliest
 * possible round number and the latest possible round number in which these two players will compete against each
 * other, respectively.
 *
 * [URL](https://leetcode.com/problems/the-earliest-and-latest-rounds-where-players-compete/)
 */
object TheEarliestAndLatestRoundsWherePlayersCompete {

    private val F = Array(30) { Array(30) { IntArray(30) } }
    private val G = Array(30) { Array(30) { IntArray(30) } }

    private fun dp(n: Int, f: Int, s: Int): IntArray {
        if (F[n][f][s] != 0) {
            return intArrayOf(F[n][f][s], G[n][f][s])
        }
        if (f + s == n + 1) {
            return intArrayOf(1, 1)
        }
        // F(n,f,s) = F(n, n + 1 - s, n + 1 - f)
        if (f + s > n + 1) {
            val res = dp(n, n + 1 - s, n + 1 - f)
            F[n][f][s] = res[0]
            G[n][f][s] = res[1]
            return intArrayOf(F[n][f][s], G[n][f][s])
        }

        var earliest = Int.Companion.MAX_VALUE
        var latest = Int.Companion.MIN_VALUE
        val n_half = (n + 1) / 2
        if (s <= n_half) {
            // On the left or in the middle
            for (i in 0..<f) {
                for (j in 0..<s - f) {
                    val res = dp(n_half, i + 1, i + j + 2)
                    earliest = minOf(earliest, res[0])
                    latest = maxOf(latest, res[1])
                }
            }
        } else {
            // s on the right
            val s_prime = n + 1 - s
            val mid = (n - 2 * s_prime + 1) / 2
            for (i in 0..<f) {
                for (j in 0..<s_prime - f) {
                    val res = dp(n_half, i + 1, i + j + mid + 2)
                    earliest = minOf(earliest, res[0])
                    latest = maxOf(latest, res[1])
                }
            }
        }

        F[n][f][s] = earliest + 1
        G[n][f][s] = latest + 1
        return intArrayOf(F[n][f][s], G[n][f][s])
    }

    fun earliestAndLatest(n: Int, firstPlayer: Int, secondPlayer: Int): IntArray {
        // F(n,f,s) = F(n,s,f)
        var firstPlayer = firstPlayer
        var secondPlayer = secondPlayer
        if (firstPlayer > secondPlayer) {
            val temp = firstPlayer
            firstPlayer = secondPlayer
            secondPlayer = temp
        }

        val res = dp(n, firstPlayer, secondPlayer)
        return intArrayOf(res[0], res[1])
    }
}
