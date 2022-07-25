package data_structures.arrays.medium

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class FindFirstAndLastPositionInSortedArrayTest {
    @Test
    fun test1fullPass() {
        val nums = intArrayOf(5, 7, 7, 8, 8, 10)
        val target = 8
        val expected = intArrayOf(3, 4)

        assertTrue(expected.contentEquals(FindFirstAndLastPositionInSortedArray.searchRangeFullPass(nums, target)))
    }

    @Test
    fun test2fullPass() {
        val nums = intArrayOf(5, 7, 7, 8, 8, 10)
        val target = 6
        val expected = intArrayOf(-1, -1)

        assertTrue(expected.contentEquals(FindFirstAndLastPositionInSortedArray.searchRangeFullPass(nums, target)))
    }

    @Test
    fun test3fullPass() {
        val nums = intArrayOf()
        val target = 0
        val expected = intArrayOf(-1, -1)

        assertTrue(expected.contentEquals(FindFirstAndLastPositionInSortedArray.searchRangeFullPass(nums, target)))
    }

    @Test
    fun test4fullPass() {
        val nums = intArrayOf(1)
        val target = 1
        val expected = intArrayOf(0, 0)

        assertTrue(expected.contentEquals(FindFirstAndLastPositionInSortedArray.searchRangeFullPass(nums, target)))
    }

    @Test
    fun test1binarySearch() {
        val nums = intArrayOf(5, 7, 7, 8, 8, 10)
        val target = 8
        val expected = intArrayOf(3, 4)

        assertTrue(expected.contentEquals(FindFirstAndLastPositionInSortedArray.searchRangeBinary(nums, target)))
    }

    @Test
    fun test2binarySearch() {
        val nums = intArrayOf(5, 7, 7, 8, 8, 10)
        val target = 6
        val expected = intArrayOf(-1, -1)

        assertTrue(expected.contentEquals(FindFirstAndLastPositionInSortedArray.searchRangeBinary(nums, target)))
    }

    @Test
    fun test3binarySearch() {
        val nums = intArrayOf()
        val target = 0
        val expected = intArrayOf(-1, -1)

        assertTrue(expected.contentEquals(FindFirstAndLastPositionInSortedArray.searchRangeBinary(nums, target)))
    }

    @Test
    fun test4binarySearch() {
        val nums = intArrayOf(1)
        val target = 1
        val expected = intArrayOf(0, 0)

        assertTrue(expected.contentEquals(FindFirstAndLastPositionInSortedArray.searchRangeBinary(nums, target)))
    }
}
