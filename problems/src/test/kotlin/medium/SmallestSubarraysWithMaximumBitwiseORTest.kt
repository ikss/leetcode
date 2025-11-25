package medium

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class SmallestSubarraysWithMaximumBitwiseORTest {
    @Test
    fun test1() {
        val nums = intArrayOf(1, 0, 2, 1, 3)
        val output = intArrayOf(3, 3, 2, 2, 1)

        assertArrayEquals(output, SmallestSubarraysWithMaximumBitwiseOR.smallestSubarrays(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(1, 2)
        val output = intArrayOf(2, 1)

        assertArrayEquals(output, SmallestSubarraysWithMaximumBitwiseOR.smallestSubarrays(nums))
    }
}