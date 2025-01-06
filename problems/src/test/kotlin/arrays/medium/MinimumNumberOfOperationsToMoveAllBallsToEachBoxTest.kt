package arrays.medium

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class MinimumNumberOfOperationsToMoveAllBallsToEachBoxTest {
    @Test
    fun test1TwoPasses() {
        val boxes = "110"
        val expected = intArrayOf(1, 1, 3)

        assertArrayEquals(expected, MinimumNumberOfOperationsToMoveAllBallsToEachBox.minOperationsTwoPasses(boxes))
    }

    @Test
    fun test2TwoPasses() {
        val boxes = "001011"
        val expected = intArrayOf(11, 8, 5, 4, 3, 4)

        assertArrayEquals(expected, MinimumNumberOfOperationsToMoveAllBallsToEachBox.minOperationsTwoPasses(boxes))
    }

    @Test
    fun test1OnePass() {
        val boxes = "110"
        val expected = intArrayOf(1, 1, 3)

        assertArrayEquals(expected, MinimumNumberOfOperationsToMoveAllBallsToEachBox.minOperationsOnePass(boxes))
    }

    @Test
    fun test2OnePass() {
        val boxes = "001011"
        val expected = intArrayOf(11, 8, 5, 4, 3, 4)

        assertArrayEquals(expected, MinimumNumberOfOperationsToMoveAllBallsToEachBox.minOperationsOnePass(boxes))
    }
}