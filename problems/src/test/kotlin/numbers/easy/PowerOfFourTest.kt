package numbers.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class PowerOfFourTest {
    @Test
    fun test1() {
        val n = 16
        val expected = true

        assertEquals(expected, PowerOfFour.isPowerOfFour(n))
    }

    @Test
    fun test2() {
        val n = 5
        val expected = false

        assertEquals(expected, PowerOfFour.isPowerOfFour(n))
    }

    @Test
    fun test3() {
        val n = 1
        val expected = true

        assertEquals(expected, PowerOfFour.isPowerOfFour(n))
    }
}