package strings.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class GetEqualSubstringWithBudgetTest {

    @Test
    fun test1() {
        val s = "abcd"
        val t = "bcdf"
        val maxCost = 3
        val expected = 3

        assertEquals(expected, GetEqualSubstringWithBudget.equalSubstring(s, t, maxCost))
    }

    @Test
    fun test2() {
        val s = "abcd"
        val t = "cdef"
        val maxCost = 3
        val expected = 1

        assertEquals(expected, GetEqualSubstringWithBudget.equalSubstring(s, t, maxCost))
    }

    @Test
    fun test3() {
        val s = "abcd"
        val t = "acde"
        val maxCost = 0
        val expected = 1

        assertEquals(expected, GetEqualSubstringWithBudget.equalSubstring(s, t, maxCost))
    }

    @Test
    fun test4() {
        val s = "pzdfy"
        val t = "msgby"
        val maxCost = 14
        val expected = 4

        assertEquals(expected, GetEqualSubstringWithBudget.equalSubstring(s, t, maxCost))
    }

}
