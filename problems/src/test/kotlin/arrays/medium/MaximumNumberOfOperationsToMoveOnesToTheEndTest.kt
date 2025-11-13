package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumNumberOfOperationsToMoveOnesToTheEndTest {
    @Test
    fun test1() {
        val s = "1001101"
        val expected = 4

        assertEquals(expected, MaximumNumberOfOperationsToMoveOnesToTheEnd.maxOperations(s))
    }

    @Test
    fun test2() {
        val s = "00111"
        val expected = 0

        assertEquals(expected, MaximumNumberOfOperationsToMoveOnesToTheEnd.maxOperations(s))
    }
}