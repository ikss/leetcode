package graphs.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumScoreOfPathBetweenTwoCitiesTest {
    @Test
    fun test1() {
        val n = 4
        val roads = arrayOf(intArrayOf(1, 2, 9), intArrayOf(2, 3, 6), intArrayOf(2, 4, 5), intArrayOf(1, 4, 7))
        val expected = 5

        assertEquals(expected, MinimumScoreOfPathBetweenTwoCities.minScore(n, roads))
    }

    @Test
    fun test2() {
        val n = 4
        val roads = arrayOf(intArrayOf(1, 2, 2), intArrayOf(1, 3, 4), intArrayOf(3, 4, 7))
        val expected = 2

        assertEquals(expected, MinimumScoreOfPathBetweenTwoCities.minScore(n, roads))
    }
}