package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CalculateDigitSumOfAStringTest {
    @Test
    fun test1() {
        val s = "11111222223"
        val k = 3
        val expected = "135"

        assertEquals(expected, CalculateDigitSumOfAString.digitSum(s, k))
    }

    @Test
    fun test2() {
        val s = "00000000"
        val k = 3
        val expected = "000"

        assertEquals(expected, CalculateDigitSumOfAString.digitSum(s, k))
    }
}