package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class `4KeysKeyboardTest` {
    @Test
    fun test1() {
        val n = 3
        val expected = 3

        assertEquals(expected, `4KeysKeyboard`.maxA(n))
    }

    @Test
    fun test2() {
        val n = 7
        val expected = 9

        assertEquals(expected, `4KeysKeyboard`.maxA(n))
    }

    @Test
    fun test3() {
        val n = 21
        val expected = 432

        assertEquals(expected, `4KeysKeyboard`.maxA(n))
    }
}