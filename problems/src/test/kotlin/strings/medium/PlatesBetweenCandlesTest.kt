package strings.medium

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

internal class PlatesBetweenCandlesTest {

    @Test
    fun test1() {
        val s = "**|**|***|"
        val queries = arrayOf(intArrayOf(2, 5), intArrayOf(5, 9))
        val expected = intArrayOf(2, 3)

        assertTrue(expected.contentEquals(PlatesBetweenCandles.platesBetweenCandles(s, queries)))
    }

    @Test
    fun test2() {
        val s = "***|**|*****|**||**|*"
        val queries = arrayOf(
                intArrayOf(1, 17), intArrayOf(4, 5), intArrayOf(14, 17), intArrayOf(5, 11), intArrayOf(15, 16)
        )
        val expected = intArrayOf(9, 0, 0, 0, 0)

        assertTrue(expected.contentEquals(PlatesBetweenCandles.platesBetweenCandles(s, queries)))
    }
}
