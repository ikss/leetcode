package medium

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class SuccessfulPairsOfSpellsAndPotionsTest {
    @Test
    fun test1() {
        val spells = intArrayOf(5, 1, 3)
        val potions = intArrayOf(1, 2, 3, 4, 5)
        val success = 7L
        val expected = intArrayOf(4, 0, 3)

        assertArrayEquals(expected, SuccessfulPairsOfSpellsAndPotions.successfulPairs(spells, potions, success))
    }

    @Test
    fun test2() {
        val spells = intArrayOf(3, 1, 2)
        val potions = intArrayOf(8, 5, 8)
        val success = 16L
        val expected = intArrayOf(2, 0, 2)

        assertArrayEquals(expected, SuccessfulPairsOfSpellsAndPotions.successfulPairs(spells, potions, success))
    }

    @Test
    fun test3() {
        val spells = intArrayOf(15, 8, 19)
        val potions = intArrayOf(38, 36, 23)
        val success = 328L
        val expected = intArrayOf(3, 0, 3)

        assertArrayEquals(expected, SuccessfulPairsOfSpellsAndPotions.successfulPairs(spells, potions, success))
    }
}