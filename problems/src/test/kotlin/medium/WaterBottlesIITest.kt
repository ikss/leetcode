package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class WaterBottlesIITest {
    @Test
    fun test1() {
        val numBottles = 13
        val numExchange = 6
        val expected = 15

        assertEquals(expected, WaterBottlesII.maxBottlesDrunk(numBottles, numExchange))
    }

    @Test
    fun test2() {
        val numBottles = 10
        val numExchange = 3
        val expected = 13

        assertEquals(expected, WaterBottlesII.maxBottlesDrunk(numBottles, numExchange))
    }
}