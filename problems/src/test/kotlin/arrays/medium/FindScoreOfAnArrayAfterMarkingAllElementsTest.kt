package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FindScoreOfAnArrayAfterMarkingAllElementsTest {
    @Test
    fun test1() {
        val nums = intArrayOf(2, 1, 3, 4, 5, 2)
        val expected = 7L

        assertEquals(expected, FindScoreOfAnArrayAfterMarkingAllElements.findScore(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(2, 3, 5, 1, 3, 2)
        val expected = 5L

        assertEquals(expected, FindScoreOfAnArrayAfterMarkingAllElements.findScore(nums))
    }
}