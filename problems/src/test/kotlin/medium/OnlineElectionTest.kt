package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class OnlineElectionTest {
    @Test
    fun test1() {
        val persons = intArrayOf(0, 1, 1, 0, 0, 1, 0)
        val times = intArrayOf(0, 5, 10, 15, 20, 25, 30)
        val obj = OnlineElection.TopVotedCandidate(persons, times)
        assertEquals(0, obj.q(3))
        assertEquals(1, obj.q(12))
        assertEquals(1, obj.q(25))
        assertEquals(0, obj.q(15))
        assertEquals(0, obj.q(24))
        assertEquals(1, obj.q(8))
    }
}