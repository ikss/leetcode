package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ButtonWithLongestPushTimeTest {
    @Test
    fun test1() {
        val events = arrayOf(intArrayOf(1, 2), intArrayOf(2, 5), intArrayOf(3, 9), intArrayOf(1, 15))
        val expected = 1

        assertEquals(expected, ButtonWithLongestPushTime.buttonWithLongestTime(events))
    }

    @Test
    fun test2() {
        val events = arrayOf(intArrayOf(10, 25), intArrayOf(1, 7))
        val expected = 10

        assertEquals(expected, ButtonWithLongestPushTime.buttonWithLongestTime(events))
    }

    @Test
    fun test3() {
        val events = arrayOf(
            intArrayOf(9, 4),
            intArrayOf(19, 5),
            intArrayOf(2, 8),
            intArrayOf(3, 11),
            intArrayOf(2, 15),
        )
        val expected = 2

        assertEquals(expected, ButtonWithLongestPushTime.buttonWithLongestTime(events))
    }
}