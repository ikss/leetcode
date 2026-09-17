package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FindTwoNonoverlappingSubarraysEachWithTargetSumTest {
    @Test
    fun test1() {
        val arr = intArrayOf(3, 2, 2, 4, 3)
        val target = 3
        val expected = 2

        assertEquals(expected, FindTwoNonoverlappingSubarraysEachWithTargetSum.minSumOfLengths(arr, target))
    }

    @Test
    fun test2() {
        val arr = intArrayOf(7, 3, 4, 7)
        val target = 7
        val expected = 2

        assertEquals(expected, FindTwoNonoverlappingSubarraysEachWithTargetSum.minSumOfLengths(arr, target))
    }

    @Test
    fun test3() {
        val arr = intArrayOf(4, 3, 2, 6, 2, 3, 4)
        val target = 6
        val expected = -1

        assertEquals(expected, FindTwoNonoverlappingSubarraysEachWithTargetSum.minSumOfLengths(arr, target))
    }

    @Test
    fun test4() {
        val arr = intArrayOf(1, 2, 2, 3, 2, 6, 7, 2, 1, 4, 8)
        val target = 5
        val expected = 4

        assertEquals(expected, FindTwoNonoverlappingSubarraysEachWithTargetSum.minSumOfLengths(arr, target))
    }
}