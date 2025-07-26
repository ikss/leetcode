package arrays.hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximizeSubarraysAfterRemovingOneConflictingPairTest {
    @Test
    fun test1() {
        val n = 4
        val conflictingPairs = arrayOf(intArrayOf(2, 3), intArrayOf(1, 4))
        val expected = 9L

        assertEquals(expected, MaximizeSubarraysAfterRemovingOneConflictingPair.maxSubarrays(n, conflictingPairs))
    }

    @Test
    fun test2() {
        val n = 5
        val conflictingPairs = arrayOf(intArrayOf(1, 2), intArrayOf(2, 5), intArrayOf(3, 5))
        val expected = 12L

        assertEquals(expected, MaximizeSubarraysAfterRemovingOneConflictingPair.maxSubarrays(n, conflictingPairs))
    }
}