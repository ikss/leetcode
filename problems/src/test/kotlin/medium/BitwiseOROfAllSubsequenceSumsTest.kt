package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class BitwiseOROfAllSubsequenceSumsTest {
    @Test
    fun test1() {
        val input = intArrayOf(2, 1, 0, 3)
        val expected = 7L

        assertEquals(expected, BitwiseOROfAllSubsequenceSums.subsequenceSumOr(input))
    }

    @Test
    fun test2() {
        val input = intArrayOf(0, 0, 0)
        val expected = 0L

        assertEquals(expected, BitwiseOROfAllSubsequenceSums.subsequenceSumOr(input))
    }

    @Test
    fun test3() {
        val input = intArrayOf(24, 1, 3, 16, 12, 37)
        val expected = 127L

        assertEquals(expected, BitwiseOROfAllSubsequenceSums.subsequenceSumOr(input))
    }
}