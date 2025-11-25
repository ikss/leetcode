package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RankTeamsByVotesTest {
    @Test
    fun test1() {
        val votes = arrayOf("ABC", "ACB", "ABC", "ACB", "ACB")
        val expected = "ACB"

        assertEquals(expected, RankTeamsByVotes.rankTeams(votes))
    }

    @Test
    fun test2() {
        val votes = arrayOf("WXYZ", "XYZW")
        val expected = "XWYZ"

        assertEquals(expected, RankTeamsByVotes.rankTeams(votes))
    }
    
    @Test
    fun test3() {
        val votes = arrayOf("ABC", "ACB", "ABC", "ACB", "ACB")
        val expected = "ACB"

        assertEquals(expected, RankTeamsByVotes.rankTeams(votes))
    }
}