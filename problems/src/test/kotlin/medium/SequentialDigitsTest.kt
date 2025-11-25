package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SequentialDigitsTest {
    @Test
    fun test1own() {
        val low = 100
        val high = 300
        val expected = listOf(123, 234)

        assertEquals(expected, SequentialDigits.sequentialDigitsOwn(low, high))
    }

    @Test
    fun test2own() {
        val low = 1000
        val high = 13000
        val expected = listOf(1234, 2345, 3456, 4567, 5678, 6789, 12345)

        assertEquals(expected, SequentialDigits.sequentialDigitsOwn(low, high))
    }

    @Test
    fun test1slidingWindow() {
        val low = 100
        val high = 300
        val expected = listOf(123, 234)

        assertEquals(expected, SequentialDigits.sequentialDigitsSlidingWindow(low, high))
    }

    @Test
    fun test2slidingWindow() {
        val low = 1000
        val high = 13000
        val expected = listOf(1234, 2345, 3456, 4567, 5678, 6789, 12345)

        assertEquals(expected, SequentialDigits.sequentialDigitsSlidingWindow(low, high))
    }

}