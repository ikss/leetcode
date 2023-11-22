package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumDistanceInArraysTest {
    @Test
    fun test1() {
        val arrays = listOf(
            listOf(1, 2, 3),
            listOf(4, 5),
            listOf(1, 2, 3),
        )
        val expected = 4

        assertEquals(expected, MaximumDistanceInArrays.maxDistance(arrays))
    }

    @Test
    fun test2() {
        val arrays = listOf(
            listOf(1, 4),
            listOf(0, 5),
        )
        val expected = 4

        assertEquals(expected, MaximumDistanceInArrays.maxDistance(arrays))
    }
}