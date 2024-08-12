package numbers

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ValidPerfectSquareTest {
    @Test
    fun test1() {
        val num = 16
        val expected = true

        assertEquals(expected, ValidPerfectSquare.isPerfectSquare(num))
    }

    fun test2() {
        val num = 14
        val expected = false

        assertEquals(expected, ValidPerfectSquare.isPerfectSquare(num))
    }
}