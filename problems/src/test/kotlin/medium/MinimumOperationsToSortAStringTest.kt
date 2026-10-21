package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumOperationsToSortAStringTest {
    @Test
    fun test1() {
        val s = "dog"
        val expected = 1

        assertEquals(expected, MinimumOperationsToSortAString.minOperations(s))
    }

    @Test
    fun test2() {
        val s = "card"
        val expected = 2

        assertEquals(expected, MinimumOperationsToSortAString.minOperations(s))
    }

    @Test
    fun test3() {
        val s = "gf"
        val expected = -1

        assertEquals(expected, MinimumOperationsToSortAString.minOperations(s))
    }
}