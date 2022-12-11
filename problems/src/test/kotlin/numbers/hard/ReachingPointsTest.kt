package numbers.hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ReachingPointsTest {

    @Test
    fun test1() {
        val sx = 1
        val sy = 1
        val tx = 3
        val ty = 5
        val expected = true

        assertEquals(expected, ReachingPoints.reachingPoints(sx, sy, tx, ty))
    }

    @Test
    fun test2() {
        val sx = 1
        val sy = 1
        val tx = 2
        val ty = 2
        val expected = false

        assertEquals(expected, ReachingPoints.reachingPoints(sx, sy, tx, ty))
    }

    @Test
    fun test3() {
        val sx = 1
        val sy = 1
        val tx = 1
        val ty = 1
        val expected = true

        assertEquals(expected, ReachingPoints.reachingPoints(sx, sy, tx, ty))
    }

    @Test
    fun test4() {
        val sx = 35
        val sy = 13
        val tx = 455955547
        val ty = 420098884
        val expected = false

        assertEquals(expected, ReachingPoints.reachingPoints(sx, sy, tx, ty))
    }
}
