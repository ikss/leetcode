package arrays.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LongestUnequalAdjacentGroupsSubsequenceITest {
    @Test
    fun test1() {
        val words = arrayOf("e", "a", "b")
        val groups = intArrayOf(0, 0, 1)
        val expected = listOf("e", "b")

        assertEquals(expected, LongestUnequalAdjacentGroupsSubsequenceI.getLongestSubsequence(words, groups))
    }

    @Test
    fun test2() {
        val words = arrayOf("a", "b", "c", "d")
        val groups = intArrayOf(1, 0, 1, 1)
        val expected = listOf("a", "b", "c")

        assertEquals(expected, LongestUnequalAdjacentGroupsSubsequenceI.getLongestSubsequence(words, groups))
    }
}