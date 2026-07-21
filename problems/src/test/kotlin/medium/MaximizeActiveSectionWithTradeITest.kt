package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximizeActiveSectionWithTradeITest {
    @Test
    fun test1() {
        val s = "01"
        val expected = 1

        assertEquals(expected, MaximizeActiveSectionWithTradeI.maxActiveSectionsAfterTrade(s))
    }

    @Test
    fun test2() {
        val s = "0100"
        val expected = 4

        assertEquals(expected, MaximizeActiveSectionWithTradeI.maxActiveSectionsAfterTrade(s))
    }

    @Test
    fun test3() {
        val s = "1000100"
        val expected = 7

        assertEquals(expected, MaximizeActiveSectionWithTradeI.maxActiveSectionsAfterTrade(s))
    }

    @Test
    fun test4() {
        val s = "01010"
        val expected = 4

        assertEquals(expected, MaximizeActiveSectionWithTradeI.maxActiveSectionsAfterTrade(s))
    }

    @Test
    fun test5() {
        val s = "01101001"
        val expected = 7

        assertEquals(expected, MaximizeActiveSectionWithTradeI.maxActiveSectionsAfterTrade(s))
    }
}