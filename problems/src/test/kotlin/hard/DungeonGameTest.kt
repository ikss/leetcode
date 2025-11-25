package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DungeonGameTest {

    @Test
    fun test1() {
        val dungeon = arrayOf(intArrayOf(-2, -3, 3), intArrayOf(-5, -10, 1), intArrayOf(10, 30, -5))
        val expected = 7

        assertEquals(expected, DungeonGame.calculateMinimumHP(dungeon))
    }

    @Test
    fun test2() {
        val dungeon = arrayOf(intArrayOf(0))
        val expected = 1

        assertEquals(expected, DungeonGame.calculateMinimumHP(dungeon))
    }
}