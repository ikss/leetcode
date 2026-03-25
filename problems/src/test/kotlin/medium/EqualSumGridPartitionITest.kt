package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class EqualSumGridPartitionITest {
    @Test
    fun test1() {
        val grid = arrayOf(intArrayOf(1, 4), intArrayOf(2, 3))
        val expected = true

        assertEquals(expected, EqualSumGridPartitionI.canPartitionGrid(grid))
    }

    @Test
    fun test2() {
        val grid = arrayOf(intArrayOf(1, 3), intArrayOf(2, 4))
        val expected = false

        assertEquals(expected, EqualSumGridPartitionI.canPartitionGrid(grid))
    }

}