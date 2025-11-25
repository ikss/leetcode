package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CheckIfItIsStraightLineTest {
    @Test
    fun test1() {
        val coordinates = arrayOf(
            intArrayOf(1, 2),
            intArrayOf(2, 3),
            intArrayOf(3, 4),
            intArrayOf(4, 5),
            intArrayOf(5, 6),
            intArrayOf(6, 7),
        )
        val expected = true

        assertEquals(expected, CheckIfItIsStraightLine.checkStraightLine(coordinates))
    }

    @Test
    fun test2() {
        val coordinates = arrayOf(
            intArrayOf(1, 1),
            intArrayOf(2, 2),
            intArrayOf(3, 4),
            intArrayOf(4, 5),
            intArrayOf(5, 6),
            intArrayOf(7, 7),
        )
        val expected = false

        assertEquals(expected, CheckIfItIsStraightLine.checkStraightLine(coordinates))
    }

    @Test
    fun test3() {
        val coordinates = arrayOf(intArrayOf(1, 1), intArrayOf(2, 2), intArrayOf(2, 0))
        val expected = false

        assertEquals(expected, CheckIfItIsStraightLine.checkStraightLine(coordinates))
    }
}