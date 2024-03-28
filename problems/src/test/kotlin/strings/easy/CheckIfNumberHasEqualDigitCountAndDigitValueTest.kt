package strings.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CheckIfNumberHasEqualDigitCountAndDigitValueTest {
    @Test
    fun test1() {
        val num = "1210"
        val expected = true

        assertEquals(expected, CheckIfNumberHasEqualDigitCountAndDigitValue.digitCount(num))
    }

    @Test
    fun test2() {
        val num = "030"
        val expected = false

        assertEquals(expected, CheckIfNumberHasEqualDigitCountAndDigitValue.digitCount(num))
    }
}