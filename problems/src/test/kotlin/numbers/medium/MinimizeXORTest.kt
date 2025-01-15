package numbers.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimizeXORTest {
    @Test
    fun test1() {
        val num1 = 3
        val num2 = 5
        val expected = 3

        assertEquals(expected, MinimizeXOR.minimizeXor(num1, num2))
    }

    @Test
    fun test2() {
        val num1 = 1
        val num2 = 12
        val expected = 3

        assertEquals(expected, MinimizeXOR.minimizeXor(num1, num2))
    }

    @Test
    fun test3() {
        val num1 = 79
        val num2 = 74
        val expected = 76

        assertEquals(expected, MinimizeXOR.minimizeXor(num1, num2))
    }
}