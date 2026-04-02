package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumAmountOfMoneyRobotCanEarnTest {
    @Test
    fun test1() {
        val coins = arrayOf(intArrayOf(0, 1, -1), intArrayOf(1, -2, 3), intArrayOf(2, -3, 4))
        val expected = 8

        assertEquals(expected, MaximumAmountOfMoneyRobotCanEarn.maximumAmount(coins))
    }

    @Test
    fun test2() {
        val coins = arrayOf(intArrayOf(10, 10, 10), intArrayOf(10, 10, 10))
        val expected = 40

        assertEquals(expected, MaximumAmountOfMoneyRobotCanEarn.maximumAmount(coins))
    }

    @Test
    fun test3() {
        val coins = arrayOf(intArrayOf(-10, -10, -10), intArrayOf(-10, -10, -10))
        val expected = -20

        assertEquals(expected, MaximumAmountOfMoneyRobotCanEarn.maximumAmount(coins))
    }
}