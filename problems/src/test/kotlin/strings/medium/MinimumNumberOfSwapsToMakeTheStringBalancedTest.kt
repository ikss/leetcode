package strings.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumNumberOfSwapsToMakeTheStringBalancedTest {
    @Test
    fun test1() {
        val s = "][]["
        val expected = 1

        assertEquals(expected, MinimumNumberOfSwapsToMakeTheStringBalanced.minSwaps(s))
    }

    @Test
    fun test2() {
        val s = "]]][[["
        val expected = 2

        assertEquals(expected, MinimumNumberOfSwapsToMakeTheStringBalanced.minSwaps(s))
    }

    @Test
    fun test3() {
        val s = "[]"
        val expected = 0

        assertEquals(expected, MinimumNumberOfSwapsToMakeTheStringBalanced.minSwaps(s))
    }
}