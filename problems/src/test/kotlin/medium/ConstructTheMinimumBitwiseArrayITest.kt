package medium

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class ConstructTheMinimumBitwiseArrayITest {
    @Test
    fun test1() {
        val nums = listOf(2, 3, 5, 7)
        val expected = intArrayOf(-1, 1, 4, 3)

        assertArrayEquals(expected, ConstructTheMinimumBitwiseArrayI.minBitwiseArray(nums))
    }

    @Test
    fun test2() {
        val nums = listOf(11, 13, 31)
        val expected = intArrayOf(9, 12, 15)

        assertArrayEquals(expected, ConstructTheMinimumBitwiseArrayI.minBitwiseArray(nums))
    }
}