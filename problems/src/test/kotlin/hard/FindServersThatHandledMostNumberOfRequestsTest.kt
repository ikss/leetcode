package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FindServersThatHandledMostNumberOfRequestsTest {
    @Test
    fun test1() {
        val k = 3
        val arrival = intArrayOf(1, 2, 3, 4, 5)
        val load = intArrayOf(5, 2, 3, 3, 3)
        val expected = listOf(1)

        assertEquals(expected, FindServersThatHandledMostNumberOfRequests.busiestServers(k, arrival, load))
    }


    @Test
    fun test2() {
        val k = 3
        val arrival = intArrayOf(1, 2, 3, 4)
        val load = intArrayOf(1, 2, 1, 2)
        val expected = listOf(0)

        assertEquals(expected, FindServersThatHandledMostNumberOfRequests.busiestServers(k, arrival, load))
    }


    @Test
    fun test3() {
        val k = 3
        val arrival = intArrayOf(1, 2, 3)
        val load = intArrayOf(10, 12, 11)
        val expected = listOf(0, 1, 2)

        assertEquals(expected, FindServersThatHandledMostNumberOfRequests.busiestServers(k, arrival, load))
    }


}