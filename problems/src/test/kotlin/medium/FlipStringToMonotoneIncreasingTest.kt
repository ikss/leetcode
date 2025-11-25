package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FlipStringToMonotoneIncreasingTest {

    @Test
    fun test1() {
        val s = "00110"
        val expected = 1

        assertEquals(expected, FlipStringToMonotoneIncreasing.minFlipsMonoIncr(s))
    }

    @Test
    fun test2() {
        val s = "010110"
        val expected = 2

        assertEquals(expected, FlipStringToMonotoneIncreasing.minFlipsMonoIncr(s))
    }

    @Test
    fun test3() {
        val s = "00011000"
        val expected = 2

        assertEquals(expected, FlipStringToMonotoneIncreasing.minFlipsMonoIncr(s))
    }
}