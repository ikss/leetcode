package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class IntersectionOfThreeArraysTest {
    @Test
    fun test1() {
        val arr1 = intArrayOf(1, 2, 3, 4, 5)
        val arr2 = intArrayOf(1, 2, 5, 7, 9)
        val arr3 = intArrayOf(1, 3, 4, 5, 8)
        val expected = listOf(1, 5)

        assertEquals(expected, IntersectionOfThreeArrays.arraysIntersection(arr1, arr2, arr3))
    }

    @Test
    fun test2() {
        val arr1 = intArrayOf(197, 418, 523, 876, 1356)
        val arr2 = intArrayOf(501, 880, 1593, 1710, 1870)
        val arr3 = intArrayOf(521, 682, 1337, 1395, 1764)
        val expected = emptyList<Int>()

        assertEquals(expected, IntersectionOfThreeArrays.arraysIntersection(arr1, arr2, arr3))
    }
}