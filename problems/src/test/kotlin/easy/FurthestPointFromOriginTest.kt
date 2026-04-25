package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FurthestPointFromOriginTest {
    @Test
    fun test1() {
        val moves = "L_RL__R"
        val expected = 3

        assertEquals(expected, FurthestPointFromOrigin.furthestDistanceFromOrigin(moves))
    }

    @Test
    fun test2() {
        val moves = "_R__LL_"
        val expected = 5

        assertEquals(expected, FurthestPointFromOrigin.furthestDistanceFromOrigin(moves))
    }

    @Test
    fun test3() {
        val moves = "_______"
        val expected = 7

        assertEquals(expected, FurthestPointFromOrigin.furthestDistanceFromOrigin(moves))
    }
}