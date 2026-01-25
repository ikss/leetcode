package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumDifferenceBetweenHighestAndLowestOfKScoresTest {
    @Test
    fun test1() {
        val scores = intArrayOf(90)
        val k = 1
        val expected = 0

        assertEquals(expected, MinimumDifferenceBetweenHighestAndLowestOfKScores.minimumDifference(scores, k))
    }

    @Test
    fun test2() {
        val scores = intArrayOf(9, 4, 1, 7)
        val k = 2
        val expected = 2

        assertEquals(expected, MinimumDifferenceBetweenHighestAndLowestOfKScores.minimumDifference(scores, k))
    }
}