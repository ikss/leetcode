package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class AddTwoIntegersTest {
    @Test
    fun test1() {
        val a = 12
        val b = 5
        val expected = 17

        assertEquals(expected, AddTwoIntegers.sum(a, b))
    }

    @Test
    fun test2() {
        val a = -10
        val b = 4
        val expected = -6

        assertEquals(expected, AddTwoIntegers.sum(a, b))
    }
}