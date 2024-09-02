package strings.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimizeStringLengthTest {
    @Test
    fun test1() {
        val s = "aaabc"
        val expected = 3

        assertEquals(expected, MinimizeStringLength.minimizedStringLength(s))
    }

    @Test
    fun test2() {
        val s = "cbbd"
        val expected = 3

        assertEquals(expected, MinimizeStringLength.minimizedStringLength(s))
    }

    @Test
    fun test3() {
        val s = "baadccab"
        val expected = 4

        assertEquals(expected, MinimizeStringLength.minimizedStringLength(s))
    }
}