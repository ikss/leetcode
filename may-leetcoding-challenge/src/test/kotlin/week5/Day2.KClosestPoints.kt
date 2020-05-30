package week5

import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

object KClosestPointsTest {
    @Test
    fun test1() {
        val points = arrayOf(intArrayOf(1, 3), intArrayOf(-2, 2))
        val result = arrayOf(intArrayOf(-2, 2))
        assertTrue(KClosestPoints.kClosest(points, 1).contentDeepEquals(result))
    }

    @Test
    fun test2() {
        val points = arrayOf(intArrayOf(3, 3), intArrayOf(5, -1), intArrayOf(-2, 4))
        val result = arrayOf(intArrayOf(3, 3), intArrayOf(-2, 4))
        assertTrue(KClosestPoints.kClosest(points, 2).contentDeepEquals(result))
    }
}
