package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ClimbingStairsIITest {
    @Test
    fun test1() {
        val n = 4
        val costs = intArrayOf(1, 2, 3, 4)
        val expected = 13

        assertEquals(expected, ClimbingStairsII.climbStairs(n, costs))
    }

    @Test
    fun test2() {
        val n = 4
        val costs = intArrayOf(5, 1, 6, 2)
        val expected = 11

        assertEquals(expected, ClimbingStairsII.climbStairs(n, costs))
    }

    @Test
    fun test3() {
        val n = 3
        val costs = intArrayOf(9, 8, 3)
        val expected = 12

        assertEquals(expected, ClimbingStairsII.climbStairs(n, costs))
    }
}