package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FruitIntoBasketsTest {
    @Test
    fun test1naive() {
        val fruits = intArrayOf(1, 2, 1)
        val expected = 3

        assertEquals(expected, FruitIntoBaskets.totalFruitNaive(fruits))
    }

    @Test
    fun test2naive() {
        val fruits = intArrayOf(0, 1, 2, 2)
        val expected = 3

        assertEquals(expected, FruitIntoBaskets.totalFruitNaive(fruits))
    }

    @Test
    fun test3naive() {
        val fruits = intArrayOf(1, 2, 3, 2, 2)
        val expected = 4

        assertEquals(expected, FruitIntoBaskets.totalFruitNaive(fruits))
    }

    @Test
    fun test1slidingWindow() {
        val fruits = intArrayOf(1, 2, 1)
        val expected = 3

        assertEquals(expected, FruitIntoBaskets.totalFruitSlidingWindow(fruits))
    }

    @Test
    fun test2slidingWindow() {
        val fruits = intArrayOf(0, 1, 2, 2)
        val expected = 3

        assertEquals(expected, FruitIntoBaskets.totalFruitSlidingWindow(fruits))
    }

    @Test
    fun test3slidingWindow() {
        val fruits = intArrayOf(1, 2, 3, 2, 2)
        val expected = 4

        assertEquals(expected, FruitIntoBaskets.totalFruitSlidingWindow(fruits))
    }
}