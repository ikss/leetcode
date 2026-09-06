package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DistinctSubsequencesTest {
    @Test
    fun test1Dp() {
        val s = "rabbbit"
        val t = "rabbit"
        val expected = 3

        assertEquals(expected, DistinctSubsequences.numDistinctDp(s, t))
    }

    @Test
    fun test2Dp() {
        val s = "babgbag"
        val t = "bag"
        val expected = 5

        assertEquals(expected, DistinctSubsequences.numDistinctDp(s, t))
    }

    @Test
    fun test1DpSpaceOptimized() {
        val s = "rabbbit"
        val t = "rabbit"
        val expected = 3

        assertEquals(expected, DistinctSubsequences.numDistinctDpSpaceOptimized(s, t))
    }

    @Test
    fun test2DpSpaceOptimized() {
        val s = "babgbag"
        val t = "bag"
        val expected = 5

        assertEquals(expected, DistinctSubsequences.numDistinctDpSpaceOptimized(s, t))
    }
}