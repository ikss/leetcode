package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RabbitsInForestTest {

    @Test
    fun test1() {
        val answers = intArrayOf(1, 1, 2)
        val expected = 5

        assertEquals(expected, RabbitsInForest.numRabbits(answers))
    }

    @Test
    fun test2() {
        val answers = intArrayOf(10, 10, 10)
        val expected = 11

        assertEquals(expected, RabbitsInForest.numRabbits(answers))
    }

}