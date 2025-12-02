package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CountNumberOfTrapezoidsITest {
    @Test
    fun test1() {
        val input = arrayOf(
            intArrayOf(1, 0),
            intArrayOf(2, 0),
            intArrayOf(3, 0),
            intArrayOf(2, 2),
            intArrayOf(3, 2),
        )
        val expected = 3

        assertEquals(expected, CountNumberOfTrapezoidsI.countTrapezoids(input))
    }

    @Test
    fun test2() {
        val input = arrayOf(
            intArrayOf(0, 0),
            intArrayOf(1, 0),
            intArrayOf(0, 1),
            intArrayOf(2, 1),
        )
        val expected = 1

        assertEquals(expected, CountNumberOfTrapezoidsI.countTrapezoids(input))
    }
}