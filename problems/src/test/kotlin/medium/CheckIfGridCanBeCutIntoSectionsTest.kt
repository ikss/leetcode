package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CheckIfGridCanBeCutIntoSectionsTest {
    @Test
    fun test1() {
        val n = 5
        val rectangles = arrayOf(
            intArrayOf(1, 0, 5, 2),
            intArrayOf(0, 2, 2, 4),
            intArrayOf(3, 2, 5, 3),
            intArrayOf(0, 4, 4, 5),
        )
        val expected = true

        assertEquals(expected, CheckIfGridCanBeCutIntoSections.checkValidCuts(n, rectangles))
    }

    @Test
    fun test2() {
        val n = 4
        val rectangles = arrayOf(
            intArrayOf(0, 0, 1, 1),
            intArrayOf(2, 0, 3, 4),
            intArrayOf(0, 2, 2, 3),
            intArrayOf(3, 0, 4, 3),
        )
        val expected = true

        assertEquals(expected, CheckIfGridCanBeCutIntoSections.checkValidCuts(n, rectangles))
    }

    @Test
    fun test3() {
        val n = 4
        val rectangles = arrayOf(
            intArrayOf(0, 2, 2, 4),
            intArrayOf(1, 0, 3, 2),
            intArrayOf(2, 2, 3, 4),
            intArrayOf(3, 0, 4, 2),
            intArrayOf(3, 2, 4, 4),
        )
        val expected = false

        assertEquals(expected, CheckIfGridCanBeCutIntoSections.checkValidCuts(n, rectangles))
    }
}