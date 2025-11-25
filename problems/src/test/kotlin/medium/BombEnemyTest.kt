package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class BombEnemyTest {
    @Test
    fun test1() {
        val grid = arrayOf(
            charArrayOf('0', 'E', '0', '0'),
            charArrayOf('E', '0', 'W', 'E'),
            charArrayOf('0', 'E', '0', '0'),
        )
        val expected = 3

        assertEquals(expected, BombEnemy.maxKilledEnemies(grid))
    }

    @Test
    fun test2() {
        val grid = arrayOf(
            charArrayOf('W', 'W', 'W'),
            charArrayOf('0', '0', '0'),
            charArrayOf('E', 'E', 'E'),
        )
        val expected = 1

        assertEquals(expected, BombEnemy.maxKilledEnemies(grid))
    }
}