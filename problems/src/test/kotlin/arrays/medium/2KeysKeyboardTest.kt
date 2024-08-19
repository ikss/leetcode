package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class `2KeysKeyboardTest` {
    @Test
    fun test1Dp() {
        val n = 3
        val expected = 3

        assertEquals(expected, `2KeysKeyboard`.minStepsDp(n))
    }

    @Test
    fun test2Dp() {
        val n = 1
        val expected = 0

        assertEquals(expected, `2KeysKeyboard`.minStepsDp(n))
    }

    @Test
    fun test1Prime() {
        val n = 3
        val expected = 3

        assertEquals(expected, `2KeysKeyboard`.minStepsPrime(n))
    }

    @Test
    fun test2Prime() {
        val n = 1
        val expected = 0

        assertEquals(expected, `2KeysKeyboard`.minStepsPrime(n))
    }
}