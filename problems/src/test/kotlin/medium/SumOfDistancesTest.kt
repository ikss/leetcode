package medium

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class SumOfDistancesTest {
    @Test
    fun test1() {
        val nums = intArrayOf(1, 3, 1, 1, 2)
        val expected = longArrayOf(5, 0, 3, 4, 0)

        assertArrayEquals(expected, SumOfDistances.distance(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(0, 5, 3)
        val expected = longArrayOf(0, 0, 0)

        assertArrayEquals(expected, SumOfDistances.distance(nums))
    }
}