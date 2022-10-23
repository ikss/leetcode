package arrays.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class SingleNumberTest {
    @Test
    fun test1() {
        val nums = intArrayOf(2, 2, 1)
        val expected = 1

        assertEquals(expected, SingleNumber.singleNumber(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(4, 1, 2, 1, 2)
        val expected = 4

        assertEquals(expected, SingleNumber.singleNumber(nums))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(1)
        val expected = 1

        assertEquals(expected, SingleNumber.singleNumber(nums))
    }
}
