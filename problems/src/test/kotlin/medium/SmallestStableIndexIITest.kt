package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SmallestStableIndexIITest {
    @Test
    fun test1() {
        val nums = intArrayOf(5, 0, 1, 4)
        val k = 3
        val expected = 3

        assertEquals(expected, SmallestStableIndexII.firstStableIndex(nums, k))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(3, 2, 1)
        val k = 1
        val expected = -1

        assertEquals(expected, SmallestStableIndexII.firstStableIndex(nums, k))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(0)
        val k = 0
        val expected = 0

        assertEquals(expected, SmallestStableIndexII.firstStableIndex(nums, k))
    }
}