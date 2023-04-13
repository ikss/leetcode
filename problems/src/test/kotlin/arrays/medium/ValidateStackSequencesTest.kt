package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ValidateStackSequencesTest {
    @Test
    fun test1() {
        val pushed = intArrayOf(1, 2, 3, 4, 5)
        val popped = intArrayOf(4, 5, 3, 2, 1)
        val expected = true

        assertEquals(expected, ValidateStackSequences.validateStackSequences(pushed, popped))
    }

    @Test
    fun test2() {
        val pushed = intArrayOf(1, 2, 3, 4, 5)
        val popped = intArrayOf(4, 3, 5, 1, 2)
        val expected = false

        assertEquals(expected, ValidateStackSequences.validateStackSequences(pushed, popped))
    }
}