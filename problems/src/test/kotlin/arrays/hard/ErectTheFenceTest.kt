package arrays.hard

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class ErectTheFenceTest {

    @Test
    fun test1() {
        val trees = arrayOf(
            intArrayOf(1, 1),
            intArrayOf(2, 2),
            intArrayOf(2, 0),
            intArrayOf(2, 4),
            intArrayOf(3, 3),
            intArrayOf(4, 2),
        )
        val expected = arrayOf(
            intArrayOf(4, 2),
            intArrayOf(3, 3),
            intArrayOf(2, 4),
            intArrayOf(1, 1),
            intArrayOf(2, 0),
        )

        assertTrue(expected.contentDeepEquals(ErectTheFence.outerTrees(trees)))
    }

    @Test
    fun test2() {
        val trees = arrayOf(
            intArrayOf(1, 2),
            intArrayOf(2, 2),
            intArrayOf(4, 2),
        )
        val expected = arrayOf(
            intArrayOf(4, 2),
            intArrayOf(2, 2),
            intArrayOf(1, 2),
        )

        assertTrue(expected.contentDeepEquals(ErectTheFence.outerTrees(trees)))
    }
}