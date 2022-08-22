package math.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class PowerOfFourTest {

    @Test
    fun test1cycle() {
        val n = 16
        val expected = true

        assertEquals(expected, PowerOfFour.isPowerOfFourCycle(n))
    }

    @Test
    fun test2cycle() {
        val n = 5
        val expected = false

        assertEquals(expected, PowerOfFour.isPowerOfFourCycle(n))
    }

    @Test
    fun test3cycle() {
        val n = 1
        val expected = true

        assertEquals(expected, PowerOfFour.isPowerOfFourCycle(n))
    }

    @Test
    fun test4cycle() {
        val n = -2147483648
        val expected = false

        assertEquals(expected, PowerOfFour.isPowerOfFourCycle(n))
    }

    @Test
    fun test1bit() {
        val n = 16
        val expected = true

        assertEquals(expected, PowerOfFour.isPowerOfFourBit(n))
    }

    @Test
    fun test2bit() {
        val n = 5
        val expected = false

        assertEquals(expected, PowerOfFour.isPowerOfFourBit(n))
    }

    @Test
    fun test3bit() {
        val n = 1
        val expected = true

        assertEquals(expected, PowerOfFour.isPowerOfFourBit(n))
    }

    @Test
    fun test4bit() {
        val n = -2147483648
        val expected = false

        assertEquals(expected, PowerOfFour.isPowerOfFourBit(n))
    }
}
