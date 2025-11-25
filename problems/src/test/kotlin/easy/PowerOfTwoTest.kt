package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class PowerOfTwoTest {

    @Test
    fun test1() {
        val n = 1
        val expected = true

        assertEquals(expected, PowerOfTwo.isPowerOfTwo(n))
    }

    @Test
    fun test2() {
        val n = 16
        val expected = true

        assertEquals(expected, PowerOfTwo.isPowerOfTwo(n))
    }

    @Test
    fun test3() {
        val n = 3
        val expected = false

        assertEquals(expected, PowerOfTwo.isPowerOfTwo(n))
    }

    @Test
    fun test4() {
        val n = -16
        val expected = false

        assertEquals(expected, PowerOfTwo.isPowerOfTwo(n))
    }
}
