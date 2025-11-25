package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FindPlayersWithZeroOrOneLossesTest {
    @Test
    fun test1() {
        val matches = arrayOf(
            intArrayOf(1, 3),
            intArrayOf(2, 3),
            intArrayOf(3, 6),
            intArrayOf(5, 6),
            intArrayOf(5, 7),
            intArrayOf(4, 5),
            intArrayOf(4, 8),
            intArrayOf(4, 9),
            intArrayOf(10, 4),
            intArrayOf(10, 9),
        )
        val expected = listOf(listOf(1, 2, 10), listOf(4, 5, 7, 8))

        assertEquals(expected, FindPlayersWithZeroOrOneLosses.findWinners(matches))
    }

    @Test
    fun test2() {
        val matches = arrayOf(
            intArrayOf(2, 3),
            intArrayOf(1, 3),
            intArrayOf(5, 4),
            intArrayOf(6, 4),
        )
        val expected = listOf(listOf(1, 2, 5, 6), emptyList())

        assertEquals(expected, FindPlayersWithZeroOrOneLosses.findWinners(matches))
    }
}