package medium

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class FindMissingObservationsTest {
    @Test
    fun test1() {
        val rolls = intArrayOf(3, 2, 4, 3)
        val mean = 4
        val n = 2
        val expected = intArrayOf(6, 6)

        assertArrayEquals(expected, FindMissingObservations.missingRolls(rolls, mean, n))
    }

    @Test
    fun test2() {
        val rolls = intArrayOf(1, 5, 6)
        val mean = 3
        val n = 4
        val expected = intArrayOf(2, 2, 2, 3)

        assertArrayEquals(expected, FindMissingObservations.missingRolls(rolls, mean, n))
    }

    @Test
    fun test3() {
        val rolls = intArrayOf(1, 2, 3, 4)
        val mean = 6
        val n = 4
        val expected = intArrayOf()

        assertArrayEquals(expected, FindMissingObservations.missingRolls(rolls, mean, n))
    }
}