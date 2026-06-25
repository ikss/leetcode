package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CountSubarraysWithMajorityElementITest {
    @Test
    fun test1() {
        val nums = intArrayOf(1, 2, 2, 3)
        val target = 2
        val expected = 5

        assertEquals(expected, CountSubarraysWithMajorityElementI.countMajoritySubarrays(nums, target))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(1, 1, 1, 1)
        val target = 1
        val expected = 10

        assertEquals(expected, CountSubarraysWithMajorityElementI.countMajoritySubarrays(nums, target))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(1, 2, 3)
        val target = 4
        val expected = 0

        assertEquals(expected, CountSubarraysWithMajorityElementI.countMajoritySubarrays(nums, target))
    }
}