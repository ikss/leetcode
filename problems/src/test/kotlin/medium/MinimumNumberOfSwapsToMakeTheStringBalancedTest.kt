package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumNumberOfSwapsToMakeTheStringBalancedTest {
    @Test
    fun test1Stack() {
        val s = "][]["
        val expected = 1

        assertEquals(expected, MinimumNumberOfSwapsToMakeTheStringBalanced.minSwapsStack(s))
    }

    @Test
    fun test2Stack() {
        val s = "]]][[["
        val expected = 2

        assertEquals(expected, MinimumNumberOfSwapsToMakeTheStringBalanced.minSwapsStack(s))
    }

    @Test
    fun test3Stack() {
        val s = "[]"
        val expected = 0

        assertEquals(expected, MinimumNumberOfSwapsToMakeTheStringBalanced.minSwapsStack(s))
    }

    @Test
    fun test1Count() {
        val s = "][]["
        val expected = 1

        assertEquals(expected, MinimumNumberOfSwapsToMakeTheStringBalanced.minSwapsCount(s))
    }

    @Test
    fun test2Count() {
        val s = "]]][[["
        val expected = 2

        assertEquals(expected, MinimumNumberOfSwapsToMakeTheStringBalanced.minSwapsCount(s))
    }

    @Test
    fun test3Count() {
        val s = "[]"
        val expected = 0

        assertEquals(expected, MinimumNumberOfSwapsToMakeTheStringBalanced.minSwapsCount(s))
    }
}