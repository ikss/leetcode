package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CountSubarraysWhereMaxElementAppearsAtLeastKTimesTest {
    @Test
    fun test1() {
        val nums = intArrayOf(1, 3, 2, 3, 3)
        val k = 2
        val expected = 6L

        assertEquals(expected, CountSubarraysWhereMaxElementAppearsAtLeastKTimes.countSubarrays(nums, k))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(1, 4, 2, 1)
        val k = 3 
        val expected = 0L

        assertEquals(expected, CountSubarraysWhereMaxElementAppearsAtLeastKTimes.countSubarrays(nums, k))
    }
}