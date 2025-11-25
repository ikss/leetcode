package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumNumberOfTapsToOpenToWaterGardenTest {
    @Test
    fun test1ownGreedy() {
        val n = 5
        val ranges = intArrayOf(3, 4, 1, 1, 0, 0)
        val expected = 1

        assertEquals(expected, MinimumNumberOfTapsToOpenToWaterGarden.minTapsOwnGreedy(n, ranges))
    }

    @Test
    fun test2ownGreedy() {
        val n = 3
        val ranges = intArrayOf(0, 0, 0, 0)
        val expected = -1

        assertEquals(expected, MinimumNumberOfTapsToOpenToWaterGarden.minTapsOwnGreedy(n, ranges))
    }

    @Test
    fun test3ownGreedy() {
        val n = 7
        val ranges = intArrayOf(1, 2, 1, 0, 2, 1, 0, 1)
        val expected = 3

        assertEquals(expected, MinimumNumberOfTapsToOpenToWaterGarden.minTapsOwnGreedy(n, ranges))
    }

    @Test
    fun test1dp() {
        val n = 5
        val ranges = intArrayOf(3, 4, 1, 1, 0, 0)
        val expected = 1

        assertEquals(expected, MinimumNumberOfTapsToOpenToWaterGarden.minTapsDp(n, ranges))
    }

    @Test
    fun test2dp() {
        val n = 3
        val ranges = intArrayOf(0, 0, 0, 0)
        val expected = -1

        assertEquals(expected, MinimumNumberOfTapsToOpenToWaterGarden.minTapsDp(n, ranges))
    }

    @Test
    fun test3dp() {
        val n = 7
        val ranges = intArrayOf(1, 2, 1, 0, 2, 1, 0, 1)
        val expected = 3

        assertEquals(expected, MinimumNumberOfTapsToOpenToWaterGarden.minTapsDp(n, ranges))
    }

    @Test
    fun test1greedy() {
        val n = 5
        val ranges = intArrayOf(3, 4, 1, 1, 0, 0)
        val expected = 1

        assertEquals(expected, MinimumNumberOfTapsToOpenToWaterGarden.minTapsGreedy(n, ranges))
    }

    @Test
    fun test2greedy() {
        val n = 3
        val ranges = intArrayOf(0, 0, 0, 0)
        val expected = -1

        assertEquals(expected, MinimumNumberOfTapsToOpenToWaterGarden.minTapsGreedy(n, ranges))
    }

    @Test
    fun test3greedy() {
        val n = 7
        val ranges = intArrayOf(1, 2, 1, 0, 2, 1, 0, 1)
        val expected = 3

        assertEquals(expected, MinimumNumberOfTapsToOpenToWaterGarden.minTapsGreedy(n, ranges))
    }
}