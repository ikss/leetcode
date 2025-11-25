package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CountNumberOfTeamsTest {
    @Test
    fun test1() {
        val rating = intArrayOf(2, 5, 3, 4, 1)
        val expected = 3

        assertEquals(expected, CountNumberOfTeams.numTeams(rating))
    }

    @Test
    fun test2() {
        val rating = intArrayOf(2, 1, 3)
        val expected = 0

        assertEquals(expected, CountNumberOfTeams.numTeams(rating))
    }

    @Test
    fun test3() {
        val rating = intArrayOf(1, 2, 3, 4)
        val expected = 4

        assertEquals(expected, CountNumberOfTeams.numTeams(rating))
    }
}