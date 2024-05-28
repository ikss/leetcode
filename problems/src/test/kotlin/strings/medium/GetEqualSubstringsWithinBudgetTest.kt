package strings.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class GetEqualSubstringsWithinBudgetTest {
    @Test
    fun test1() {
        val s = "abcd"
        val t = "bcdf"
        val maxCost = 3
        val expected = 3

        assertEquals(expected, GetEqualSubstringsWithinBudget.equalSubstring(s, t, maxCost))
    }

    @Test
    fun test2() {
        val s = "abcd"
        val t = "cdef"
        val maxCost = 3
        val expected = 1

        assertEquals(expected, GetEqualSubstringsWithinBudget.equalSubstring(s, t, maxCost))
    }

    @Test
    fun test3() {
        val s = "abcd"
        val t = "acde"
        val maxCost = 0
        val expected = 1

        assertEquals(expected, GetEqualSubstringsWithinBudget.equalSubstring(s, t, maxCost))
    }
}