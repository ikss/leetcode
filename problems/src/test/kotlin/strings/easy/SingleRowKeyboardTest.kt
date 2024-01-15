package strings.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SingleRowKeyboardTest {
    @Test
    fun test1() {
        val input = "abcdefghijklmnopqrstuvwxyz"
        val word = "cba"
        val expected = 4

        assertEquals(expected, SingleRowKeyboard.calculateTime(input, word))
    }

    @Test
    fun test2() {
        val input = "pqrstuvwxyzabcdefghijklmno"
        val word = "leetcode"
        val expected = 73

        assertEquals(expected, SingleRowKeyboard.calculateTime(input, word))
    }
}