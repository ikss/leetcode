package arrays.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CountEqualAndDivisiblePairsInArrayTest {
    @Test
    fun test1() {
        val nums = intArrayOf(3, 1, 2, 2, 2, 1, 3)
        val k = 2
        val expected = 4

        assertEquals(expected, CountEqualAndDivisiblePairsInArray.countPairs(nums, k))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(1, 2, 3, 4)
        val k = 1
        val expected = 0

        assertEquals(expected, CountEqualAndDivisiblePairsInArray.countPairs(nums, k))
    }
}