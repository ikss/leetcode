package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumOperationsToMakeArrayElementsZeroTest {
    @Test
    fun test1() {
        val queries = arrayOf(intArrayOf(1, 2), intArrayOf(2, 4))
        val expected = 3L

        assertEquals(expected, MinimumOperationsToMakeArrayElementsZero.minOperations(queries))
    }

    @Test
    fun test2() {
        val queries = arrayOf(intArrayOf(2, 6))
        val expected = 4L

        assertEquals(expected, MinimumOperationsToMakeArrayElementsZero.minOperations(queries))
    }
}