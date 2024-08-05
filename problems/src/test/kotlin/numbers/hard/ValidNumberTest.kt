package numbers.hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ValidNumberTest {
    @Test
    fun test1() {
        val input = "0"
        val expected = true

        assertEquals(expected, ValidNumber.isNumber(input))
    }

    @Test
    fun test2() {
        val input = "e"
        val expected = false

        assertEquals(expected, ValidNumber.isNumber(input))
    }

    @Test
    fun test3() {
        val input = "."
        val expected = false

        assertEquals(expected, ValidNumber.isNumber(input))
    }

    @Test
    fun test4() {
        val input = ".1"
        val expected = true

        assertEquals(expected, ValidNumber.isNumber(input))
    }
    
    @Test
    fun test5() {
        val input = "e4"
        val expected = false

        assertEquals(expected, ValidNumber.isNumber(input))
    }
}