package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DivideArrayIntoSubarraysWithMinimumCostITest {
    @Test
    fun test1() {
        val nums = intArrayOf(1, 2, 3, 12)
        val expected = 6

        assertEquals(expected, DivideArrayIntoSubarraysWithMinimumCostI.minimumCost(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(5, 4, 3)
        val expected = 12

        assertEquals(expected, DivideArrayIntoSubarraysWithMinimumCostI.minimumCost(nums))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(10, 3, 1, 1)
        val expected = 12

        assertEquals(expected, DivideArrayIntoSubarraysWithMinimumCostI.minimumCost(nums))
    }
}