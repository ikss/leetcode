package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class TrionicArrayIITest {
    @Test
    fun test1() {
        val nums = intArrayOf(0, -2, -1, -3, 0, 2, -1)
        val expected = -4L

        assertEquals(expected, TrionicArrayII.maxSumTrionic(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(1, 4, 2, 7)
        val expected = 14L

        assertEquals(expected, TrionicArrayII.maxSumTrionic(nums))
    }
}