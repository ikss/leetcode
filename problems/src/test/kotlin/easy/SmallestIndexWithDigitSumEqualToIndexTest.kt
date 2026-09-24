package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SmallestIndexWithDigitSumEqualToIndexTest {
    @Test
    fun test1() {
        val nums = intArrayOf(1, 3, 2)
        val expected = 2

        assertEquals(expected, SmallestIndexWithDigitSumEqualToIndex.smallestIndex(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(1, 10, 11)
        val expected = 1

        assertEquals(expected, SmallestIndexWithDigitSumEqualToIndex.smallestIndex(nums))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(1, 2, 3)
        val expected = -1

        assertEquals(expected, SmallestIndexWithDigitSumEqualToIndex.smallestIndex(nums))
    }
}