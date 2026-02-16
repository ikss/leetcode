package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ReverseBitsTest {

    @Test
    fun test1Naive() {
        val number = 43261596
        val expected = 964176192

        assertEquals(expected, ReverseBits.reverseBitsNaive(number))
    }

    @Test
    fun test2Naive() {
        val number = -3
        val expected = -1073741825

        assertEquals(expected, ReverseBits.reverseBitsNaive(number))
    }

    @Test
    fun test1BitByBit() {
        val number = 43261596
        val expected = 964176192

        assertEquals(expected, ReverseBits.reverseBitsBitByBit(number))
    }

    @Test
    fun test2BitByBit() {
        val number = -3
        val expected = -1073741825

        assertEquals(expected, ReverseBits.reverseBitsBitByBit(number))
    }
    @Test
    fun test1MaskAndShift() {
        val number = 43261596
        val expected = 964176192

        assertEquals(expected, ReverseBits.reverseBitsMaskAndShift(number))
    }

    @Test
    fun test2MaskAndShift() {
        val number = -3
        val expected = -1073741825

        assertEquals(expected, ReverseBits.reverseBitsMaskAndShift(number))
    }
}
