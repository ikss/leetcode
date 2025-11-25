package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class BusRoutesTest {
    @Test
    fun test1() {
        val routes = arrayOf(intArrayOf(1, 2, 7), intArrayOf(3, 6, 7))
        val source = 1
        val target = 6
        val expected = 2

        assertEquals(expected, BusRoutes.numBusesToDestination(routes, source, target))
    }

    @Test
    fun test2() {
        val routes = arrayOf(
            intArrayOf(7, 12),
            intArrayOf(4, 5, 15),
            intArrayOf(6),
            intArrayOf(15, 19),
            intArrayOf(9, 12, 13),
        )
        val source = 15
        val target = 12
        val expected = -1

        assertEquals(expected, BusRoutes.numBusesToDestination(routes, source, target))
    }
}