package monthly_challenge.may_2020.week5

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

object KClosestPointsTest {
    @Test
    fun test1() {
        val points = arrayOf(intArrayOf(1, 3), intArrayOf(-2, 2))
        val expected = arrayOf(intArrayOf(-2, 2))

        assertArrayEquals(expected, KClosestPoints.kClosest(points, 1))
    }

    @Test
    fun test2() {
        val points = arrayOf(intArrayOf(3, 3), intArrayOf(5, -1), intArrayOf(-2, 4))
        val expected = arrayOf(intArrayOf(3, 3), intArrayOf(-2, 4))

        assertArrayEquals(expected, KClosestPoints.kClosest(points, 2))
    }
}
