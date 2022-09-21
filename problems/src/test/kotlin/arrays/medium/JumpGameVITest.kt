package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class JumpGameVITest {

    @Test
    fun test1() {
        val nums = intArrayOf(1, -1, -2, 4, -7, 3)
        val k = 2
        val expected = 7

        assertEquals(expected, JumpGameVI.maxResult(nums, k))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(10, -5, -2, 4, 0, 3)
        val k = 3
        val expected = 17

        assertEquals(expected, JumpGameVI.maxResult(nums, k))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(1, -5, -20, 4, -1, 3, -6, -3)
        val k = 2
        val expected = 0

        assertEquals(expected, JumpGameVI.maxResult(nums, k))
    }

    @Test
    fun test4() {
        val nums = (1..10000).map { -it }.toIntArray()
        val k = 2
        val expected = -25005001

        assertEquals(expected, JumpGameVI.maxResult(nums, k))
    }

    @Test
    fun test1opt() {
        val nums = intArrayOf(1, -1, -2, 4, -7, 3)
        val k = 2
        val expected = 7

        assertEquals(expected, JumpGameVI.maxResultOpt(nums, k))
    }

    @Test
    fun test2opt() {
        val nums = intArrayOf(10, -5, -2, 4, 0, 3)
        val k = 3
        val expected = 17

        assertEquals(expected, JumpGameVI.maxResultOpt(nums, k))
    }

    @Test
    fun test3opt() {
        val nums = intArrayOf(1, -5, -20, 4, -1, 3, -6, -3)
        val k = 2
        val expected = 0

        assertEquals(expected, JumpGameVI.maxResultOpt(nums, k))
    }

    @Test
    fun test4opt() {
        val nums = (1..10000).map { -it }.toIntArray()
        val k = 2
        val expected = -25005001

        assertEquals(expected, JumpGameVI.maxResultOpt(nums, k))
    }
}
