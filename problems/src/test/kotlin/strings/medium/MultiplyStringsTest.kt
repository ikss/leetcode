package strings.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Test {
    @Test
    fun test1() {
        val num1 = "2"
        val num2 = "3"
        val expected = "6"

        assertEquals(expected, MultiplyStrings.multiply(num1, num2))
    }

    @Test
    fun test2() {
        val num1 = "123"
        val num2 = "456"
        val expected = "56088"

        assertEquals(expected, MultiplyStrings.multiply(num1, num2))
    }

    @Test
    fun test3() {
        val num1 = "123456"
        val num2 = "0"
        val expected = "0"

        assertEquals(expected, MultiplyStrings.multiply(num1, num2))
    }

    @Test
    fun test4() {
        val num1 = "9999"
        val num2 = "9999"
        val expected = "99980001"

        assertEquals(expected, MultiplyStrings.multiply(num1, num2))
    }
}