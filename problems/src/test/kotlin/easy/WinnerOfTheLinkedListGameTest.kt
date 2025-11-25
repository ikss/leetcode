package easy

import data_structures.ListBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class WinnerOfTheLinkedListGameTest {
    @Test
    fun test1() {
        val head = ListBuilder.build(2, 1)
        val expected = "Even"

        assertEquals(expected, WinnerOfTheLinkedListGame.gameResult(head))
    }

    @Test
    fun test2() {
        val head = ListBuilder.build(2, 5, 4, 7, 20, 5)
        val expected = "Odd"

        assertEquals(expected, WinnerOfTheLinkedListGame.gameResult(head))
    }

    @Test
    fun test3() {
        val head = ListBuilder.build(4, 5, 2, 1)
        val expected = "Tie"

        assertEquals(expected, WinnerOfTheLinkedListGame.gameResult(head))
    }
}