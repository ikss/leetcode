package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class NumberOfProvincesTest {
    @Test
    fun test1() {
        val isConnected = arrayOf(
            intArrayOf(1, 1, 0),
            intArrayOf(1, 1, 0),
            intArrayOf(0, 0, 1),
        )
        val expected = 2

        assertEquals(expected, NumberOfProvinces.findCircleNum(isConnected))
    }

    @Test
    fun test2() {
        val isConnected = arrayOf(
            intArrayOf(1, 0, 0),
            intArrayOf(0, 1, 0),
            intArrayOf(0, 0, 1),
        )
        val expected = 3

        assertEquals(expected, NumberOfProvinces.findCircleNum(isConnected))
    }
}