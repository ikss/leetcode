package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CountSubarraysWithMajorityElementIITest {
    @Test
    fun test1() {
        val nums = intArrayOf(1, 2, 2, 3)
        val target = 2
        val expected = 5L

        assertEquals(expected, CountSubarraysWithMajorityElementII.countMajoritySubarrays(nums, target))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(1, 1, 1, 1)
        val target = 1
        val expected = 10L

        assertEquals(expected, CountSubarraysWithMajorityElementII.countMajoritySubarrays(nums, target))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(1, 2, 3)
        val target = 4
        val expected = 0L

        assertEquals(expected, CountSubarraysWithMajorityElementII.countMajoritySubarrays(nums, target))
    }
}