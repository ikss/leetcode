package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumScoreAfterRemovalsOnTreeTest {
    @Test
    fun test1() {
        val nums = intArrayOf(1, 5, 5, 4, 11)
        val edges = arrayOf(intArrayOf(0, 1), intArrayOf(1, 2), intArrayOf(1, 3), intArrayOf(3, 4))
        val expected = 9

        assertEquals(expected, MinimumScoreAfterRemovalsOnTree.minimumScore(nums, edges))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(5, 5, 2, 4, 4, 2)
        val edges = arrayOf(intArrayOf(0, 1), intArrayOf(1, 2), intArrayOf(5, 2), intArrayOf(4, 3), intArrayOf(1, 3))
        val expected = 0

        assertEquals(expected, MinimumScoreAfterRemovalsOnTree.minimumScore(nums, edges))
    }
}