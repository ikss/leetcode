package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class TotalWavinessOfNumbersInRangeIITest {
    @Test
    fun test1() {
        val num1 = 120L
        val num2 = 130L
        val expected = 3L

        assertEquals(expected, TotalWavinessOfNumbersInRangeII.totalWaviness(num1, num2))
    }

    @Test
    fun test2() {
        val num1 = 198L
        val num2 = 202L
        val expected = 3L

        assertEquals(expected, TotalWavinessOfNumbersInRangeII.totalWaviness(num1, num2))
    }

    @Test
    fun test3() {
        val num1 = 4848L
        val num2 = 4848L
        val expected = 2L

        assertEquals(expected, TotalWavinessOfNumbersInRangeII.totalWaviness(num1, num2))
    }
}