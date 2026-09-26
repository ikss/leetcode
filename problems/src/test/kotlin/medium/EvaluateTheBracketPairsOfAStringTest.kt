package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class EvaluateTheBracketPairsOfAStringTest {
    @Test
    fun test1Stack() {
        val s = "(name)is(age)yearsold"
        val knowledge = listOf(listOf("name", "bob"), listOf("age", "two"))
        val expected = "bobistwoyearsold"

        assertEquals(expected, EvaluateTheBracketPairsOfAString.evaluateStack(s, knowledge))
    }

    @Test
    fun test2Stack() {
        val s = "hi(name)"
        val knowledge = listOf(listOf("a", "b"))
        val expected = "hi?"

        assertEquals(expected, EvaluateTheBracketPairsOfAString.evaluateStack(s, knowledge))
    }

    @Test
    fun test3Stack() {
        val s = "(a)(a)(a)aaa"
        val knowledge = listOf(listOf("a", "yes"))
        val expected = "yesyesyesaaa"

        assertEquals(expected, EvaluateTheBracketPairsOfAString.evaluateStack(s, knowledge))
    }

    @Test
    fun test1OnePass() {
        val s = "(name)is(age)yearsold"
        val knowledge = listOf(listOf("name", "bob"), listOf("age", "two"))
        val expected = "bobistwoyearsold"

        assertEquals(expected, EvaluateTheBracketPairsOfAString.evaluateOnePass(s, knowledge))
    }

    @Test
    fun test2OnePass() {
        val s = "hi(name)"
        val knowledge = listOf(listOf("a", "b"))
        val expected = "hi?"

        assertEquals(expected, EvaluateTheBracketPairsOfAString.evaluateOnePass(s, knowledge))
    }

    @Test
    fun test3OnePass() {
        val s = "(a)(a)(a)aaa"
        val knowledge = listOf(listOf("a", "yes"))
        val expected = "yesyesyesaaa"

        assertEquals(expected, EvaluateTheBracketPairsOfAString.evaluateOnePass(s, knowledge))
    }
}