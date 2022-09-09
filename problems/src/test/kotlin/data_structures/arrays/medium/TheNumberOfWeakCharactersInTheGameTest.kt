package data_structures.arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class TheNumberOfWeakCharactersInTheGameTest {
    @Test
    fun test1() {
        val properties = arrayOf(
            intArrayOf(5, 5),
            intArrayOf(6, 3),
            intArrayOf(3, 6),
        )
        val expected = 0

        assertEquals(expected, TheNumberOfWeakCharactersInTheGame.numberOfWeakCharacters(properties))
    }

    @Test
    fun test2() {
        val properties = arrayOf(
            intArrayOf(2, 2),
            intArrayOf(3, 3),
        )
        val expected = 1

        assertEquals(expected, TheNumberOfWeakCharactersInTheGame.numberOfWeakCharacters(properties))
    }

    @Test
    fun test3() {
        val properties = arrayOf(
            intArrayOf(1, 5),
            intArrayOf(10, 4),
            intArrayOf(4, 3),
        )
        val expected = 1

        assertEquals(expected, TheNumberOfWeakCharactersInTheGame.numberOfWeakCharacters(properties))
    }

    @Test
    fun test4() {
        val properties = arrayOf(
            intArrayOf(7, 9),
            intArrayOf(10, 7),
            intArrayOf(6, 9),
            intArrayOf(10, 4),
            intArrayOf(7, 5),
            intArrayOf(7, 10),
        )
        val expected = 2

        assertEquals(expected, TheNumberOfWeakCharactersInTheGame.numberOfWeakCharacters(properties))
    }
}
