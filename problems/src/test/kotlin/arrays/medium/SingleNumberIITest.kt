package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SingleNumberIITest {
    @Test
    fun test1() {
        val nums = intArrayOf(2, 2, 3, 2)
        val expected = 3

        assertEquals(expected, SingleNumberII.singleNumber(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(0, 1, 0, 1, 0, 1, 99)
        val expected = 99

        assertEquals(expected, SingleNumberII.singleNumber(nums))
    }
}