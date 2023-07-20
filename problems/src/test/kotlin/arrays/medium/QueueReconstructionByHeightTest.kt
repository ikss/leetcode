package arrays.medium

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class QueueReconstructionByHeightTest {
    @Test
    fun test1() {
        val people = arrayOf(
            intArrayOf(7, 0),
            intArrayOf(4, 4),
            intArrayOf(7, 1),
            intArrayOf(5, 0),
            intArrayOf(6, 1),
            intArrayOf(5, 2),
        )
        val expected = arrayOf(
            intArrayOf(5, 0),
            intArrayOf(7, 0),
            intArrayOf(5, 2),
            intArrayOf(6, 1),
            intArrayOf(4, 4),
            intArrayOf(7, 1),
        )

        assertArrayEquals(expected, QueueReconstructionByHeight.reconstructQueue(people))
    }

    @Test
    fun test2() {
        val people = arrayOf(
            intArrayOf(6, 0),
            intArrayOf(5, 0),
            intArrayOf(4, 0),
            intArrayOf(3, 2),
            intArrayOf(2, 2),
            intArrayOf(1, 4),
        )
        val expected = arrayOf(
            intArrayOf(4, 0),
            intArrayOf(5, 0),
            intArrayOf(2, 2),
            intArrayOf(3, 2),
            intArrayOf(1, 4),
            intArrayOf(6, 0),
        )

        assertArrayEquals(expected, QueueReconstructionByHeight.reconstructQueue(people))
    }
}