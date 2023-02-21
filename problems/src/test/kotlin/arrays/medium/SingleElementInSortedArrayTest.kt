package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SingleElementInSortedArrayTest {
    @Test
    fun test1() {
        val nums = intArrayOf(1, 1, 2, 3, 3, 4, 4, 8, 8)
        val expected = 2

        assertEquals(expected, SingleElementInSortedArray.singleNonDuplicate(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(3, 3, 7, 7, 10, 11, 11)
        val expected = 10

        assertEquals(expected, SingleElementInSortedArray.singleNonDuplicate(nums))
    }
}