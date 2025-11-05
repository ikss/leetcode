package arrays.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LargestTriangleAreaTest {
    @Test
    fun test1() {
        val points = arrayOf(intArrayOf(0, 0), intArrayOf(0, 1), intArrayOf(1, 0), intArrayOf(0, 2), intArrayOf(2, 0))
        val expected = 2.00000

        assertEquals(expected, LargestTriangleArea.largestTriangleArea(points), 0.00001)
    }

    @Test
    fun test2() {
        val points = arrayOf(intArrayOf(1, 0), intArrayOf(0, 0), intArrayOf(0, 1))
        val expected = 0.50000

        assertEquals(expected, LargestTriangleArea.largestTriangleArea(points), 0.00001)
    }

    @Test
    fun test1Shoelace() {
        val points = arrayOf(intArrayOf(0, 0), intArrayOf(0, 1), intArrayOf(1, 0), intArrayOf(0, 2), intArrayOf(2, 0))
        val expected = 2.00000

        assertEquals(expected, LargestTriangleArea.largestTriangleAreaShoelace(points), 0.00001)
    }

    @Test
    fun test2Shoelace() {
        val points = arrayOf(intArrayOf(1, 0), intArrayOf(0, 0), intArrayOf(0, 1))
        val expected = 0.50000

        assertEquals(expected, LargestTriangleArea.largestTriangleAreaShoelace(points), 0.00001)
    }
}