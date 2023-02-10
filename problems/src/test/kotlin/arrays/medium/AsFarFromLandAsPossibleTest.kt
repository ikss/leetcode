package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class AsFarFromLandAsPossibleTest {
    @Test
    fun test1() {
        val grid = arrayOf(intArrayOf(1, 0, 1), intArrayOf(0, 0, 0), intArrayOf(1, 0, 1))
        val expected = 2

        assertEquals(expected, AsFarFromLandAsPossible.maxDistance(grid))
    }

    @Test
    fun test2() {
        val grid = arrayOf(intArrayOf(1, 0, 0), intArrayOf(0, 0, 0), intArrayOf(0, 0, 0))
        val expected = 4

        assertEquals(expected, AsFarFromLandAsPossible.maxDistance(grid))
    }
}