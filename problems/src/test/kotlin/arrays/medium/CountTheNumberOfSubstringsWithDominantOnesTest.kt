package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CountTheNumberOfSubstringsWithDominantOnesTest {
    @Test
    fun test1() {
        val s = "00011"
        val expected = 5

        assertEquals(expected, CountTheNumberOfSubstringsWithDominantOnes.numberOfSubstrings(s))
    }

    @Test
    fun test2() {
        val s = "101101"
        val expected = 16

        assertEquals(expected, CountTheNumberOfSubstringsWithDominantOnes.numberOfSubstrings(s))
    }
}