package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CountNumberOfTrapezoidsIITest {
    @Test
    fun test1() {
        val points = arrayOf(intArrayOf(-3, 2), intArrayOf(3, 0), intArrayOf(2, 3), intArrayOf(3, 2), intArrayOf(2, -3))
        val expected = 2

        assertEquals(expected, CountNumberOfTrapezoidsII.countTrapezoids(points))
    }

    @Test
    fun test2() {
        val points = arrayOf(intArrayOf(0, 0), intArrayOf(1, 0), intArrayOf(0, 1), intArrayOf(2, 1))
        val expected = 1

        assertEquals(expected, CountNumberOfTrapezoidsII.countTrapezoids(points))
    }
}