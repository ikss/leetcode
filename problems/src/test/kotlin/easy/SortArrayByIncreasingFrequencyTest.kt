package easy

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class SortArrayByIncreasingFrequencyTest {
    @Test
    fun test1() {
        val nums = intArrayOf(1, 1, 2, 2, 2, 3)
        val expected = intArrayOf(3, 1, 1, 2, 2, 2)

        assertArrayEquals(expected, SortArrayByIncreasingFrequency.frequencySort(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(2, 3, 1, 3, 2)
        val expected = intArrayOf(1, 3, 3, 2, 2)

        assertArrayEquals(expected, SortArrayByIncreasingFrequency.frequencySort(nums))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(-1, 1, -6, 4, 5, -6, 1, 4, 1)
        val expected = intArrayOf(5, -1, 4, 4, -6, -6, 1, 1, 1)

        assertArrayEquals(expected, SortArrayByIncreasingFrequency.frequencySort(nums))
    }
}