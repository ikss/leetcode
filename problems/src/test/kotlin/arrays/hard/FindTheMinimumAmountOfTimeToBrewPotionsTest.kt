package arrays.hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FindTheMinimumAmountOfTimeToBrewPotionsTest {
    @Test
    fun test1() {
        val skill = intArrayOf(1, 5, 2, 4)
        val mana = intArrayOf(5, 1, 4, 2)
        val expected = 110L

        assertEquals(expected, FindTheMinimumAmountOfTimeToBrewPotions.minTime(skill, mana))
    }

    @Test
    fun test2() {
        val skill = intArrayOf(1, 1, 1)
        val mana = intArrayOf(1, 1, 1)
        val expected = 5L

        assertEquals(expected, FindTheMinimumAmountOfTimeToBrewPotions.minTime(skill, mana))
    }

    @Test
    fun test3() {
        val skill = intArrayOf(1, 2, 3, 4)
        val mana = intArrayOf(1, 2)
        val expected = 21L

        assertEquals(expected, FindTheMinimumAmountOfTimeToBrewPotions.minTime(skill, mana))
    }
}