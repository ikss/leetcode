package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ValidTriangleNumberTest {
    @Test
    fun test1() {
        val nums = intArrayOf(2, 2, 3, 4)
        val expected = 3

        assertEquals(expected, ValidTriangleNumber.triangleNumber(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(4, 2, 3, 4)
        val expected = 4

        assertEquals(expected, ValidTriangleNumber.triangleNumber(nums))
    }
}