package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumBagsWithFullCapacityOfRocksTest {
    @Test
    fun test1() {
        val capacity = intArrayOf(2, 3, 4, 5)
        val rocks = intArrayOf(1, 2, 4, 4)
        val additionalRocks = 2
        val expected = 3

        assertEquals(expected, MaximumBagsWithFullCapacityOfRocks.maximumBags(capacity, rocks, additionalRocks))
    }

    @Test
    fun test2() {
        val capacity = intArrayOf(10, 2, 2)
        val rocks = intArrayOf(2, 2, 0)
        val additionalRocks = 100
        val expected = 3

        assertEquals(expected, MaximumBagsWithFullCapacityOfRocks.maximumBags(capacity, rocks, additionalRocks))
    }
}