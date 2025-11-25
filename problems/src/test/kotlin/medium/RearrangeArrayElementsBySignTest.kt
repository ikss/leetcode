package medium

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class RearrangeArrayElementsBySignTest {
    @Test
    fun test1() {
        val nums = intArrayOf(3, 1, -2, -5, 2, -4)
        val expected = intArrayOf(3, -2, 1, -5, 2, -4)

        assertArrayEquals(expected, RearrangeArrayElementsBySign.rearrangeArray(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(-1, 1)
        val expected = intArrayOf(1, -1)

        assertArrayEquals(expected, RearrangeArrayElementsBySign.rearrangeArray(nums))
    }
}