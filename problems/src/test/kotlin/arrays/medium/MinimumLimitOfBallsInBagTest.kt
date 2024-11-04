package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumLimitOfBallsInBagTest {
    @Test
    fun test1() {
        val nums = intArrayOf(9)
        val maxOperations = 2
        val expected = 3

        assertEquals(expected, MinimumLimitOfBallsInBag.minimumSize(nums, maxOperations))
    }
    
    @Test
    fun test2() {
        val nums = intArrayOf(2, 4, 8, 2)
        val maxOperations = 4
        val expected = 2

        assertEquals(expected, MinimumLimitOfBallsInBag.minimumSize(nums, maxOperations))
    }
}