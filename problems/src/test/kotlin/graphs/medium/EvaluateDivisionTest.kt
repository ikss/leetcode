package graphs.medium

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class EvaluateDivisionTest {

    @Test
    fun test1() {
        val equations = listOf(listOf("a", "b"), listOf("b", "c"))
        val values = doubleArrayOf(2.0, 3.0)
        val queries = listOf(listOf("a", "c"), listOf("b", "a"), listOf("a", "e"), listOf("a", "a"), listOf("x", "x"))
        val expected = doubleArrayOf(6.00000, 0.50000, -1.00000, 1.00000, -1.00000)

        assertArrayEquals(expected, EvaluateDivision.calcEquation(equations, values, queries))
    }

    @Test
    fun test2() {
        val equations = listOf(listOf("a", "b"), listOf("b", "c"), listOf("bc", "cd"))
        val values = doubleArrayOf(1.5, 2.5, 5.0)
        val queries = listOf(listOf("a", "c"), listOf("c", "b"), listOf("bc", "cd"), listOf("cd", "bc"))
        val expected = doubleArrayOf(3.75000, 0.40000, 5.00000, 0.20000)

        assertArrayEquals(expected, EvaluateDivision.calcEquation(equations, values, queries))
    }

    @Test
    fun test3() {
        val equations = listOf(listOf("a", "b"))
        val values = doubleArrayOf(0.5)
        val queries = listOf(listOf("a", "b"), listOf("b", "a"), listOf("a", "c"), listOf("x", "y"))
        val expected = doubleArrayOf(0.50000, 2.00000, -1.00000, -1.00000)

        assertArrayEquals(expected, EvaluateDivision.calcEquation(equations, values, queries))
    }
}