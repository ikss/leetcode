package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ShortestPathToGetFoodTest {
    @Test
    fun test1() {
        val grid = arrayOf(
            charArrayOf('X', 'X', 'X', 'X', 'X', 'X'),
            charArrayOf('X', '*', 'O', 'O', 'O', 'X'),
            charArrayOf('X', 'O', 'O', '#', 'O', 'X'),
            charArrayOf('X', 'X', 'X', 'X', 'X', 'X'),
        )
        val expected = 3

        assertEquals(expected, ShortestPathToGetFood.getFood(grid))
    }

    @Test
    fun test2() {
        val grid = arrayOf(
            charArrayOf('X', 'X', 'X', 'X', 'X'),
            charArrayOf('X', '*', 'X', 'O', 'X'),
            charArrayOf('X', 'O', 'X', '#', 'X'),
            charArrayOf('X', 'X', 'X', 'X', 'X'),
        )
        val expected = -1

        assertEquals(expected, ShortestPathToGetFood.getFood(grid))
    }

    @Test
    fun test3() {
        val grid = arrayOf(
            charArrayOf('X', 'X', 'X', 'X', 'X', 'X', 'X', 'X'),
            charArrayOf('X', '*', 'O', 'X', 'O', '#', 'O', 'X'),
            charArrayOf('X', 'O', 'O', 'X', 'O', 'O', 'X', 'X'),
            charArrayOf('X', 'O', 'O', 'O', 'O', '#', 'O', 'X'),
            charArrayOf('X', 'X', 'X', 'X', 'X', 'X', 'X', 'X'),
        )
        val expected = 6

        assertEquals(expected, ShortestPathToGetFood.getFood(grid))
    }
}