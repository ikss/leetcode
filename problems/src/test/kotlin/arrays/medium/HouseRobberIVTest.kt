package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class HouseRobberIVTest {
    @Test
    fun test1() {
        val nums = intArrayOf(2, 3, 5, 9)
        val k = 2
        val expected = 5

        assertEquals(expected, HouseRobberIV.minCapability(nums, k))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(2, 7, 9, 3, 1)
        val k = 2
        val expected = 2

        assertEquals(expected, HouseRobberIV.minCapability(nums, k))
    }
}