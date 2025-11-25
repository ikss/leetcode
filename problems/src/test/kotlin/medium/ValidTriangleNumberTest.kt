package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ValidTriangleNumberTest {
    @Test
    fun test1Cubic() {
        val nums = intArrayOf(2, 2, 3, 4)
        val expected = 3

        assertEquals(expected, ValidTriangleNumber.triangleNumberCubic(nums))
    }

    @Test
    fun test2Cubic() {
        val nums = intArrayOf(4, 2, 3, 4)
        val expected = 4

        assertEquals(expected, ValidTriangleNumber.triangleNumberCubic(nums))
    }

    @Test
    fun test1Linear() {
        val nums = intArrayOf(2, 2, 3, 4)
        val expected = 3

        assertEquals(expected, ValidTriangleNumber.triangleNumberLinear(nums))
    }

    @Test
    fun test2Linear() {
        val nums = intArrayOf(4, 2, 3, 4)
        val expected = 4

        assertEquals(expected, ValidTriangleNumber.triangleNumberLinear(nums))
    }
}