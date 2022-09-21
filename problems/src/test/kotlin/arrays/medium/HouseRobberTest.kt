package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class HouseRobberTest {
    @Test
    fun test1() {
        val nums = intArrayOf(1, 2, 3, 1)
        val expected = 4

        assertEquals(expected, HouseRobber.rob(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(2, 1, 1, 2)
        val expected = 4

        assertEquals(expected, HouseRobber.rob(nums))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(2, 7, 9, 3, 1)
        val expected = 12

        assertEquals(expected, HouseRobber.rob(nums))
    }
}
