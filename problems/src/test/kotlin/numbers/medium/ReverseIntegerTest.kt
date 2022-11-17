package numbers.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ReverseIntegerTest {

    @Test
    fun test1() {
        val int = 123
        val expected = 321

        assertEquals(expected, ReverseInteger.reverse(int))
    }

    @Test
    fun test2() {
        val int = -123
        val expected = -321

        assertEquals(expected, ReverseInteger.reverse(int))
    }

    @Test
    fun test3() {
        val int = 120
        val expected = 21

        assertEquals(expected, ReverseInteger.reverse(int))
    }

    @Test
    fun test4() {
        val int = 0
        val expected = 0

        assertEquals(expected, ReverseInteger.reverse(int))
    }

    @Test
    fun test5() {
        val int = Integer.MAX_VALUE
        val expected = 0

        assertEquals(expected, ReverseInteger.reverse(int))
    }
}
