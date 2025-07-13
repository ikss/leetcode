package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumMatchingOfPlayersWithTrainersTest {
    @Test
    fun test1() {
        val players = intArrayOf(4, 7, 9)
        val trainers = intArrayOf(8, 2, 5, 8)
        val expected = 2

        assertEquals(expected, MaximumMatchingOfPlayersWithTrainers.matchPlayersAndTrainers(players, trainers))
    }

    @Test
    fun test2() {
        val players = intArrayOf(1, 1)
        val trainers = intArrayOf(10)
        val expected = 1

        assertEquals(expected, MaximumMatchingOfPlayersWithTrainers.matchPlayersAndTrainers(players, trainers))
    }
}