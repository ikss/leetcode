package numbers.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumBitFlipsToConvertNumberTest {
    @Test
    fun test1() {
        val result = MinimumBitFlipsToConvertNumber.minBitFlips(10, 7)
        val expected = 3

        assertEquals(expected, result)
    }

    @Test
    fun test2() {
        val result = MinimumBitFlipsToConvertNumber.minBitFlips(3, 4)
        val expected = 3

        assertEquals(expected, result)
    }
}