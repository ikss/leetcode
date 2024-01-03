package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class NumberOfLaserBeamsInBankTest {
    @Test
    fun test1() {
        val input = arrayOf(
            "011001",
            "000000",
            "010100",
            "001000",
        )
        val expected = 8

        assertEquals(expected, NumberOfLaserBeamsInBank.numberOfBeams(input))
    }

    @Test
    fun test2() {
        val input = arrayOf(
            "000",
            "111",
            "000",
        )
        val expected = 0

        assertEquals(expected, NumberOfLaserBeamsInBank.numberOfBeams(input))
    }
}