package hard

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class FindXValueOfArrayIITest {
    @Test
    fun test1() {
        val nums = intArrayOf(1, 2, 3, 4, 5)
        val k = 3
        val queries = arrayOf(intArrayOf(2, 2, 0, 2), intArrayOf(3, 3, 3, 0), intArrayOf(0, 1, 0, 1))
        val expected = intArrayOf(2, 2, 2)

        assertArrayEquals(expected, FindXValueOfArrayII.resultArray(nums, k, queries))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(1, 2, 4, 8, 16, 32)
        val k = 4
        val queries = arrayOf(intArrayOf(0, 2, 0, 2), intArrayOf(0, 2, 0, 1))
        val expected = intArrayOf(1, 0)

        assertArrayEquals(expected, FindXValueOfArrayII.resultArray(nums, k, queries))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(1, 1, 2, 1, 1)
        val k = 2
        val queries = arrayOf(intArrayOf(2, 1, 0, 1))
        val expected = intArrayOf(5)

        assertArrayEquals(expected, FindXValueOfArrayII.resultArray(nums, k, queries))
    }
}