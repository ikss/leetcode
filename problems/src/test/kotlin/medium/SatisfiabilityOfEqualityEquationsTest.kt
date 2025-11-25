package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SatisfiabilityOfEqualityEquationsTest {
    @Test
    fun test1() {
        val equations = arrayOf("a==b", "b!=a")
        val expected = false

        assertEquals(expected, SatisfiabilityOfEqualityEquations.equationsPossible(equations))
    }

    @Test
    fun test2() {
        val equations = arrayOf("a==b", "b==a")
        val expected = true

        assertEquals(expected, SatisfiabilityOfEqualityEquations.equationsPossible(equations))
    }
}