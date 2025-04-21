package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CountTheHiddenSequencesTest {
    @Test
    fun test1() {
        val differences = intArrayOf(1, -3, 4)
        val lower = 1
        val upper = 6
        val expected = 2

        assertEquals(expected, CountTheHiddenSequences.numberOfArrays(differences, lower, upper))
    }

    @Test
    fun test2() {
        val differences = intArrayOf(3, -4, 5, 1, -2)
        val lower = -4
        val upper = 5
        val expected = 4

        assertEquals(expected, CountTheHiddenSequences.numberOfArrays(differences, lower, upper))
    }

    @Test
    fun test3() {
        val differences = intArrayOf(4, -7, 2)
        val lower = 3
        val upper = 6
        val expected = 0

        assertEquals(expected, CountTheHiddenSequences.numberOfArrays(differences, lower, upper))
    }
}