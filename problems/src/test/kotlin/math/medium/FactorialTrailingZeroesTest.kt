package math.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FactorialTrailingZeroesTest {

    @Test
    fun test1() {
        val n = 3
        val expected = 0

        assertEquals(expected, FactorialTrailingZeroes.trailingZeroes(n))
    }

    @Test
    fun test3() {
        val n = 5
        val expected = 1

        assertEquals(expected, FactorialTrailingZeroes.trailingZeroes(n))
    }

    @Test
    fun test4() {
        val n = 0
        val expected = 0

        assertEquals(expected, FactorialTrailingZeroes.trailingZeroes(n))
    }
}
