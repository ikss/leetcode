package arrays.hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ReducingDishesTest {

    @Test
    fun test1naive() {
        val satisfaction = intArrayOf(-1, -8, 0, 5, -9)
        val expected = 14

        assertEquals(expected, ReducingDishes.maxSatisfactionNaive(satisfaction))
    }

    @Test
    fun test2naive() {
        val satisfaction = intArrayOf(4, 3, 2)
        val expected = 20

        assertEquals(expected, ReducingDishes.maxSatisfactionNaive(satisfaction))
    }

    @Test
    fun test3naive() {
        val satisfaction = intArrayOf(-1, -4, -5)
        val expected = 0

        assertEquals(expected, ReducingDishes.maxSatisfactionNaive(satisfaction))
    }
}