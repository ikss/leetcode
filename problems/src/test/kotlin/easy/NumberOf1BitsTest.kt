package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class NumberOf1BitsTest {

    @Test
    fun test1() {
        val number = 11
        val expected = 3

        assertEquals(expected, NumberOf1Bits.hammingWeight(number))
    }

    @Test
    fun test2() {
        val number = 128
        val expected = 1

        assertEquals(expected, NumberOf1Bits.hammingWeight(number))
    }

    @Test
    fun test3() {
        val number = -3
        val expected = 31

        assertEquals(expected, NumberOf1Bits.hammingWeight(number))
    }

    @Test
    fun test1bitshift() {
        val number = 11
        val expected = 3

        assertEquals(expected, NumberOf1Bits.hammingWeightBitShift(number))
    }

    @Test
    fun test2bitshift() {
        val number = 128
        val expected = 1

        assertEquals(expected, NumberOf1Bits.hammingWeightBitShift(number))
    }

    @Test
    fun test3bitshift() {
        val number = -3
        val expected = 31

        assertEquals(expected, NumberOf1Bits.hammingWeightBitShift(number))
    }
}
