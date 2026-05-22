package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FixedPointTest {
    @Test
    fun test1() {
        val arr = intArrayOf(-10, -5, 0, 3, 7)
        val expected = 3

        assertEquals(expected, FixedPoint.fixedPoint(arr))
    }

    @Test
    fun test2() {
        val arr = intArrayOf(0, 2, 5, 8, 17)
        val expected = 0

        assertEquals(expected, FixedPoint.fixedPoint(arr))
    }

    @Test
    fun test3() {
        val arr = intArrayOf(-10, -5, 3, 4, 7, 9)
        val expected = -1

        assertEquals(expected, FixedPoint.fixedPoint(arr))
    }
}