package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumASCIIDeleteSumForTwoStringsTest {
    @Test
    fun test1() {
        val s1 = "sea"
        val s2 = "eat"
        val expected = 231

        assertEquals(expected, MinimumASCIIDeleteSumForTwoStrings.minimumDeleteSum(s1, s2))
    }

    @Test
    fun test2() {
        val s1 = "delete"
        val s2 = "leet"
        val expected = 403

        assertEquals(expected, MinimumASCIIDeleteSumForTwoStrings.minimumDeleteSum(s1, s2))
    }
}