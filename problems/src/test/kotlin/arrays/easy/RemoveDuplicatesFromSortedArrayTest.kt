package arrays.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RemoveDuplicatesFromSortedArrayTest {
    @Test
    fun test1() {
        val nums = intArrayOf(1, 1, 2)
        val expected = 2
        val result = RemoveDuplicatesFromSortedArray.removeDuplicates(nums)

        assertEquals(expected, result)
        assertEquals(listOf(1, 2), nums.take(result))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)
        val expected = 5
        val result = RemoveDuplicatesFromSortedArray.removeDuplicates(nums)

        assertEquals(expected, result)
        assertEquals(listOf(0, 1, 2, 3, 4), nums.take(result))
    }
}
