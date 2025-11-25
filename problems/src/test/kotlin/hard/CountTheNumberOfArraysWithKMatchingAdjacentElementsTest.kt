package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CountTheNumberOfArraysWithKMatchingAdjacentElementsTest {
    @Test
    fun test1() {
        val n = 3
        val m = 2
        val k = 1
        val expected = 4

        assertEquals(expected, CountTheNumberOfArraysWithKMatchingAdjacentElements.countGoodArrays(n, m, k))
    }

    @Test
    fun test2() {
        val n = 4
        val m = 2
        val k = 2
        val expected = 6

        assertEquals(expected, CountTheNumberOfArraysWithKMatchingAdjacentElements.countGoodArrays(n, m, k))
    }

    @Test
    fun test3() {
        val n = 5
        val m = 2
        val k = 0
        val expected = 2

        assertEquals(expected, CountTheNumberOfArraysWithKMatchingAdjacentElements.countGoodArrays(n, m, k))
    }
}