package arrays.medium

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class MinimumNumberOfOperationsToMoveAllBallsToEachBoxTest {
    @Test
    fun test1() {
        val boxes = "110"
        val expected = intArrayOf(1, 1, 3)

        assertArrayEquals(expected, MinimumNumberOfOperationsToMoveAllBallsToEachBox.minOperations(boxes))
    }
    
    @Test
    fun test2() {
        val boxes = "001011"
        val expected = intArrayOf(11, 8, 5, 4, 3, 4)

        assertArrayEquals(expected, MinimumNumberOfOperationsToMoveAllBallsToEachBox.minOperations(boxes))
    }
}