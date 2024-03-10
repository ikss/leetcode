package arrays.easy

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class ShuffleTheArrayTest {
    @Test
    fun test1naive() {
        val nums = intArrayOf(2, 5, 1, 3, 4, 7)
        val n = 3
        val expected = intArrayOf(2, 3, 5, 4, 1, 7)

        assertArrayEquals(expected, ShuffleTheArray.shuffleNaive(nums, n))
    }

    @Test
    fun test2naive() {
        val nums = intArrayOf(1, 2, 3, 4, 4, 3, 2, 1)
        val n = 4
        val expected = intArrayOf(1, 4, 2, 3, 3, 2, 4, 1)

        assertArrayEquals(expected, ShuffleTheArray.shuffleNaive(nums, n))
    }

    @Test
    fun test3naive() {
        val nums = intArrayOf(1, 1, 2, 2)
        val n = 2
        val expected = intArrayOf(1, 2, 1, 2)

        assertArrayEquals(expected, ShuffleTheArray.shuffleNaive(nums, n))
    }

    @Test
    fun test1withBits() {
        val nums = intArrayOf(2, 5, 1, 3, 4, 7)
        val n = 3
        val expected = intArrayOf(2, 3, 5, 4, 1, 7)

        assertArrayEquals(expected, ShuffleTheArray.shuffleWithBits(nums, n))
    }

    @Test
    fun test2withBits() {
        val nums = intArrayOf(1, 2, 3, 4, 4, 3, 2, 1)
        val n = 4
        val expected = intArrayOf(1, 4, 2, 3, 3, 2, 4, 1)

        assertArrayEquals(expected, ShuffleTheArray.shuffleWithBits(nums, n))
    }

    @Test
    fun test3withBits() {
        val nums = intArrayOf(1, 1, 2, 2)
        val n = 2
        val expected = intArrayOf(1, 2, 1, 2)

        assertArrayEquals(expected, ShuffleTheArray.shuffleWithBits(nums, n))
    }
}