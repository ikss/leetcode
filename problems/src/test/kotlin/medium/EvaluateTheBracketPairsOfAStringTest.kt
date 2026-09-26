package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class EvaluateTheBracketPairsOfAStringTest {
    @Test
    fun test1() {
        val s = "(name)is(age)yearsold"
        val knowledge = listOf(listOf("name", "bob"), listOf("age", "two"))
        val expected = "bobistwoyearsold"

        assertEquals(expected, EvaluateTheBracketPairsOfAString.evaluate(s, knowledge))
    }

    @Test
    fun test2() {
        val s = "hi(name)"
        val knowledge = listOf(listOf("a", "b"))
        val expected = "hi?"

        assertEquals(expected, EvaluateTheBracketPairsOfAString.evaluate(s, knowledge))
    }

    @Test
    fun test3() {
        val s = "(a)(a)(a)aaa"
        val knowledge = listOf(listOf("a", "yes"))
        val expected = "yesyesyesaaa"

        assertEquals(expected, EvaluateTheBracketPairsOfAString.evaluate(s, knowledge))
    }
}