package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaxConsecutiveOnesIITest {
    @Test
    fun test1() {
        val nums = intArrayOf(1, 0, 1, 1, 0)
        val expected = 4

        assertEquals(expected, MaxConsecutiveOnesII.findMaxConsecutiveOnes(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(1, 0, 1, 1, 0, 1)
        val expected = 4

        assertEquals(expected, MaxConsecutiveOnesII.findMaxConsecutiveOnes(nums))
    }
}