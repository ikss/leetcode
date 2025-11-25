package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DesignSnakeGameTest {
    @Test
    fun test1() {
        val game = DesignSnakeGame.SnakeGame(
            3,
            2,
            arrayOf(
                intArrayOf(1, 2),
                intArrayOf(0, 1),
            )
        )
        val moves = listOf("R", "D", "R", "U", "L", "U")
        val expected = listOf(0, 0, 1, 1, 2, -1)
        val actual = moves.map { game.move(it) }

        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        val game = DesignSnakeGame.SnakeGame(
            2,
            1,
            arrayOf(
                intArrayOf(0, 1),
            )
        )
        val moves = listOf("R", "R")
        val expected = listOf(1, -1)
        val actual = moves.map { game.move(it) }

        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        val game = DesignSnakeGame.SnakeGame(
            3,
            3,
            arrayOf(
                intArrayOf(2, 0),
                intArrayOf(0, 0),
                intArrayOf(0, 2),
                intArrayOf(0, 1),
                intArrayOf(2, 2),
                intArrayOf(0, 1),
            )
        )
        val moves = listOf("D", "D", "R", "U", "U", "L", "D", "R", "R", "U", "L", "L", "D", "R", "U")
        val expected = listOf(0, 1, 1, 1, 1, 2, 2, 2, 2, 3, 4, 4, 4, 4, -1)
        val actual = moves.map { game.move(it) }

        assertEquals(expected, actual)

    }
}