package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class `2KeysKeyboardTest` {
    @Test
    fun test1() {
        val n = 3
        val expected = 3

        assertEquals(expected, `2KeysKeyboard`.minSteps(n))
    }

    @Test
    fun test2() {
        val n = 1
        val expected = 0

        assertEquals(expected, `2KeysKeyboard`.minSteps(n))
    }
}