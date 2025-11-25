package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumNumberOfAchievableTransferRequestsTest {

    @Test
    fun test1() {
        val n = 5
        val requests = arrayOf(
            intArrayOf(0, 1),
            intArrayOf(1, 0),
            intArrayOf(0, 1),
            intArrayOf(1, 2),
            intArrayOf(2, 0),
            intArrayOf(3, 4),
        )
        val expected = 5

        assertEquals(expected, MaximumNumberOfAchievableTransferRequests.maximumRequests(n, requests))
    }

    @Test
    fun test2() {
        val n = 3
        val requests = arrayOf(intArrayOf(0, 0), intArrayOf(1, 2), intArrayOf(2, 1))
        val expected = 3

        assertEquals(expected, MaximumNumberOfAchievableTransferRequests.maximumRequests(n, requests))
    }

    @Test
    fun test3() {
        val n = 4
        val requests = arrayOf(intArrayOf(0, 3), intArrayOf(3, 1), intArrayOf(1, 2), intArrayOf(2, 0))
        val expected = 4

        assertEquals(expected, MaximumNumberOfAchievableTransferRequests.maximumRequests(n, requests))
    }
}