package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FindTheMaximumSumOfNodeValuesTest {
    @Test
    fun test1() {
        val nums = intArrayOf(1, 2, 1)
        val k = 3
        val edges = arrayOf(intArrayOf(0, 1), intArrayOf(0, 2))
        val expected = 6L

        assertEquals(expected, FindTheMaximumSumOfNodeValues.maximumValueSum(nums, k, edges))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(2, 3)
        val k = 7
        val edges = arrayOf(intArrayOf(0, 1))
        val expected = 9L

        assertEquals(expected, FindTheMaximumSumOfNodeValues.maximumValueSum(nums, k, edges))
    }
}