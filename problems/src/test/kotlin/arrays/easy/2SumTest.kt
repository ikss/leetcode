package arrays.easy

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

internal class `2SumTest` {
    @Test
    fun test1() {
        val nums = intArrayOf(2, 7, 11, 15)
        val target = 9
        val expected = intArrayOf(0, 1)

        assertTrue(expected.contentEquals(arrays.easy.`2Sum`.twoSum(nums, target)))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(3, 2, 4)
        val target = 6
        val expected = intArrayOf(1, 2)

        assertTrue(expected.contentEquals(arrays.easy.`2Sum`.twoSum(nums, target)))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(3, 3)
        val target = 6
        val expected = intArrayOf(0, 1)

        assertTrue(expected.contentEquals(arrays.easy.`2Sum`.twoSum(nums, target)))
    }
}
