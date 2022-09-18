package math.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FindWinnerOfCircularGameTest {

    @Test
    fun test1() {
        val n = 5
        val k = 2
        val expected = 3

        assertEquals(expected, FindWinnerOfCircularGame.findTheWinner(n, k))
    }

    @Test
    fun test2() {
        val n = 6
        val k = 5
        val expected = 1

        assertEquals(expected, FindWinnerOfCircularGame.findTheWinner(n, k))
    }
    @Test
    fun test1math() {
        val n = 5
        val k = 2
        val expected = 3

        assertEquals(expected, FindWinnerOfCircularGame.findTheWinnerMath(n, k))
    }

    @Test
    fun test2math() {
        val n = 6
        val k = 5
        val expected = 1

        assertEquals(expected, FindWinnerOfCircularGame.findTheWinnerMath(n, k))
    }
}