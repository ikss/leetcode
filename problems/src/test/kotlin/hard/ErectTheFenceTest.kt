package hard

import org.junit.jupiter.api.Assertions.assertArrayEquals
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

        assertArrayEquals(expected, ErectTheFence.outerTrees(trees))
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

        assertArrayEquals(expected, ErectTheFence.outerTrees(trees))
    }
}