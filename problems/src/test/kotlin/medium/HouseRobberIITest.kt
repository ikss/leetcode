package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class HouseRobberIITest {
    @Test
    fun test1() {
        val nums = intArrayOf(2, 3, 2)
        val expected = 3

        assertEquals(expected, HouseRobberII.rob(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(1, 2, 3, 1)
        val expected = 4

        assertEquals(expected, HouseRobberII.rob(nums))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(1, 2, 3)
        val expected = 3

        assertEquals(expected, HouseRobberII.rob(nums))
    }
}