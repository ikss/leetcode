package medium

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class ConstructTheLexicographicallyLargestValidSequenceTest {
    @Test
    fun test1() {
        val n = 3
        val expected = intArrayOf(3, 1, 2, 3, 2)

        assertArrayEquals(expected, ConstructTheLexicographicallyLargestValidSequence.constructDistancedSequence(n))
    }

    @Test
    fun test2() {
        val n = 5
        val expected = intArrayOf(5, 3, 1, 4, 3, 5, 2, 4, 2)

        assertArrayEquals(expected, ConstructTheLexicographicallyLargestValidSequence.constructDistancedSequence(n))
    }
}