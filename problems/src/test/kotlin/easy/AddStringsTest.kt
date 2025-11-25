package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class AddStringsTest {
    @Test
    fun test1() {
        val num1 = "11"
        val num2 = "123"
        val expected = "134"

        assertEquals(expected, AddStrings.addStrings(num1, num2))
    }

    @Test
    fun test2() {
        val num1 = "456"
        val num2 = "77"
        val expected = "533"

        assertEquals(expected, AddStrings.addStrings(num1, num2))
    }

    @Test
    fun test3() {
        val num1 = "9"
        val num2 = "9"
        val expected = "18"

        assertEquals(expected, AddStrings.addStrings(num1, num2))
    }

    @Test
    fun test4() {
        val num1 = "9"
        val num2 = "999"
        val expected = "1008"

        assertEquals(expected, AddStrings.addStrings(num1, num2))
    }
}