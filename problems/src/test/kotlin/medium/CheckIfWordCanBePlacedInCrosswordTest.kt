package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CheckIfWordCanBePlacedInCrosswordTest {
    @Test
    fun test1() {
        val board = arrayOf(
            charArrayOf('#', ' ', '#'),
            charArrayOf(' ', ' ', '#'),
            charArrayOf('#', 'c', ' ')
        )
        val word = "abc"
        val expected = true

        assertEquals(expected, CheckIfWordCanBePlacedInCrossword.placeWordInCrossword(board, word))
    }

    @Test
    fun test2() {
        val board = arrayOf(
            charArrayOf(' ', '#', 'a'),
            charArrayOf(' ', '#', 'c'),
            charArrayOf(' ', '#', 'a'),
        )
        val word = "ac"
        val expected = false

        assertEquals(expected, CheckIfWordCanBePlacedInCrossword.placeWordInCrossword(board, word))
    }

    @Test
    fun test3() {
        val board = arrayOf(
            charArrayOf(' ', '#', 'a'),
            charArrayOf(' ', '#', 'c'),
            charArrayOf(' ', '#', 'a'),
        )
        val word = "ac"
        val expected = false

        assertEquals(expected, CheckIfWordCanBePlacedInCrossword.placeWordInCrossword(board, word))
    }
}