package math.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SqrtTest {

    @Test
    fun test1() {
        val x = 4
        val expected = 2

        assertEquals(expected, Sqrt.mySqrt(x))
    }

    @Test
    fun test2() {
        val x = 8
        val expected = 2

        assertEquals(expected, Sqrt.mySqrt(x))
    }

    @Test
    fun test3() {
        val x = 2147395599
        val expected = 46339

        assertEquals(expected, Sqrt.mySqrt(x))
    }
}
