package medium

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class SetMatrixZeroesTest {
    @Test
    fun test1() {
        val nums = arrayOf(intArrayOf(1, 1, 1), intArrayOf(1, 0, 1), intArrayOf(1, 1, 1))
        val expected = arrayOf(intArrayOf(1, 0, 1), intArrayOf(0, 0, 0), intArrayOf(1, 0, 1))

        SetMatrixZeroes.setZeroes(nums)

        assertArrayEquals(expected, nums)
    }

    @Test
    fun test2() {
        val nums = arrayOf(intArrayOf(0, 1, 2, 0), intArrayOf(3, 4, 5, 2), intArrayOf(1, 3, 1, 5))
        val expected = arrayOf(intArrayOf(0, 0, 0, 0), intArrayOf(0, 4, 5, 0), intArrayOf(0, 3, 1, 0))

        SetMatrixZeroes.setZeroes(nums)

        assertArrayEquals(expected, nums)
    }
}
