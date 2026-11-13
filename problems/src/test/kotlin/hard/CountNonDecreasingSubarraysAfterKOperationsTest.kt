package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CountNonDecreasingSubarraysAfterKOperationsTest {
    @Test
    fun test1() {
        val nums = intArrayOf(6, 3, 1, 2, 4, 4)
        val k = 7
        val expected = 17L

        assertEquals(expected, CountNonDecreasingSubarraysAfterKOperations.countNonDecreasingSubarrays(nums, k))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(6, 3, 1, 3, 6)
        val k = 4
        val expected = 12L

        assertEquals(expected, CountNonDecreasingSubarraysAfterKOperations.countNonDecreasingSubarrays(nums, k))
    }
}