package numbers.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class WaterBottlesTest {
    @Test
    fun test1() {
        val numBottles = 9
        val numExchange = 3
        val expected = 13

        assertEquals(expected, WaterBottles.numWaterBottles(numBottles, numExchange))
    }

    @Test
    fun test2() {
        val numBottles = 15
        val numExchange = 4
        val expected = 19

        assertEquals(expected, WaterBottles.numWaterBottles(numBottles, numExchange))
    }
}