package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximizeActiveSectionWithTradeIITest {
    @Test
    fun test1() {
        val s = "01"
        val queries = arrayOf(intArrayOf(0, 1))
        val expected = arrayListOf(1)

        assertEquals(expected, MaximizeActiveSectionWithTradeII.maxActiveSectionsAfterTrade(s, queries))
    }

    @Test
    fun test2() {
        val s = "0100"
        val queries = arrayOf(intArrayOf(0, 3), intArrayOf(0, 2), intArrayOf(1, 3), intArrayOf(2, 3))
        val expected = arrayListOf(4, 3, 1, 1)

        assertEquals(expected, MaximizeActiveSectionWithTradeII.maxActiveSectionsAfterTrade(s, queries))
    }
}