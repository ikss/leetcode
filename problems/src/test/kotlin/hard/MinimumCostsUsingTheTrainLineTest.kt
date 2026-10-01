package hard

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class MinimumCostsUsingTheTrainLineTest {
    @Test
    fun test1() {
        val regular = intArrayOf(1, 6, 9, 5)
        val express = intArrayOf(5, 2, 3, 10)
        val expressCost = 8
        val expected = longArrayOf(1, 7, 14, 19)

        assertArrayEquals(expected, MinimumCostsUsingTheTrainLine.minimumCosts(regular, express, expressCost))
    }

    @Test
    fun test2() {
        val regular = intArrayOf(11, 5, 13)
        val express = intArrayOf(7, 10, 6)
        val expressCost = 3
        val expected = longArrayOf(10, 15, 24)

        assertArrayEquals(expected, MinimumCostsUsingTheTrainLine.minimumCosts(regular, express, expressCost))
    }
}