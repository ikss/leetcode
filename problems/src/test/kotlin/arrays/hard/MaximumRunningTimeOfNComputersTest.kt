package arrays.hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumRunningTimeOfNComputersTest {
    @Test
    fun test1PrefixSum() {
        val n = 2
        val batteries = intArrayOf(3, 3, 3)
        val expected = 4L

        assertEquals(expected, MaximumRunningTimeOfNComputers.maxRunTimePrefixSum(n, batteries))
    }

    @Test
    fun test2PrefixSum() {
        val n = 3
        val batteries = intArrayOf(3, 3, 3)
        val expected = 3L

        assertEquals(expected, MaximumRunningTimeOfNComputers.maxRunTimePrefixSum(n, batteries))
    }

    @Test
    fun test1BinarySearch() {
        val n = 2
        val batteries = intArrayOf(3, 3, 3)
        val expected = 4L

        assertEquals(expected, MaximumRunningTimeOfNComputers.maxRunTimeBinarySearch(n, batteries))
    }

    @Test
    fun test2BinarySearch() {
        val n = 3
        val batteries = intArrayOf(3, 3, 3)
        val expected = 3L

        assertEquals(expected, MaximumRunningTimeOfNComputers.maxRunTimeBinarySearch(n, batteries))
    }

    @Test
    fun test1PriorityQueue() {
        val n = 2
        val batteries = intArrayOf(3, 3, 3)
        val expected = 4L

        assertEquals(expected, MaximumRunningTimeOfNComputers.maxRunTimePriorityQueue(n, batteries))
    }

    @Test
    fun test2PriorityQueue() {
        val n = 3
        val batteries = intArrayOf(3, 3, 3)
        val expected = 3L

        assertEquals(expected, MaximumRunningTimeOfNComputers.maxRunTimePriorityQueue(n, batteries))
    }
}