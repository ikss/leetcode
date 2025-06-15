package strings.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaxDifferenceYouCanGetFromChangingIntegerTest {
    @Test
    fun test1() {
        val num = 555
        val expected = 888

        assertEquals(expected, MaxDifferenceYouCanGetFromChangingInteger.maxDiff(num))
    }

    @Test
    fun test2() {
        val num = 9
        val expected = 8

        assertEquals(expected, MaxDifferenceYouCanGetFromChangingInteger.maxDiff(num))
    }
}