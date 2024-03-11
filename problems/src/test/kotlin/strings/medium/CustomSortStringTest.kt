package strings.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CustomSortStringTest {
    @Test
    fun test1() {
        val order = "cba"
        val s = "abcd"
        val expected = "cbad"

        assertEquals(expected, CustomSortString.customSortString(order, s))
    }

    @Test
    fun test2() {
        val order = "bcafg"
        val s = "abcd"
        val expected = "bcad"

        assertEquals(expected, CustomSortString.customSortString(order, s))
    }
}