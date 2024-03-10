package arrays.medium

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class TopKFrequentElementsTest {
    @Test
    fun test1grouping() {
        val nums = intArrayOf(1, 1, 1, 2, 2, 3)
        val k = 2
        val expected = intArrayOf(1, 2)

        assertArrayEquals(expected, TopKFrequentElements.topKFrequentGrouping(nums, k))
    }

    @Test
    fun test2grouping() {
        val nums = intArrayOf(1)
        val k = 1
        val expected = intArrayOf(1)

        assertArrayEquals(expected, TopKFrequentElements.topKFrequentGrouping(nums, k))
    }

    @Test
    fun test1priorityQueue() {
        val nums = intArrayOf(1, 1, 1, 2, 2, 3)
        val k = 2
        val expected = intArrayOf(1, 2)

        assertArrayEquals(expected, TopKFrequentElements.topKFrequentPriorityQueue(nums, k))
    }

    @Test
    fun test2priorityQueue() {
        val nums = intArrayOf(1)
        val k = 1
        val expected = intArrayOf(1)

        assertArrayEquals(expected, TopKFrequentElements.topKFrequentPriorityQueue(nums, k))
    }
}
