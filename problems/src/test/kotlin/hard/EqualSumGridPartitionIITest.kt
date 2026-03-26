package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class EqualSumGridPartitionIITest {
    @Test
    fun test1() {
        val grid = arrayOf(intArrayOf(1, 4), intArrayOf(2, 3))
        val expected = true

        assertEquals(expected, EqualSumGridPartitionII.canPartitionGrid(grid))
    }

    @Test
    fun test2() {
        val grid = arrayOf(intArrayOf(1, 2), intArrayOf(3, 4))
        val expected = true

        assertEquals(expected, EqualSumGridPartitionII.canPartitionGrid(grid))
    }

    @Test
    fun test3() {
        val grid = arrayOf(intArrayOf(1, 2, 4), intArrayOf(2, 3, 5))
        val expected = false

        assertEquals(expected, EqualSumGridPartitionII.canPartitionGrid(grid))
    }

    @Test
    fun test4() {
        val grid = arrayOf(intArrayOf(4, 1, 8), intArrayOf(3, 2, 6))
        val expected = false

        assertEquals(expected, EqualSumGridPartitionII.canPartitionGrid(grid))
    }
}