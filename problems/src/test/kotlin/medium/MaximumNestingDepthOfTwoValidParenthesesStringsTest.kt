package medium

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class MaximumNestingDepthOfTwoValidParenthesesStringsTest {
    @Test
    fun test1() {
        val seq = "(()())"
        val expected = intArrayOf(1, 0, 0, 0, 0, 1)

        assertArrayEquals(expected, MaximumNestingDepthOfTwoValidParenthesesStrings.maxDepthAfterSplit(seq))
    }

    @Test
    fun test2() {
        val seq = "()(())()"
        val expected = intArrayOf(1, 1, 1, 0, 0, 1, 1, 1)

        assertArrayEquals(expected, MaximumNestingDepthOfTwoValidParenthesesStrings.maxDepthAfterSplit(seq))
    }

    @Test
    fun test3() {
        val seq = "((((()))))"
        val expected = intArrayOf(1, 0, 1, 0, 1, 1, 0, 1, 0, 1)

        assertArrayEquals(expected, MaximumNestingDepthOfTwoValidParenthesesStrings.maxDepthAfterSplit(seq))
    }
}