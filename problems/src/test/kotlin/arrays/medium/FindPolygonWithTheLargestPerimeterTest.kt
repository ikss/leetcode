package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FindPolygonWithTheLargestPerimeterTest {
    @Test
    fun test1() {
        val nums = intArrayOf(5, 5, 5)
        val expected = 15L

        assertEquals(expected, FindPolygonWithTheLargestPerimeter.largestPerimeter(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(1, 12, 1, 2, 5, 50, 3)
        val expected = 12L

        assertEquals(expected, FindPolygonWithTheLargestPerimeter.largestPerimeter(nums))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(5, 5, 50)
        val expected = -1L

        assertEquals(expected, FindPolygonWithTheLargestPerimeter.largestPerimeter(nums))
    }
}