package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CountOfMatchesInTournamentTest {
    @Test
    fun test1my() {
        val n = 7
        val expected = 6

        assertEquals(expected, CountOfMatchesInTournament.numberOfMatchesMy(n))
    }

    @Test
    fun test2my() {
        val n = 14
        val expected = 13

        assertEquals(expected, CountOfMatchesInTournament.numberOfMatchesMy(n))
    }

    @Test
    fun test1simplified() {
        val n = 7
        val expected = 6

        assertEquals(expected, CountOfMatchesInTournament.numberOfMatchesSimplified(n))
    }

    @Test
    fun test2simplified() {
        val n = 14
        val expected = 13

        assertEquals(expected, CountOfMatchesInTournament.numberOfMatchesSimplified(n))
    }
}