package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DistinctSubsequencesTest {
    @Test
    fun test1() {
        val s = "rabbbit"
        val t = "rabbit"
        val expected = 3

        assertEquals(expected, DistinctSubsequences.numDistinct(s, t))
    }

    @Test
    fun test2() {
        val s = "babgbag"
        val t = "bag"
        val expected = 5

        assertEquals(expected, DistinctSubsequences.numDistinct(s, t))
    }
}