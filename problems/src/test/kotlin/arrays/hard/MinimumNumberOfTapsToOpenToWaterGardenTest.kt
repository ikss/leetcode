package arrays.hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumNumberOfTapsToOpenToWaterGardenTest {
    @Test
    fun test1ownSolution() {
        val n = 5
        val ranges = intArrayOf(3, 4, 1, 1, 0, 0)
        val expected = 1

        assertEquals(expected, MinimumNumberOfTapsToOpenToWaterGarden.minTapsOwnSolution(n, ranges))
    }

    @Test
    fun test2ownSolution() {
        val n = 3
        val ranges = intArrayOf(0, 0, 0, 0)
        val expected = -1

        assertEquals(expected, MinimumNumberOfTapsToOpenToWaterGarden.minTapsOwnSolution(n, ranges))
    }

    @Test
    fun test3ownSolution() {
        val n = 7
        val ranges = intArrayOf(1, 2, 1, 0, 2, 1, 0, 1)
        val expected = 3

        assertEquals(expected, MinimumNumberOfTapsToOpenToWaterGarden.minTapsOwnSolution(n, ranges))
    }
}