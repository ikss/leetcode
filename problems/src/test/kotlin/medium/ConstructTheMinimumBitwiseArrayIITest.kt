package medium

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class ConstructTheMinimumBitwiseArrayIITest {
    @Test
    fun test1Naive() {
        val nums = listOf(2, 3, 5, 7)
        val expected = intArrayOf(-1, 1, 4, 3)

        assertArrayEquals(expected, ConstructTheMinimumBitwiseArrayII.minBitwiseArray(nums))
    }

    @Test
    fun test2Naive() {
        val nums = listOf(11, 13, 31)
        val expected = intArrayOf(9, 12, 15)

        assertArrayEquals(expected, ConstructTheMinimumBitwiseArrayII.minBitwiseArray(nums))
    }
}