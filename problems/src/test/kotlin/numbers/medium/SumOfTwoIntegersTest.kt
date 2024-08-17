package numbers.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SumOfTwoIntegersTest {
    @Test
    fun test1() {
        val a = 1
        val b = 2

        val expected = 3
        assertEquals(expected, SumOfTwoIntegers.getSum(a, b))
    }

    @Test
    fun test2() {
        val a = 2
        val b = 3

        val expected = 5
        assertEquals(expected, SumOfTwoIntegers.getSum(a, b))
    }
}