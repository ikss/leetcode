package easy

import org.junit.jupiter.api.Test

class SortIntegersByTheNumberOf1BitsTest {
    @Test
    fun test1() {
        val input = intArrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8)
        val expected = intArrayOf(0, 1, 2, 4, 8, 3, 5, 6, 7)

        assert(expected.contentEquals(SortIntegersByTheNumberOf1Bits.sortByBits(input)))
    }

    @Test
    fun test2() {
        val input = intArrayOf(1024, 512, 256, 128, 64, 32, 16, 8, 4, 2, 1)
        val expected = intArrayOf(1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024)

        assert(expected.contentEquals(SortIntegersByTheNumberOf1Bits.sortByBits(input)))
    }
}