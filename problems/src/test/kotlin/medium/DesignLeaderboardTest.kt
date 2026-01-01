package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DesignLeaderboardTest {
    @Test
    fun test1() {
        val leaderboard = DesignLeaderboard.Leaderboard()
        leaderboard.addScore(1, 13)
        leaderboard.addScore(2, 93)
        leaderboard.addScore(3, 84)
        leaderboard.addScore(4, 6)
        leaderboard.addScore(5, 89)
        leaderboard.addScore(6, 31)
        leaderboard.addScore(7, 7)
        leaderboard.addScore(8, 1)
        leaderboard.addScore(9, 98)
        leaderboard.addScore(10, 42)
        assertEquals(406, leaderboard.top(5))

        leaderboard.reset(1)
        leaderboard.reset(2)
        leaderboard.addScore(3, 76)
        leaderboard.addScore(4, 68)
        assertEquals(160, leaderboard.top(1))

        leaderboard.reset(3)
        leaderboard.reset(4)
        leaderboard.addScore(2, 70)
        leaderboard.reset(2)
    }
}