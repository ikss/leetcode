package arrays.medium

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class RotateArrayTest {
    @Test
    fun test1() {
        val nums = intArrayOf(1, 2, 3, 4, 5, 6, 7)
        val k = 3
        RotateArray.rotate(nums, k)
        val expected = intArrayOf(5, 6, 7, 1, 2, 3, 4)

        assertArrayEquals(expected, nums)
    }

    @Test
    fun test2() {
        val nums = intArrayOf(-1, -100, 3, 99)
        val k = 2
        RotateArray.rotate(nums, k)
        val expected = intArrayOf(3, 99, -1, -100)

        assertArrayEquals(expected, nums)
    }

    @Test
    fun test3() {
        val nums = intArrayOf(-1)
        val k = 2
        RotateArray.rotate(nums, k)
        val expected = intArrayOf(-1)

        assertArrayEquals(expected, nums)
    }
}
