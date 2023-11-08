package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DetermineIfCellIsReachableAtGivenTimeTest {
    @Test
    fun test1() {
        val sx = 2
        val sy = 4
        val fx = 7
        val fy = 7
        val t = 6
        val expected = true

        assertEquals(expected, DetermineIfCellIsReachableAtGivenTime.isReachableAtTime(sx, sy, fx, fy, t))
    }

    @Test
    fun test2() {
        val sx = 3
        val sy = 1
        val fx = 7
        val fy = 3
        val t = 3
        val expected = false

        assertEquals(expected, DetermineIfCellIsReachableAtGivenTime.isReachableAtTime(sx, sy, fx, fy, t))
    }

    @Test
    fun test3() {
        val sx = 1
        val sy = 2
        val fx = 1
        val fy = 2
        val t = 1
        val expected = false

        assertEquals(expected, DetermineIfCellIsReachableAtGivenTime.isReachableAtTime(sx, sy, fx, fy, t))
    }
}