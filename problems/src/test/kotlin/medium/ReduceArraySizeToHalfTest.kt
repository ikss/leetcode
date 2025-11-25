package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ReduceArraySizeToHalfTest {
    @Test
    fun test1() {
        val arr = intArrayOf(3, 3, 3, 3, 5, 5, 5, 2, 2, 7)
        val expected = 2

        assertEquals(expected, ReduceArraySizeToHalf.minSetSize(arr))
    }

    @Test
    fun test2() {
        val arr = intArrayOf(7, 7, 7, 7, 7, 7)
        val expected = 1

        assertEquals(expected, ReduceArraySizeToHalf.minSetSize(arr))
    }
}
