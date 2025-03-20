package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ZeroArrayTransformationITest {
    @Test
    fun test1() {
        val nums = intArrayOf(1, 0, 1)
        val queries = arrayOf(intArrayOf(0, 2))
        val expected = true

        assertEquals(expected, ZeroArrayTransformationI.isZeroArray(nums, queries))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(4, 3, 2, 1)
        val queries = arrayOf(intArrayOf(1, 3), intArrayOf(0, 2))
        val expected = false

        assertEquals(expected, ZeroArrayTransformationI.isZeroArray(nums, queries))
    }
}