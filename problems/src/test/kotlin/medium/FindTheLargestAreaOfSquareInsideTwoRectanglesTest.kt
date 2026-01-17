package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FindTheLargestAreaOfSquareInsideTwoRectanglesTest {
    @Test
    fun test1() {
        val bottomLeft = arrayOf(intArrayOf(1, 1), intArrayOf(2, 2), intArrayOf(3, 1))
        val topRight = arrayOf(intArrayOf(3, 3), intArrayOf(4, 4), intArrayOf(6, 6))
        val expected = 1L

        assertEquals(expected, FindTheLargestAreaOfSquareInsideTwoRectangles.largestSquareArea(bottomLeft, topRight))
    }

    @Test
    fun test2() {
        val bottomLeft = arrayOf(intArrayOf(1, 1), intArrayOf(1, 3), intArrayOf(1, 5))
        val topRight = arrayOf(intArrayOf(5, 5), intArrayOf(5, 7), intArrayOf(5, 9))
        val expected = 4L

        assertEquals(expected, FindTheLargestAreaOfSquareInsideTwoRectangles.largestSquareArea(bottomLeft, topRight))
    }

    @Test
    fun test3() {
        val bottomLeft = arrayOf(intArrayOf(1, 1), intArrayOf(2, 2), intArrayOf(1, 2))
        val topRight = arrayOf(intArrayOf(3, 3), intArrayOf(4, 4), intArrayOf(3, 4))
        val expected = 1L

        assertEquals(expected, FindTheLargestAreaOfSquareInsideTwoRectangles.largestSquareArea(bottomLeft, topRight))
    }

    @Test
    fun test4() {
        val bottomLeft = arrayOf(intArrayOf(1, 1), intArrayOf(3, 3), intArrayOf(3, 1))
        val topRight = arrayOf(intArrayOf(2, 2), intArrayOf(4, 4), intArrayOf(4, 2))
        val expected = 0L

        assertEquals(expected, FindTheLargestAreaOfSquareInsideTwoRectangles.largestSquareArea(bottomLeft, topRight))
    }
}