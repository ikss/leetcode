package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CheckIfBinaryStringHasAtMostOneSegmentOfOnesTest {
    @Test
    fun test1() {
        val s = "1001"
        val expected = false

        assertEquals(expected, CheckIfBinaryStringHasAtMostOneSegmentOfOnes.checkOnesSegment(s))
    }

    @Test
    fun test2() {
        val s = "110"
        val expected = true

        assertEquals(expected, CheckIfBinaryStringHasAtMostOneSegmentOfOnes.checkOnesSegment(s))
    }
}