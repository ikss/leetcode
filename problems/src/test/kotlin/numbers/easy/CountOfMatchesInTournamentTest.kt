package numbers.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CountOfMatchesInTournamentTest {
    @Test
    fun test1() {
        val n = 7
        val expected = 6

        assertEquals(expected, CountOfMatchesInTournament.numberOfMatchesMy(n))
    }

    @Test
    fun test2() {
        val n = 14
        val expected = 13

        assertEquals(expected, CountOfMatchesInTournament.numberOfMatchesMy(n))
    }
}