package arrays.easy

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class PlusOneTest {
    @Test
    fun test1() {
        val nums = intArrayOf(1, 2, 3)
        val expected = intArrayOf(1, 2, 4)

        assertArrayEquals(expected, PlusOne.plusOne(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(4, 3, 2, 1)
        val expected = intArrayOf(4, 3, 2, 2)

        assertArrayEquals(expected, PlusOne.plusOne(nums))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(9)
        val expected = intArrayOf(1, 0)

        assertArrayEquals(expected, PlusOne.plusOne(nums))
    }
}
