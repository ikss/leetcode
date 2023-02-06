package arrays.easy

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class ShuffleTheArrayTest {
    @Test
    fun test1() {
        val nums = intArrayOf(2, 5, 1, 3, 4, 7)
        val n = 3
        val expected = intArrayOf(2, 3, 5, 4, 1, 7)

        assertTrue(expected.contentEquals(ShuffleTheArray.shuffle(nums, n)))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(1, 2, 3, 4, 4, 3, 2, 1)
        val n = 4
        val expected = intArrayOf(1, 4, 2, 3, 3, 2, 4, 1)

        assertTrue(expected.contentEquals(ShuffleTheArray.shuffle(nums, n)))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(1, 1, 2, 2)
        val n = 2
        val expected = intArrayOf(1, 2, 1, 2)

        assertTrue(expected.contentEquals(ShuffleTheArray.shuffle(nums, n)))
    }
}