package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class BestTeamWithNoConflictsTest {
    @Test
    fun test1() {
        val scores = intArrayOf(1, 3, 5, 10, 15)
        val ages = intArrayOf(1, 2, 3, 4, 5)
        val expected = 34

        assertEquals(expected, BestTeamWithNoConflicts.bestTeamScore(scores, ages))
    }

    @Test
    fun test2() {
        val scores = intArrayOf(4, 5, 6, 5)
        val ages = intArrayOf(2, 1, 2, 1)
        val expected = 16

        assertEquals(expected, BestTeamWithNoConflicts.bestTeamScore(scores, ages))
    }

    @Test
    fun test3() {
        val scores = intArrayOf(1, 2, 3, 5)
        val ages = intArrayOf(8, 9, 10, 1)
        val expected = 6

        assertEquals(expected, BestTeamWithNoConflicts.bestTeamScore(scores, ages))
    }
}