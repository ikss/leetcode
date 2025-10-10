package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class TakingMaximumEnergyFromTheMysticDungeonTest {
    @Test
    fun test1() {
        val energy = intArrayOf(5, 2, -10, -5, 1)
        val k = 3
        val expected = 3

        assertEquals(expected, TakingMaximumEnergyFromTheMysticDungeon.maximumEnergy(energy, k))
    }

    @Test
    fun test2() {
        val energy = intArrayOf(-2, -3, -1)
        val k = 1
        val expected = -1

        assertEquals(expected, TakingMaximumEnergyFromTheMysticDungeon.maximumEnergy(energy, k))
    }
}