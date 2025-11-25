package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LargestPerimeterTriangleTest {
    @Test
    fun test1() {
        val nums = intArrayOf(2, 1, 2)
        val expected = 5

        assertEquals(expected, LargestPerimeterTriangle.largestPerimeter(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(1, 2, 1)
        val expected = 0

        assertEquals(expected, LargestPerimeterTriangle.largestPerimeter(nums))
    }
}