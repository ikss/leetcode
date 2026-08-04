package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FindMissingElementsTest {
    @Test
    fun test1Array() {
        val nums = intArrayOf(1, 4, 2, 5)
        val expected = listOf(3)

        assertEquals(expected, FindMissingElements.findMissingElementsArray(nums))
    }

    @Test
    fun test2Array() {
        val nums = intArrayOf(7, 8, 6, 9)
        val expected = listOf<Int>()

        assertEquals(expected, FindMissingElements.findMissingElementsArray(nums))
    }

    @Test
    fun test3Array() {
        val nums = intArrayOf(5, 1)
        val expected = listOf(2, 3, 4)

        assertEquals(expected, FindMissingElements.findMissingElementsArray(nums))
    }

    @Test
    fun test1SortingTwoPointers() {
        val nums = intArrayOf(1, 4, 2, 5)
        val expected = listOf(3)

        assertEquals(expected, FindMissingElements.findMissingElementsSortingTwoPointers(nums))
    }

    @Test
    fun test2SortingTwoPointers() {
        val nums = intArrayOf(7, 8, 6, 9)
        val expected = listOf<Int>()

        assertEquals(expected, FindMissingElements.findMissingElementsSortingTwoPointers(nums))
    }

    @Test
    fun test3SortingTwoPointers() {
        val nums = intArrayOf(5, 1)
        val expected = listOf(2, 3, 4)

        assertEquals(expected, FindMissingElements.findMissingElementsSortingTwoPointers(nums))
    }
}