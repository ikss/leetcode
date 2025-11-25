package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Largest3SameDigitNumberInStringTest {
    @Test
    fun test1() {
        val num = "6777133339"
        val expected = "777"

        assertEquals(expected, Largest3SameDigitNumberInString.largestGoodInteger(num))
    }

    @Test
    fun test2() {
        val num = "2300019"
        val expected = "000"

        assertEquals(expected, Largest3SameDigitNumberInString.largestGoodInteger(num))
    }

    @Test
    fun test3() {
        val num = "42352338"
        val expected = ""

        assertEquals(expected, Largest3SameDigitNumberInString.largestGoodInteger(num))
    }
}