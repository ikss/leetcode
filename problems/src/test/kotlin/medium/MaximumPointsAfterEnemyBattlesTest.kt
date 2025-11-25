package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumPointsAfterEnemyBattlesTest {
    @Test
    fun test1() {
        val enemyEnergies = intArrayOf(3, 2, 2)
        val currentEnergy = 2
        val expected = 3L

        assertEquals(expected, MaximumPointsAfterEnemyBattles.maximumPoints(enemyEnergies, currentEnergy))
    }

    @Test
    fun test2() {
        val enemyEnergies = intArrayOf(2)
        val currentEnergy = 10
        val expected = 5L

        assertEquals(expected, MaximumPointsAfterEnemyBattles.maximumPoints(enemyEnergies, currentEnergy))
    }
}