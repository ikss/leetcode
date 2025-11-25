package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FindTargetIndicesAfterSortingArrayTest {
    @Test
    fun test1() {
        val nums = intArrayOf(1, 2, 5, 2, 3)
        val target = 2
        val expected = arrayListOf(1, 2)

        assertEquals(expected, FindTargetIndicesAfterSortingArray.targetIndices(nums, target))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(1, 2, 5, 2, 3)
        val target = 7
        val expected = emptyList<Int>()

        assertEquals(expected, FindTargetIndicesAfterSortingArray.targetIndices(nums, target))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(1, 2, 5, 2, 3)
        val target = 5
        val expected = arrayListOf(4)

        assertEquals(expected, FindTargetIndicesAfterSortingArray.targetIndices(nums, target))
    }
}