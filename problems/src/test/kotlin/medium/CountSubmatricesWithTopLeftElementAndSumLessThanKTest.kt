package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CountSubmatricesWithTopLeftElementAndSumLessThanKTest {
    @Test
    fun test1_2DSumPlusBinarySearch() {
        val grid = arrayOf(intArrayOf(7, 6, 3), intArrayOf(6, 6, 1))
        val k = 18
        val expected = 4

        assertEquals(expected, CountSubmatricesWithTopLeftElementAndSumLessThanK.countSubmatrices_2DSumPlusBinarySearch(grid, k))
    }

    @Test
    fun test2_2DSumPlusBinarySearch() {
        val grid = arrayOf(intArrayOf(7, 2, 9), intArrayOf(1, 5, 0), intArrayOf(2, 6, 6))
        val k = 20
        val expected = 6

        assertEquals(expected, CountSubmatricesWithTopLeftElementAndSumLessThanK.countSubmatrices_2DSumPlusBinarySearch(grid, k))
    }

    @Test
    fun test1_2DSum() {
        val grid = arrayOf(intArrayOf(7, 6, 3), intArrayOf(6, 6, 1))
        val k = 18
        val expected = 4

        assertEquals(expected, CountSubmatricesWithTopLeftElementAndSumLessThanK.countSubmatrices_2DSum(grid, k))
    }

    @Test
    fun test2_2DSum() {
        val grid = arrayOf(intArrayOf(7, 2, 9), intArrayOf(1, 5, 0), intArrayOf(2, 6, 6))
        val k = 20
        val expected = 6

        assertEquals(expected, CountSubmatricesWithTopLeftElementAndSumLessThanK.countSubmatrices_2DSum(grid, k))
    }
}