package arrays.medium

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class SingleThreadedCPUTest {
    @Test
    fun test1() {
        val nums = arrayOf(intArrayOf(1, 2), intArrayOf(2, 4), intArrayOf(3, 2), intArrayOf(4, 1))
        val expected = intArrayOf(0, 2, 3, 1)

        assertArrayEquals(expected, SingleThreadedCPU.getOrder(nums))
    }

    @Test
    fun test2() {
        val nums = arrayOf(intArrayOf(7, 10), intArrayOf(7, 12), intArrayOf(7, 5), intArrayOf(7, 4), intArrayOf(7, 2))
        val expected = intArrayOf(4, 3, 2, 0, 1)

        assertArrayEquals(expected, SingleThreadedCPU.getOrder(nums))
    }
}