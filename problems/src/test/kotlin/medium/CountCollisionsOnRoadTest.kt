package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CountCollisionsOnRoadTest {
    @Test
    fun test1() {
        val directions = "RLRSLL"
        val expected = 5

        assertEquals(expected, CountCollisionsOnRoad.countCollisions(directions))
    }

    @Test
    fun test2() {
        val directions = "LLRR"
        val expected = 0

        assertEquals(expected, CountCollisionsOnRoad.countCollisions(directions))
    }

    @Test
    fun test3() {
        val directions = "RRRLLL"
        val expected = 6

        assertEquals(expected, CountCollisionsOnRoad.countCollisions(directions))
    }

    @Test
    fun test4() {
        val directions = "R"
        val expected = 0

        assertEquals(expected, CountCollisionsOnRoad.countCollisions(directions))
    }
}