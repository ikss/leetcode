package medium

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class SingleNumberIIITest {
    @Test
    fun test1() {
        val nums = intArrayOf(1, 2, 1, 3, 2, 5)
        val expected = intArrayOf(3, 5)

        assertArrayEquals(expected, SingleNumberIII.singleNumber(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(-1, 0)
        val expected = intArrayOf(-1, 0)

        assertArrayEquals(expected, SingleNumberIII.singleNumber(nums))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(0, 1)
        val expected = intArrayOf(1, 0)

        assertArrayEquals(expected, SingleNumberIII.singleNumber(nums))
    }
}