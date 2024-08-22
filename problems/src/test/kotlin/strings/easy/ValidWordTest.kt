package strings.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ValidWordTest {
    @Test
    fun test1() {
        val word = "234Adas"
        val expected = true

        assertEquals(expected, ValidWord.isValid(word))
    }

    @Test
    fun test2() {
        val word = "b3!"
        val expected = false

        assertEquals(expected, ValidWord.isValid(word))
    }

    @Test
    fun test3() {
        val word = "a3\$e"
        val expected = false

        assertEquals(expected, ValidWord.isValid(word))
    }
}