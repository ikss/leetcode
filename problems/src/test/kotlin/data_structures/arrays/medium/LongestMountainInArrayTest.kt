package data_structures.arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LongestMountainInArrayTest {

    @Test
    fun test1() {
        val arr = intArrayOf(2, 1, 4, 7, 3, 2, 5)
        val expected = 5

        assertEquals(expected, LongestMountainInArray.longestMountain(arr))
    }

    @Test
    fun test2() {
        val arr = intArrayOf(2, 2, 2)
        val expected = 0

        assertEquals(expected, LongestMountainInArray.longestMountain(arr))
    }

    @Test
    fun test3() {
        val arr = intArrayOf()
        val expected = 0

        assertEquals(expected, LongestMountainInArray.longestMountain(arr))
    }
}
