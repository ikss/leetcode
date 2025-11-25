package medium

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class MakeLexicographicallySmallestArrayBySwappingElementsTest {
    @Test
    fun test1() {
        val nums = intArrayOf(1, 5, 3, 9, 8)
        val limit = 2
        val expected = intArrayOf(1, 3, 5, 8, 9)

        assertArrayEquals(
            expected,
            MakeLexicographicallySmallestArrayBySwappingElements.lexicographicallySmallestArray(nums, limit),
        )
    }

    @Test
    fun test2() {
        val nums = intArrayOf(1, 7, 6, 18, 2, 1)
        val limit = 3
        val expected = intArrayOf(1, 6, 7, 18, 1, 2)

        assertArrayEquals(
            expected,
            MakeLexicographicallySmallestArrayBySwappingElements.lexicographicallySmallestArray(nums, limit),
        )
    }

    @Test
    fun test3() {
        val nums = intArrayOf(1, 7, 28, 19, 10)
        val limit = 3
        val expected = intArrayOf(1, 7, 28, 19, 10)

        assertArrayEquals(
            expected,
            MakeLexicographicallySmallestArrayBySwappingElements.lexicographicallySmallestArray(nums, limit),
        )
    }

    @Test
    fun test4() {
        val nums = intArrayOf(4, 52, 38, 59, 71, 27, 31, 83, 88, 10)
        val limit = 14
        val expected = intArrayOf(4, 27, 31, 38, 52, 59, 71, 83, 88, 10)

        assertArrayEquals(
            expected,
            MakeLexicographicallySmallestArrayBySwappingElements.lexicographicallySmallestArray(nums, limit),
        )
    }
}