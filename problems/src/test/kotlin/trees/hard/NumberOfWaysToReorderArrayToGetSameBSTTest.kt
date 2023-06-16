package trees.hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class NumberOfWaysToReorderArrayToGetSameBSTTest {

    @Test
    fun test1() {
        val nums = intArrayOf(2, 1, 3)
        val expected = 1

        assertEquals(expected, NumberOfWaysToReorderArrayToGetSameBST.numOfWays(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(3, 4, 5, 1, 2)
        val expected = 5

        assertEquals(expected, NumberOfWaysToReorderArrayToGetSameBST.numOfWays(nums))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(1, 2, 3)
        val expected = 0

        assertEquals(expected, NumberOfWaysToReorderArrayToGetSameBST.numOfWays(nums))
    }
}