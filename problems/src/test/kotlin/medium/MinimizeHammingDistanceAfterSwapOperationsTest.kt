package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimizeHammingDistanceAfterSwapOperationsTest {
    @Test
    fun test1() {
        val source = intArrayOf(1, 2, 3, 4)
        val target = intArrayOf(2, 1, 4, 5)
        val allowedSwaps = arrayOf(intArrayOf(0, 1), intArrayOf(2, 3))
        val expected = 1

        assertEquals(expected, MinimizeHammingDistanceAfterSwapOperations.minimumHammingDistance(source, target, allowedSwaps))
    }

    @Test
    fun test2() {
        val source = intArrayOf(1, 2, 3, 4)
        val target = intArrayOf(1, 3, 2, 4)
        val allowedSwaps = arrayOf<IntArray>()
        val expected = 2

        assertEquals(expected, MinimizeHammingDistanceAfterSwapOperations.minimumHammingDistance(source, target, allowedSwaps))
    }

    @Test
    fun test3() {
        val source = intArrayOf(5,1,2,4,3)
        val target = intArrayOf(1,5,4,2,3)
        val allowedSwaps = arrayOf(intArrayOf(0, 4), intArrayOf(4, 2), intArrayOf(1, 3), intArrayOf(1, 4))
        val expected = 0

        assertEquals(expected, MinimizeHammingDistanceAfterSwapOperations.minimumHammingDistance(source, target, allowedSwaps))
    }
}