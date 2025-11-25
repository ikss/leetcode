package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FindThePeaksTest {
    @Test
    fun test1() {
        val input = intArrayOf(2, 4, 4)
        val expected = listOf<Int>()

        assertEquals(expected, FindThePeaks.findPeaks(input))
    }

    @Test
    fun test2() {
        val input = intArrayOf(1, 4, 3, 8, 5)
        val expected = listOf(1, 3)

        assertEquals(expected, FindThePeaks.findPeaks(input))
    }
}