package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximizeTheNumberOfPartitionsAfterOperationsTest {
    @Test
    fun test1() {
        val s = "accca"
        val k = 2
        val expected = 3

        assertEquals(expected, MaximizeTheNumberOfPartitionsAfterOperations.maxPartitionsAfterOperations(s, k))
    }

    @Test
    fun test2() {
        val s = "xxyz"
        val k = 1
        val expected = 4

        assertEquals(expected, MaximizeTheNumberOfPartitionsAfterOperations.maxPartitionsAfterOperations(s, k))
    }
}