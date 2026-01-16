package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumSquareAreaByRemovingFencesFromFieldTest {
    @Test
    fun test1() {
        val m = 4
        val n = 3
        val hFences = intArrayOf(2, 3)
        val vFences = intArrayOf(2)
        val expected = 4
        assertEquals(expected, MaximumSquareAreaByRemovingFencesFromField.maximizeSquareArea(m, n, hFences, vFences))
    }

    @Test
    fun test2() {
        val m = 6
        val n = 7
        val hFences = intArrayOf(2)
        val vFences = intArrayOf(4)
        val expected = -1
        assertEquals(expected, MaximumSquareAreaByRemovingFencesFromField.maximizeSquareArea(m, n, hFences, vFences))
    }
}