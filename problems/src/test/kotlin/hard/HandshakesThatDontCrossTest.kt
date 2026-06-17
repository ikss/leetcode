package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class HandshakesThatDontCrossTest {
    @Test
    fun test1() {
        val numPeople = 4
        val expected = 2

        assertEquals(expected, HandshakesThatDontCross.numberOfWays(numPeople))
    }

    @Test
    fun test2() {
        val numPeople = 6
        val expected = 5

        assertEquals(expected, HandshakesThatDontCross.numberOfWays(numPeople))
    }
}