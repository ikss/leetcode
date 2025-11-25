package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ValidWordSquareTest {
    @Test
    fun test1() {
        val words = listOf("abcd", "bnrt", "crmy", "dtye")
        val expected = true

        assertEquals(expected, ValidWordSquare.validWordSquare(words))
    }

    @Test
    fun test2() {
        val words = listOf("abcd", "bnrt", "crm", "dt")
        val expected = true

        assertEquals(expected, ValidWordSquare.validWordSquare(words))
    }

    @Test
    fun test3() {
        val words = listOf("ball", "area", "read", "lady")
        val expected = false

        assertEquals(expected, ValidWordSquare.validWordSquare(words))
    }

    @Test
    fun test4() {
        val words = listOf("ball", "asee", "let", "lep")
        val expected = false

        assertEquals(expected, ValidWordSquare.validWordSquare(words))
    }
}