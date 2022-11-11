package arrays.hard

/**
 * The demons had captured the princess and imprisoned her in the bottom-right corner of a dungeon.
 * The dungeon consists of m x n rooms laid out in a 2D grid. Our valiant knight was initially positioned
 * in the top-left room and must fight his way through dungeon to rescue the princess.
 *
 * The knight has an initial health point represented by a positive integer.
 * If at any point his health point drops to 0 or below, he dies immediately.
 *
 * Some of the rooms are guarded by demons (represented by negative integers),
 * so the knight loses health upon entering these rooms; other rooms are either empty (represented as 0)
 * or contain magic orbs that increase the knight's health (represented by positive integers).
 *
 * To reach the princess as quickly as possible, the knight decides to move only rightward or downward in each step.
 *
 * Return the knight's minimum initial health so that he can rescue the princess.
 *
 * Note that any room can contain threats or power-ups, even the first room the knight enters and the bottom-right room
 * where the princess is imprisoned.
 *
 * [URL](https://leetcode.com/problems/dungeon-game/)
 */
object DungeonGame {
    fun calculateMinimumHP(dungeon: Array<IntArray>): Int {
        val m = dungeon.size
        val n = dungeon[0].size
        val dp = Array(n) { IntArray(m) }

        dp[m - 1][n - 1] = minOf(0, dungeon[m - 1][n - 1])

        for (i in m - 2 downTo 0) {
            dp[i][n - 1] = minOf(dp[i + 1][n - 1] + dungeon[i][n - 1], 0)
        }

        for (j in n - 2 downTo 0) {
            dp[m - 1][j] = minOf(dp[m - 1][j + 1] + dungeon[m - 1][j], 0)

        }

        for (i in m - 2 downTo 0) {
            for (j in n - 2 downTo 0) {
                val down = minOf(dp[i + 1][j] + dungeon[i][j], 0)
                val right = minOf(dp[i][j + 1] + dungeon[i][j], 0)
                dp[i][j] = maxOf(right, down)
            }
        }
        println(dp.contentDeepToString())
        return Math.abs(dp[0][0]) + 1
    }
}