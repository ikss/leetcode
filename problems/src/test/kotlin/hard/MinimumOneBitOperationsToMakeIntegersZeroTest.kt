package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumOneBitOperationsToMakeIntegersZeroTest {
    @Test
    fun test1() {
        val n = 3
        val expected = 2

        assertEquals(expected, MinimumOneBitOperationsToMakeIntegersZero.minimumOneBitOperations(n))
    }

    @Test
    fun test2() {
        val n = 6
        val expected = 4

        assertEquals(expected, MinimumOneBitOperationsToMakeIntegersZero.minimumOneBitOperations(n))
    }
}