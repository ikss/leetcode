package arrays.hard

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class TheEarliestAndLatestRoundsWherePlayersCompeteTest {
    @Test
    fun test1() {
        val n = 11
        val firstPlayer = 2
        val secondPlayer = 4
        val expected = intArrayOf(3, 4)

        assertArrayEquals(expected, TheEarliestAndLatestRoundsWherePlayersCompete.earliestAndLatest(n, firstPlayer, secondPlayer))
    }

    @Test
    fun test2() {
        val n = 5
        val firstPlayer = 1
        val secondPlayer = 5
        val expected = intArrayOf(1, 1)

        assertArrayEquals(expected, TheEarliestAndLatestRoundsWherePlayersCompete.earliestAndLatest(n, firstPlayer, secondPlayer))
    }
}