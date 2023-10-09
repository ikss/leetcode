package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DeleteAndEarnTest {
    @Test
    fun test1() {
        val nums = intArrayOf(3, 4, 2)
        val expected = 6

        assertEquals(expected, DeleteAndEarn.deleteAndEarn(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(2, 2, 3, 3, 3, 4)
        val expected = 9

        assertEquals(expected, DeleteAndEarn.deleteAndEarn(nums))
    }
}