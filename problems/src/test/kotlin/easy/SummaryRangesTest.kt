package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SummaryRangesTest {
    @Test
    fun test1() {
        val nums = intArrayOf(0, 1, 2, 4, 5, 7)
        val expected = listOf("0->2", "4->5", "7")

        assertEquals(expected, SummaryRanges.summaryRanges(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(0, 2, 3, 4, 6, 8, 9)
        val expected = listOf("0", "2->4", "6", "8->9")

        assertEquals(expected, SummaryRanges.summaryRanges(nums))
    }
}