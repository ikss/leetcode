package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MostStonesRemovedWithSameRowOrColumnTest {
    @Test
    fun test1() {
        val stones = arrayOf(
            intArrayOf(0, 0),
            intArrayOf(0, 1),
            intArrayOf(1, 0),
            intArrayOf(1, 2),
            intArrayOf(2, 1),
            intArrayOf(2, 2),
        )
        val expected = 5

        assertEquals(expected, MostStonesRemovedWithSameRowOrColumn.removeStones(stones))
    }

    @Test
    fun test2() {
        val stones = arrayOf(
            intArrayOf(0, 0),
            intArrayOf(0, 2),
            intArrayOf(1, 1),
            intArrayOf(2, 0),
            intArrayOf(2, 2),
        )
        val expected = 3

        assertEquals(expected, MostStonesRemovedWithSameRowOrColumn.removeStones(stones))
    }

    @Test
    fun test3() {
        val stones = arrayOf(
            intArrayOf(0, 0),
        )
        val expected = 0

        assertEquals(expected, MostStonesRemovedWithSameRowOrColumn.removeStones(stones))
    }
}