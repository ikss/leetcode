package strings.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FinalValueOfVariableAfterPerformingOperationsTest {
    @Test
    fun test1() {
        val operations = arrayOf("--X", "X++", "X++")
        val expected = 1

        assertEquals(expected, FinalValueOfVariableAfterPerformingOperations.finalValueAfterOperations(operations))
    }

    @Test
    fun test2() {
        val operations = arrayOf("++X", "++X", "X++")
        val expected = 3

        assertEquals(expected, FinalValueOfVariableAfterPerformingOperations.finalValueAfterOperations(operations))
    }

    @Test
    fun test3() {
        val operations = arrayOf("X++", "++X", "--X", "X--")
        val expected = 0

        assertEquals(expected, FinalValueOfVariableAfterPerformingOperations.finalValueAfterOperations(operations))
    }
}