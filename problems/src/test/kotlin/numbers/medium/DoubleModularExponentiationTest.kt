package numbers.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DoubleModularExponentiationTest {
    @Test
    fun test1() {
        val variables = arrayOf(intArrayOf(2, 3, 3, 10), intArrayOf(3, 3, 3, 1), intArrayOf(6, 1, 1, 4))
        val target = 2
        val expected = listOf(0, 2)

        assertEquals(expected, DoubleModularExponentiation.getGoodIndices(variables, target))
    }

    @Test
    fun test2() {
        val variables = arrayOf(intArrayOf(39, 3, 1000, 1000))
        val target = 17
        val expected = listOf<Int>()

        assertEquals(expected, DoubleModularExponentiation.getGoodIndices(variables, target))
    }
}