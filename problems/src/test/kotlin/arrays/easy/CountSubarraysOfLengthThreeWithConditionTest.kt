package arrays.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CountSubarraysOfLengthThreeWithConditionTest {
    @Test
    fun test1() {
        val nums = intArrayOf(1, 2, 1, 4, 1)
        val expected = 1

        assertEquals(expected, CountSubarraysOfLengthThreeWithCondition.countSubarrays(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(1, 1, 1)
        val expected = 0

        assertEquals(expected, CountSubarraysOfLengthThreeWithCondition.countSubarrays(nums))
    }
}