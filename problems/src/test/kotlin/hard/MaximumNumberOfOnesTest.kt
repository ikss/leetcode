package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumNumberOfOnesTest {
    @Test
    fun test1() {
        val width = 3
        val height = 3
        val sideLength = 2
        val maxOnes = 1
        val expected = 4

        assertEquals(expected, MaximumNumberOfOnes.maximumNumberOfOnes(width, height, sideLength, maxOnes))
    }

    @Test
    fun test2() {
        val width = 3
        val height = 3
        val sideLength = 2
        val maxOnes = 2
        val expected = 6

        assertEquals(expected, MaximumNumberOfOnes.maximumNumberOfOnes(width, height, sideLength, maxOnes))
    }
}