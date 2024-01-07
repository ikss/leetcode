package arrays.medium

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class MergeIntervalsTest {
    @Test
    fun test1own() {
        val intervals = arrayOf(intArrayOf(1, 3), intArrayOf(2, 6), intArrayOf(8, 10), intArrayOf(15, 18))
        val expected = arrayOf(intArrayOf(1, 6), intArrayOf(8, 10), intArrayOf(15, 18))

        assertArrayEquals(expected, MergeIntervals.mergeOwn(intervals))
    }

    @Test
    fun test2own() {
        val intervals = arrayOf(intArrayOf(1, 4), intArrayOf(4, 5))
        val expected = arrayOf(intArrayOf(1, 5))

        assertArrayEquals(expected, MergeIntervals.mergeOwn(intervals))
    }

    @Test
    fun test1linkedList() {
        val intervals = arrayOf(intArrayOf(1, 3), intArrayOf(2, 6), intArrayOf(8, 10), intArrayOf(15, 18))
        val expected = arrayOf(intArrayOf(1, 6), intArrayOf(8, 10), intArrayOf(15, 18))

        assertArrayEquals(expected, MergeIntervals.mergeLinkedList(intervals))
    }

    @Test
    fun test2linkedList() {
        val intervals = arrayOf(intArrayOf(1, 4), intArrayOf(4, 5))
        val expected = arrayOf(intArrayOf(1, 5))

        assertArrayEquals(expected, MergeIntervals.mergeLinkedList(intervals))
    }
}