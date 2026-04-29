package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumScoreFromGridOperationsTest {
    @Test
    fun test1() {
        val grid = arrayOf(
            intArrayOf(0, 0, 0, 0, 0),
            intArrayOf(0, 0, 3, 0, 0),
            intArrayOf(0, 1, 0, 0, 0),
            intArrayOf(5, 0, 0, 3, 0),
            intArrayOf(0, 0, 0, 0, 2),
        )
        val expected = 11L

        assertEquals(expected, MaximumScoreFromGridOperations.maximumScore(grid))
    }

    @Test
    fun test2() {
        val grid = arrayOf(
            intArrayOf(10,9,0,0,15),
            intArrayOf(7,1,0,8,0),
            intArrayOf(5,20,0,11,0),
            intArrayOf(0,0,0,1,2),
            intArrayOf(8,12,1,10,3),
        )
        val expected = 94L

        assertEquals(expected, MaximumScoreFromGridOperations.maximumScore(grid))
    }
}