package strings.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Dota2SenateTest {

    @Test
    fun test1() {
        val senate = "RD"
        val expected = "Radiant"

        assertEquals(expected, Dota2Senate.predictPartyVictory(senate))
    }

    @Test
    fun test2() {
        val senate = "RDD"
        val expected = "Dire"

        assertEquals(expected, Dota2Senate.predictPartyVictory(senate))
    }
}