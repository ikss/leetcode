package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class NthTribonacciNumberTest {

    @Test
    fun test1() {
        val num = 4
        val expected = 4

        assertEquals(expected, NthTribonacciNumber.tribonacci(num))
    }

    @Test
    fun test2() {
        val num = 25
        val expected = 1389537

        assertEquals(expected, NthTribonacciNumber.tribonacci(num))
    }

}