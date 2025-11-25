package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FindKClosestElementsTest {
    @Test
    fun test1() {
        val arr = intArrayOf(1, 2, 3, 4, 5)
        val k = 4
        val x = 3
        val expected = listOf(1, 2, 3, 4)

        assertEquals(expected, FindKClosestElements.findClosestElements(arr, k, x))
    }

    @Test
    fun test2() {
        val arr = intArrayOf(1, 2, 3, 4, 5)
        val k = 4
        val x = -1
        val expected = listOf(1, 2, 3, 4)

        assertEquals(expected, FindKClosestElements.findClosestElements(arr, k, x))
    }
}