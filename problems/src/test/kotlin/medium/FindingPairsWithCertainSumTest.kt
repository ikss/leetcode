package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FindingPairsWithCertainSumTest {
    @Test
    fun test1() {
        val nums1 = intArrayOf(1, 1, 2, 2, 2, 3)
        val nums2 = intArrayOf(1, 4, 5, 2, 5, 4)
        val findSumPairs = FindingPairsWithCertainSum.FindSumPairs(nums1, nums2)

        assertEquals(8, findSumPairs.count(7))

        findSumPairs.add(3, 2)
        assertEquals(2, findSumPairs.count(8))

        assertEquals(1, findSumPairs.count(4))

        findSumPairs.add(0, 1)
        findSumPairs.add(1, 1)
        assertEquals(11, findSumPairs.count(7))
    }
}