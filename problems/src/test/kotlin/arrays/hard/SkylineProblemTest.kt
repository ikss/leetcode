package arrays.hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SkylineProblemTest {

    @Test
    fun test1() {
        val buildings = arrayOf(
            intArrayOf(2, 9, 10),
            intArrayOf(3, 7, 15),
            intArrayOf(5, 12, 12),
            intArrayOf(15, 20, 10),
            intArrayOf(19, 24, 8),
        )
        val expected = listOf(
            listOf(2, 10),
            listOf(3, 15),
            listOf(7, 12),
            listOf(12, 0),
            listOf(15, 10),
            listOf(20, 8),
            listOf(24, 0),
        )

        assertEquals(expected, SkylineProblem.getSkyline(buildings))
    }

    @Test
    fun test2() {
        val buildings = arrayOf(
            intArrayOf(0, 2, 3),
            intArrayOf(2, 5, 3),
        )
        val expected = listOf(
            listOf(0, 3),
            listOf(5, 0),
        )

        assertEquals(expected, SkylineProblem.getSkyline(buildings))
    }
}