package math.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class FibonacciNumberTest {

    @Test
    fun test1() {
        val n = 2
        val expected = 1

        assertEquals(expected, FibonacciNumber.fib(n))
    }

    @Test
    fun test2() {
        val n = 3
        val expected = 2

        assertEquals(expected, FibonacciNumber.fib(n))
    }

    @Test
    fun test3() {
        val n = 4
        val expected = 3

        assertEquals(expected, FibonacciNumber.fib(n))
    }

    @Test
    fun test4() {
        val n = 30
        val expected = 832040

        assertEquals(expected, FibonacciNumber.fib(n))
    }
}
