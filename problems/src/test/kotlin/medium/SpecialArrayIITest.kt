package medium

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class SpecialArrayIITest {
    @Test
    fun test1Naive() {
        val nums = intArrayOf(3, 4, 1, 2, 6)
        val queries = arrayOf(intArrayOf(0, 4))
        val expected = booleanArrayOf(false)

        assertArrayEquals(expected, SpecialArrayII.isArraySpecialNaive(nums, queries))
    }

    @Test
    fun test2Naive() {
        val nums = intArrayOf(4, 3, 1, 6)
        val queries = arrayOf(intArrayOf(0, 2), intArrayOf(2, 3))
        val expected = booleanArrayOf(false, true)

        assertArrayEquals(expected, SpecialArrayII.isArraySpecialNaive(nums, queries))
    }

    @Test
    fun test1PrefixSum() {
        val nums = intArrayOf(3, 4, 1, 2, 6)
        val queries = arrayOf(intArrayOf(0, 4))
        val expected = booleanArrayOf(false)

        assertArrayEquals(expected, SpecialArrayII.isArraySpecialPrefixSum(nums, queries))
    }

    @Test
    fun test2PrefixSum() {
        val nums = intArrayOf(4, 3, 1, 6)
        val queries = arrayOf(intArrayOf(0, 2), intArrayOf(2, 3))
        val expected = booleanArrayOf(false, true)

        assertArrayEquals(expected, SpecialArrayII.isArraySpecialPrefixSum(nums, queries))
    }
}