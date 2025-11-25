package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ReverseBitsTest {

    @Test
    fun test1naive() {
        val number = 43261596
        val expected = 964176192

        assertEquals(expected, ReverseBits.reverseBitsNaive(number))
    }

    @Test
    fun test2naive() {
        val number = -3
        val expected = -1073741825

        assertEquals(expected, ReverseBits.reverseBitsNaive(number))
    }

    @Test
    fun test1() {
        val number = 43261596
        val expected = 964176192

        assertEquals(expected, ReverseBits.reverseBits(number))
    }

    @Test
    fun test2() {
        val number = -3
        val expected = -1073741825

        assertEquals(expected, ReverseBits.reverseBits(number))
    }
}
