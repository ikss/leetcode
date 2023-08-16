package arrays.hard

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class SlidingWindowMaxTest {
    @Test
    fun test1priorityQueue() {
        val nums = intArrayOf(1, 3, -1, -3, 5, 3, 6, 7)
        val k = 3
        val expected = intArrayOf(3, 3, 5, 5, 6, 7)

        assertArrayEquals(expected, SlidingWindowMax.maxSlidingWindowPriorityQueue(nums, k))
    }

    @Test
    fun test2priorityQueue() {
        val nums = intArrayOf(1)
        val k = 1
        val expected = intArrayOf(1)

        assertArrayEquals(expected, SlidingWindowMax.maxSlidingWindowPriorityQueue(nums, k))
    }

    @Test
    fun test1indexDeque() {
        val nums = intArrayOf(1, 3, -1, -3, 5, 3, 6, 7)
        val k = 3
        val expected = intArrayOf(3, 3, 5, 5, 6, 7)

        assertArrayEquals(expected, SlidingWindowMax.maxSlidingWindowIndexDeque(nums, k))
    }

    @Test
    fun test2indexDeque() {
        val nums = intArrayOf(1)
        val k = 1
        val expected = intArrayOf(1)

        assertArrayEquals(expected, SlidingWindowMax.maxSlidingWindowIndexDeque(nums, k))
    }
}