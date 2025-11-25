package easy

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class MoveZeroesTest {
    @Test
    fun test1() {
        val nums = intArrayOf(0, 1, 0, 3, 12)
        MoveZeroes.moveZeroes(nums)
        val expected = intArrayOf(1, 3, 12, 0, 0)

        assertArrayEquals(expected, nums)
    }

    @Test
    fun test2() {
        val nums = intArrayOf(1, 2, 3, 4)
        MoveZeroes.moveZeroes(nums)
        val expected = intArrayOf(1, 2, 3, 4)

        assertArrayEquals(expected, nums)
    }

    @Test
    fun test3() {
        val nums = intArrayOf(0, 0, 0)
        MoveZeroes.moveZeroes(nums)
        val expected = intArrayOf(0, 0, 0)

        assertArrayEquals(expected, nums)
    }
}
