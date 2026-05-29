package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ConfusingNumberTest {
    @Test
    fun test1() {
        val n = 6
        val expected = true

        assertEquals(expected, ConfusingNumber.confusingNumber(n))
    }

    @Test
    fun test2() {
        val n = 89
        val expected = true

        assertEquals(expected, ConfusingNumber.confusingNumber(n))
    }

    @Test
    fun test3() {
        val n = 11
        val expected = false

        assertEquals(expected, ConfusingNumber.confusingNumber(n))
    }
}