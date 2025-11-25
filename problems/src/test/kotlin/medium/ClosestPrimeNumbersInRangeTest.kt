package medium

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class ClosestPrimeNumbersInRangeTest {
    @Test
    fun test1() {
        val left = 10
        val right = 19
        val expected = intArrayOf(11, 13)

        assertArrayEquals(expected, ClosestPrimeNumbersInRange.closestPrimes(left, right))
    }

    @Test
    fun test2() {
        val left = 4
        val right = 6
        val expected = intArrayOf(-1, -1)

        assertArrayEquals(expected, ClosestPrimeNumbersInRange.closestPrimes(left, right))
    }
}