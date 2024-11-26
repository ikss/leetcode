package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ZeroArrayTransformationIIITest {
    @Test
    fun test1() {
        val nums = intArrayOf(2, 0, 2)
        val queries = arrayOf(intArrayOf(0, 2), intArrayOf(0, 2), intArrayOf(1, 1))
        val expected = 1

        assertEquals(expected, ZeroArrayTransformationIII.maxRemoval(nums, queries))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(1, 1, 1, 1)
        val queries = arrayOf(intArrayOf(1, 3), intArrayOf(0, 2), intArrayOf(1, 3), intArrayOf(1, 2))
        val expected = 2

        assertEquals(expected, ZeroArrayTransformationIII.maxRemoval(nums, queries))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(1, 2, 3, 4)
        val queries = arrayOf(intArrayOf(0, 3))
        val expected = -1

        assertEquals(expected, ZeroArrayTransformationIII.maxRemoval(nums, queries))
    }
}