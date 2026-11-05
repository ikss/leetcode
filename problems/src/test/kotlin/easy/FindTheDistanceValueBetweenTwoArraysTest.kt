package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FindTheDistanceValueBetweenTwoArraysTest {
    @Test
    fun test1() {
        val arr1 = intArrayOf(4, 5, 8)
        val arr2 = intArrayOf(10, 9, 1, 8)
        val d = 2
        val expected = 2

        assertEquals(expected, FindTheDistanceValueBetweenTwoArrays.findTheDistanceValue(arr1, arr2, d))
    }

    @Test
    fun test2() {
        val arr1 = intArrayOf(1, 4, 2, 3)
        val arr2 = intArrayOf(-4, -3, 6, 10, 20, 30)
        val d = 3
        val expected = 2

        assertEquals(expected, FindTheDistanceValueBetweenTwoArrays.findTheDistanceValue(arr1, arr2, d))
    }


    @Test
    fun test3() {
        val arr1 = intArrayOf(2, 1, 100, 3)
        val arr2 = intArrayOf(-5, -2, 10, -3, 7)
        val d = 6
        val expected = 1

        assertEquals(expected, FindTheDistanceValueBetweenTwoArrays.findTheDistanceValue(arr1, arr2, d))
    }
}