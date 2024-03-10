package strings.medium

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class PlatesBetweenCandlesTest {

    @Test
    fun test1() {
        val s = "**|**|***|"
        val queries = arrayOf(intArrayOf(2, 5), intArrayOf(5, 9))
        val expected = intArrayOf(2, 3)

        assertArrayEquals(expected, PlatesBetweenCandles.platesBetweenCandles(s, queries))
    }

    @Test
    fun test2() {
        val s = "***|**|*****|**||**|*"
        val queries = arrayOf(
            intArrayOf(1, 17), intArrayOf(4, 5), intArrayOf(14, 17), intArrayOf(5, 11), intArrayOf(15, 16)
        )
        val expected = intArrayOf(9, 0, 0, 0, 0)

        assertArrayEquals(expected, PlatesBetweenCandles.platesBetweenCandles(s, queries))
    }
}
