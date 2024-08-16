package arrays.easy

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class FindTheWidthOfColumnsOfGridTest {
    @Test
    fun test1() {
        val input = arrayOf(
            intArrayOf(1),
            intArrayOf(22),
            intArrayOf(333),
        )
        val expected = intArrayOf(3)

        assertArrayEquals(expected, FindTheWidthOfColumnsOfGrid.findColumnWidth(input))
    }

    @Test
    fun test2() {
        val input = arrayOf(
            intArrayOf(-15, 1, 3),
            intArrayOf(15, 7, 12),
            intArrayOf(5, 6, -2),
        )
        val expected = intArrayOf(3, 1, 2)

        assertArrayEquals(expected, FindTheWidthOfColumnsOfGrid.findColumnWidth(input))
    }
}