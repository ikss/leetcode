package easy

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class ConstructTheMinimumBitwiseArrayITest {
    @Test
    fun test1Naive() {
        val nums = listOf(2, 3, 5, 7)
        val expected = intArrayOf(-1, 1, 4, 3)

        assertArrayEquals(expected, ConstructTheMinimumBitwiseArrayI.minBitwiseArrayNaive(nums))
    }

    @Test
    fun test2Naive() {
        val nums = listOf(11, 13, 31)
        val expected = intArrayOf(9, 12, 15)

        assertArrayEquals(expected, ConstructTheMinimumBitwiseArrayI.minBitwiseArrayNaive(nums))
    }

    @Test
    fun test1Optimized() {
        val nums = listOf(2, 3, 5, 7)
        val expected = intArrayOf(-1, 1, 4, 3)

        assertArrayEquals(expected, ConstructTheMinimumBitwiseArrayI.minBitwiseArrayOptimized(nums))
    }

    @Test
    fun test2Optimized() {
        val nums = listOf(11, 13, 31)
        val expected = intArrayOf(9, 12, 15)

        assertArrayEquals(expected, ConstructTheMinimumBitwiseArrayI.minBitwiseArrayOptimized(nums))
    }
}