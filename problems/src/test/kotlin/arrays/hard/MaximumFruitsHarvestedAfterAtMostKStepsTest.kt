package arrays.hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumFruitsHarvestedAfterAtMostKStepsTest {
    @Test
    fun test1() {
        val fruits = arrayOf(intArrayOf(2, 8), intArrayOf(6, 3), intArrayOf(8, 6))
        val startPos = 5
        val k = 4
        val expected = 9

        assertEquals(expected, MaximumFruitsHarvestedAfterAtMostKSteps.maxTotalFruits(fruits, startPos, k))
    }

    @Test
    fun test2() {
        val fruits = arrayOf(
            intArrayOf(0, 9),
            intArrayOf(4, 1),
            intArrayOf(5, 7),
            intArrayOf(6, 2),
            intArrayOf(7, 4),
            intArrayOf(10, 9),
        )
        val startPos = 5
        val k = 4
        val expected = 14

        assertEquals(expected, MaximumFruitsHarvestedAfterAtMostKSteps.maxTotalFruits(fruits, startPos, k))
    }


    @Test
    fun test3() {
        val fruits = arrayOf(intArrayOf(0, 3), intArrayOf(6, 4), intArrayOf(8, 5))
        val startPos = 3
        val k = 2
        val expected = 0

        assertEquals(expected, MaximumFruitsHarvestedAfterAtMostKSteps.maxTotalFruits(fruits, startPos, k))
    }
}