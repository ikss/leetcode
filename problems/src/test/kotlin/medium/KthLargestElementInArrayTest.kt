package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class KthLargestElementInArrayTest {

    @Test
    fun test1() {
        val arr = intArrayOf(3, 2, 1, 5, 6, 4)
        val k = 2
        val expected = 5

        assertEquals(expected, KthLargestElementInArray.findKthLargest(arr, k))
    }

    @Test
    fun test2() {
        val arr = intArrayOf(3, 2, 3, 1, 2, 4, 5, 5, 6)
        val k = 4
        val expected = 4

        assertEquals(expected, KthLargestElementInArray.findKthLargest(arr, k))
    }
}