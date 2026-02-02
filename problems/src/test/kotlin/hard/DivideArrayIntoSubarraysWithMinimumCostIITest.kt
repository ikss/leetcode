package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DivideArrayIntoSubarraysWithMinimumCostIITest {
    @Test
    fun test1() {
        val nums = intArrayOf(1, 3, 2, 6, 4, 2)
        val k = 3
        val dist = 3
        val expected = 5L

        assertEquals(expected, DivideArrayIntoSubarraysWithMinimumCostII.minimumCost(nums, k, dist))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(10, 1, 2, 2, 2, 1)
        val k = 4
        val dist = 3
        val expected = 15L

        assertEquals(expected, DivideArrayIntoSubarraysWithMinimumCostII.minimumCost(nums, k, dist))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(10, 8, 18, 9)
        val k = 3
        val dist = 1
        val expected = 36L

        assertEquals(expected, DivideArrayIntoSubarraysWithMinimumCostII.minimumCost(nums, k, dist))
    }

    @Test
    fun test4() {
        val nums = intArrayOf(2,6,3,8,3,1,1)
        val k = 3
        val dist = 4
        val expected = 4L

        assertEquals(expected, DivideArrayIntoSubarraysWithMinimumCostII.minimumCost(nums, k, dist))
    }
}