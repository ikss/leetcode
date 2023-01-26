package graphs.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CheapestFlightsWithinKStopsTest {

    @Test
    fun test1() {
        val n = 4
        val flights = arrayOf(
            intArrayOf(0, 1, 100),
            intArrayOf(1, 2, 100),
            intArrayOf(2, 0, 100),
            intArrayOf(1, 3, 600),
            intArrayOf(2, 3, 200),
        )
        val src = 0
        val dst = 3
        val k = 1
        val expected = 700

        assertEquals(expected, CheapestFlightsWithinKStops.findCheapestPriceOwn(n, flights, src, dst, k))
    }

    @Test
    fun test2() {
        val n = 3
        val flights = arrayOf(intArrayOf(0, 1, 100), intArrayOf(1, 2, 100), intArrayOf(0, 2, 500))
        val src = 0
        val dst = 2
        val k = 1
        val expected = 200

        assertEquals(expected, CheapestFlightsWithinKStops.findCheapestPriceOwn(n, flights, src, dst, k))
    }

    @Test
    fun test3() {
        val n = 3
        val flights = arrayOf(intArrayOf(0, 1, 100), intArrayOf(1, 2, 100), intArrayOf(0, 2, 500))
        val src = 0
        val dst = 2
        val k = 0
        val expected = 500

        assertEquals(expected, CheapestFlightsWithinKStops.findCheapestPriceOwn(n, flights, src, dst, k))
    }
}