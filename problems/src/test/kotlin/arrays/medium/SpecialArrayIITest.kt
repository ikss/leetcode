package arrays.medium

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class SpecialArrayIITest {
    @Test
    fun test1() {
        val nums = intArrayOf(3, 4, 1, 2, 6)
        val queries = arrayOf(intArrayOf(0, 4))
        val expected = booleanArrayOf(false)

        assertArrayEquals(expected, SpecialArrayII.isArraySpecial(nums, queries))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(4, 3, 1, 6)
        val queries = arrayOf(intArrayOf(0, 2), intArrayOf(2, 3))
        val expected = booleanArrayOf(false, true)

        assertArrayEquals(expected, SpecialArrayII.isArraySpecial(nums, queries))
    }
}