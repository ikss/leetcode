package math.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FactorialTrailingZeroesTest {

    @Test
    fun test1NonOptimal() {
        val n = 3
        val expected = 0

        assertEquals(expected, FactorialTrailingZeroes.trailingZeroesNonOptimal(n))
    }

    @Test
    fun test2NonOptimal() {
        val n = 5
        val expected = 1

        assertEquals(expected, FactorialTrailingZeroes.trailingZeroesNonOptimal(n))
    }

    @Test
    fun test3NonOptimal() {
        val n = 0
        val expected = 0

        assertEquals(expected, FactorialTrailingZeroes.trailingZeroesNonOptimal(n))
    }

    @Test
    fun test1Optimal() {
        val n = 3
        val expected = 0

        assertEquals(expected, FactorialTrailingZeroes.trailingZeroesOptimal(n))
    }

    @Test
    fun test2Optimal() {
        val n = 5
        val expected = 1

        assertEquals(expected, FactorialTrailingZeroes.trailingZeroesOptimal(n))
    }

    @Test
    fun test3Optimal() {
        val n = 0
        val expected = 0

        assertEquals(expected, FactorialTrailingZeroes.trailingZeroesOptimal(n))
    }
}
