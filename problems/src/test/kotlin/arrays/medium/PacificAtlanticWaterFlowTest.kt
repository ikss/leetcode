package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class PacificAtlanticWaterFlowTest {
    @Test
    fun test1Stack() {
        val heights = arrayOf(
            intArrayOf(1, 2, 2, 3, 5),
            intArrayOf(3, 2, 3, 4, 4),
            intArrayOf(2, 4, 5, 3, 1),
            intArrayOf(6, 7, 1, 4, 5),
            intArrayOf(5, 1, 1, 2, 4),
        )
        val expected = listOf(
            listOf(0, 4), listOf(1, 3), listOf(1, 4), listOf(2, 2), listOf(3, 0), listOf(3, 1), listOf(4, 0),
        )

        assertEquals(expected, PacificAtlanticWaterFlow.pacificAtlanticQueue(heights))
    }

    @Test
    fun test2Stack() {
        val heights = arrayOf(intArrayOf(1))
        val expected = listOf(listOf(0, 0))

        assertEquals(expected, PacificAtlanticWaterFlow.pacificAtlanticStack(heights))
    }

    @Test
    fun test3Stack() {
        val heights = arrayOf(
            intArrayOf(1, 2, 3),
            intArrayOf(8, 9, 4),
            intArrayOf(7, 6, 5),
        )
        val expected = listOf(
            listOf(0, 2), listOf(1, 0), listOf(1, 1), listOf(1, 2), listOf(2, 0), listOf(2, 1), listOf(2, 2),
        )

        assertEquals(expected, PacificAtlanticWaterFlow.pacificAtlanticStack(heights))
    }

    @Test
    fun test1Queue() {
        val heights = arrayOf(
            intArrayOf(1, 2, 2, 3, 5),
            intArrayOf(3, 2, 3, 4, 4),
            intArrayOf(2, 4, 5, 3, 1),
            intArrayOf(6, 7, 1, 4, 5),
            intArrayOf(5, 1, 1, 2, 4),
        )
        val expected = listOf(
            listOf(0, 4), listOf(1, 3), listOf(1, 4), listOf(2, 2), listOf(3, 0), listOf(3, 1), listOf(4, 0),
        )

        assertEquals(expected, PacificAtlanticWaterFlow.pacificAtlanticQueue(heights))
    }

    @Test
    fun test2Queue() {
        val heights = arrayOf(intArrayOf(1))
        val expected = listOf(listOf(0, 0))

        assertEquals(expected, PacificAtlanticWaterFlow.pacificAtlanticStack(heights))
    }

    @Test
    fun test3Queue() {
        val heights = arrayOf(
            intArrayOf(1, 2, 3),
            intArrayOf(8, 9, 4),
            intArrayOf(7, 6, 5),
        )
        val expected = listOf(
            listOf(0, 2), listOf(1, 0), listOf(1, 1), listOf(1, 2), listOf(2, 0), listOf(2, 1), listOf(2, 2),
        )

        assertEquals(expected, PacificAtlanticWaterFlow.pacificAtlanticStack(heights))
    }
}
