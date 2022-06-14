package collections.arrays.medium

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class TopKFrequentElementsTest {
    @Test
    fun test1() {
        val nums = intArrayOf(1, 1, 1, 2, 2, 3)
        val k = 2
        val expected = intArrayOf(1, 2)

        assertTrue(expected.contentEquals(TopKFrequentElements.topKFrequent(nums, k)))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(1)
        val k = 1
        val expected = intArrayOf(1)

        assertTrue(expected.contentEquals(TopKFrequentElements.topKFrequent(nums, k)))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(1, 1, 1, 2, 2, 3)
        val k = 2
        val expected = intArrayOf(1, 2)

        assertTrue(expected.contentEquals(TopKFrequentElements.topKFrequentPriorityQueue(nums, k)))
    }

    @Test
    fun test4() {
        val nums = intArrayOf(1)
        val k = 1
        val expected = intArrayOf(1)

        assertTrue(expected.contentEquals(TopKFrequentElements.topKFrequentPriorityQueue(nums, k)))
    }
}
