package numbers.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class PowerOfFourTest {
    @Test
    fun test1Loop() {
        val n = 16
        val expected = true

        assertEquals(expected, PowerOfFour.isPowerOfFourLoop(n))
    }

    @Test
    fun test2Loop() {
        val n = 5
        val expected = false

        assertEquals(expected, PowerOfFour.isPowerOfFourLoop(n))
    }

    @Test
    fun test3Loop() {
        val n = 1
        val expected = true

        assertEquals(expected, PowerOfFour.isPowerOfFourLoop(n))
    }

    @Test
    fun test1Math() {
        val n = 16
        val expected = true

        assertEquals(expected, PowerOfFour.isPowerOfFourMath(n))
    }

    @Test
    fun test2Math() {
        val n = 5
        val expected = false

        assertEquals(expected, PowerOfFour.isPowerOfFourMath(n))
    }

    @Test
    fun test3Math() {
        val n = 1
        val expected = true

        assertEquals(expected, PowerOfFour.isPowerOfFourMath(n))
    }
}