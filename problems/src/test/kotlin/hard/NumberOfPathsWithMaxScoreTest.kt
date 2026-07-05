package hard

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class NumberOfPathsWithMaxScoreTest {
    @Test
    fun test1() {
        val board = listOf("E23", "2X2", "12S")
        val expected = intArrayOf(7, 1)

        assertArrayEquals(expected, NumberOfPathsWithMaxScore.pathsWithMaxScore(board))
    }

    @Test
    fun test2() {
        val board = listOf("E12", "1X1", "21S")
        val expected = intArrayOf(4, 2)

        assertArrayEquals(expected, NumberOfPathsWithMaxScore.pathsWithMaxScore(board))
    }

    @Test
    fun test3() {
        val board = listOf("E11", "XXX", "11S")
        val expected = intArrayOf(0, 0)

        assertArrayEquals(expected, NumberOfPathsWithMaxScore.pathsWithMaxScore(board))
    }

}