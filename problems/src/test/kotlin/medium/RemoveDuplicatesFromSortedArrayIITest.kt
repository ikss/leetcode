package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RemoveDuplicatesFromSortedArrayIITest {
    @Test
    fun test1naive() {
        val nums = intArrayOf(1, 1, 1, 2, 2, 3)
        val expected = 5

        assertEquals(expected, RemoveDuplicatesFromSortedArrayII.removeDuplicatesNaive(nums))
    }

    @Test
    fun test2naive() {
        val nums = intArrayOf(0, 0, 1, 1, 1, 1, 2, 3, 3)
        val expected = 7

        assertEquals(expected, RemoveDuplicatesFromSortedArrayII.removeDuplicatesNaive(nums))
    }

    @Test
    fun test1simplified() {
        val nums = intArrayOf(1, 1, 1, 2, 2, 3)
        val expected = 5

        assertEquals(expected, RemoveDuplicatesFromSortedArrayII.removeDuplicatesSimplified(nums))
    }

    @Test
    fun test2simplified() {
        val nums = intArrayOf(0, 0, 1, 1, 1, 1, 2, 3, 3)
        val expected = 7

        assertEquals(expected, RemoveDuplicatesFromSortedArrayII.removeDuplicatesSimplified(nums))
    }
}