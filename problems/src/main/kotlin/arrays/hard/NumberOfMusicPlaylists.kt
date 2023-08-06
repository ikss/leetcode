package arrays.hard

/**
 * Your music player contains n different songs. You want to listen to goal songs (not necessarily different) during
 * your trip. To avoid boredom, you will create a playlist so that:
 * * Every song is played at least once.
 * * A song can only be played again only if k other songs have been played.
 *
 * Given n, goal, and k, return the number of possible playlists that you can create.
 * Since the answer can be very large, return it modulo 10^9 + 7.
 *
 * [URL](https://leetcode.com/problems/number-of-music-playlists/)
 */
object NumberOfMusicPlaylists {
    private const val MOD = 1_000_000_007

    fun numMusicPlaylistsDp(n: Int, goal: Int, k: Int): Int {
        val dp = Array(goal + 1) { LongArray(n + 1) }
        dp[0][0] = 1

        for (i in 1..goal) {
            for (j in 1..n) {
                dp[i][j] = dp[i - 1][j - 1] * (n - j + 1)
                if (j > k) {
                    dp[i][j] += dp[i - 1][j] * (j - k)
                }
                dp[i][j] = dp[i][j] % MOD
            }
        }

        return dp[goal][n].toInt()
    }

    fun numMusicPlaylistsRecursive(n: Int, goal: Int, k: Int): Int {
        val memo = Array(goal + 1) { LongArray(n + 1) { -1L } }
        return recursive(n, goal, k, n, memo).toInt()
    }

    private fun recursive(songs: Int, goal: Int, k: Int, n: Int, memo: Array<LongArray>): Long {
        if (songs == 0 || goal == 0) {
            return if (songs == goal) 1 else 0
        }
        if (memo[goal][songs] != -1L) {
            return memo[goal][songs]
        }

        memo[goal][songs] = recursive(songs - 1, goal - 1, k, n, memo) * (n - songs + 1)
        if (songs > k) {
            memo[goal][songs] += recursive(songs, goal - 1, k, n, memo) * (songs - k)
        }
        memo[goal][songs] = memo[goal][songs] % MOD

        return memo[goal][songs]
    }
}
