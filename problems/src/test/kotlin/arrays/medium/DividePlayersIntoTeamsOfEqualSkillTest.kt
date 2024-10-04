package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DividePlayersIntoTeamsOfEqualSkillTest {
    @Test
    fun test1() {
        val skill = intArrayOf(3, 2, 5, 1, 3, 4)
        val expected = 22L

        assertEquals(expected, DividePlayersIntoTeamsOfEqualSkill.dividePlayers(skill))
    }

    @Test
    fun test2() {
        val skill = intArrayOf(3, 4)
        val expected = 12L

        assertEquals(expected, DividePlayersIntoTeamsOfEqualSkill.dividePlayers(skill))
    }

    @Test
    fun test3() {
        val skill = intArrayOf(1, 1, 2, 3)
        val expected = -1L

        assertEquals(expected, DividePlayersIntoTeamsOfEqualSkill.dividePlayers(skill))
    }
}