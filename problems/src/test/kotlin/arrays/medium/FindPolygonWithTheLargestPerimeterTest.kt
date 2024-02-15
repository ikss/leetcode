package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FindPolygonWithTheLargestPerimeterTest {
    @Test
    fun test1rollingSum() {
        val nums = intArrayOf(5, 5, 5)
        val expected = 15L

        assertEquals(expected, FindPolygonWithTheLargestPerimeter.largestPerimeterRollingSum(nums))
    }

    @Test
    fun test2rollingSum() {
        val nums = intArrayOf(1, 12, 1, 2, 5, 50, 3)
        val expected = 12L

        assertEquals(expected, FindPolygonWithTheLargestPerimeter.largestPerimeterRollingSum(nums))
    }

    @Test
    fun test3rollingSum() {
        val nums = intArrayOf(5, 5, 50)
        val expected = -1L

        assertEquals(expected, FindPolygonWithTheLargestPerimeter.largestPerimeterRollingSum(nums))
    }

    @Test
    fun test1simplified() {
        val nums = intArrayOf(5, 5, 5)
        val expected = 15L

        assertEquals(expected, FindPolygonWithTheLargestPerimeter.largestPerimeterSimplified(nums))
    }

    @Test
    fun test2simplified() {
        val nums = intArrayOf(1, 12, 1, 2, 5, 50, 3)
        val expected = 12L

        assertEquals(expected, FindPolygonWithTheLargestPerimeter.largestPerimeterSimplified(nums))
    }

    @Test
    fun test3simplified() {
        val nums = intArrayOf(5, 5, 50)
        val expected = -1L

        assertEquals(expected, FindPolygonWithTheLargestPerimeter.largestPerimeterSimplified(nums))
    }
}