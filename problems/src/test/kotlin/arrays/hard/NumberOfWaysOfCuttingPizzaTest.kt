package arrays.hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class NumberOfWaysOfCuttingPizzaTest {
    @Test
    fun test1() {
        val pizza = arrayOf("A..", "AA.", "...")
        val k = 3
        val expected = 1

        assertEquals(expected, NumberOfWaysOfCuttingPizza.ways(pizza, k))
    }

    @Test
    fun test2() {
        val pizza = arrayOf("A..", "A..", "...")
        val k = 1
        val expected = 1

        assertEquals(expected, NumberOfWaysOfCuttingPizza.ways(pizza, k))
    }
}