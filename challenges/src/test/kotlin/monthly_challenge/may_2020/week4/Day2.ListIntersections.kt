package monthly_challenge.may_2020.week4

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

object ListIntersectionsTest {

    @Test
    fun test1() {
        val arrA = arrayOf(intArrayOf(0, 2), intArrayOf(5, 10), intArrayOf(13, 23), intArrayOf(24, 25))
        val arrB = arrayOf(intArrayOf(1, 5), intArrayOf(8, 12), intArrayOf(15, 24), intArrayOf(25, 26))
        val expected = arrayOf(
            intArrayOf(1, 2),
            intArrayOf(5, 5),
            intArrayOf(8, 10),
            intArrayOf(15, 23),
            intArrayOf(24, 24),
            intArrayOf(25, 25)
        )

        assertArrayEquals(expected, ListIntersections.intervalIntersection(arrA, arrB))
    }

    @Test
    fun test2() {
        val arrA = emptyArray<IntArray>()
        val arrB = arrayOf(intArrayOf(1, 5), intArrayOf(8, 12), intArrayOf(15, 24), intArrayOf(25, 26))
        val expected = emptyArray<IntArray>()

        assertArrayEquals(expected, ListIntersections.intervalIntersection(arrA, arrB))
    }
}
