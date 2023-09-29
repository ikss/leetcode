package arrays.easy

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class SortArrayByParityTest {
    @Test
    fun test1() {
        val nums = intArrayOf(3, 1, 2, 4)
        val expected = intArrayOf(4, 2, 1, 3)

        assertArrayEquals(expected, SortArrayByParity.sortArrayByParity(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(0)
        val expected = intArrayOf(0)

        assertArrayEquals(expected, SortArrayByParity.sortArrayByParity(nums))
    }
}