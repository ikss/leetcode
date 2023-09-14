package graphs.hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ReconstructItineraryTest {
    @Test
    fun test1() {
        val tickets = listOf(
            listOf("MUC", "LHR"),
            listOf("JFK", "MUC"),
            listOf("SFO", "SJC"),
            listOf("LHR", "SFO"),
        )
        val expected = listOf("JFK", "MUC", "LHR", "SFO", "SJC")

        assertEquals(expected, ReconstructItinerary.findItinerary(tickets))
    }

    @Test
    fun test2() {
        val tickets = listOf(
            listOf("JFK", "SFO"),
            listOf("JFK", "ATL"),
            listOf("SFO", "ATL"),
            listOf("ATL", "JFK"),
            listOf("ATL", "SFO"),
        )
        val expected = listOf("JFK", "ATL", "JFK", "SFO", "ATL", "SFO")

        assertEquals(expected, ReconstructItinerary.findItinerary(tickets))
    }

    @Test
    fun test3() {
        val tickets = listOf(
            listOf("JFK", "KUL"),
            listOf("JFK", "NRT"),
            listOf("NRT", "JFK"),
        )
        val expected = listOf("JFK", "NRT", "JFK", "KUL")

        assertEquals(expected, ReconstructItinerary.findItinerary(tickets))
    }
}