package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CountOperationsToObtainZeroTest {
    @Test
    fun test1() {
        val num1 = 2
        val num2 = 3
        val expected = 3

        assertEquals(expected, CountOperationsToObtainZero.countOperations(num1, num2))
    }

    @Test
    fun test2() {
        val num1 = 10
        val num2 = 10
        val expected = 1

        assertEquals(expected, CountOperationsToObtainZero.countOperations(num1, num2))
    }
}