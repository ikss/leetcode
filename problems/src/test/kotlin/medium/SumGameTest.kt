package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SumGameTest {
    @Test
    fun test1() {
        val num = "5023"
        val expected = false

        assertEquals(expected, SumGame.sumGame(num))
    }

    @Test
    fun test2() {
        val num = "25??"
        val expected = true

        assertEquals(expected, SumGame.sumGame(num))
    }

    @Test
    fun test3() {
        val num = "?3295???"
        val expected = false

        assertEquals(expected, SumGame.sumGame(num))
    }
}