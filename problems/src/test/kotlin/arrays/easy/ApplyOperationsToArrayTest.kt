package arrays.easy

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class ApplyOperationsToArrayTest {
    @Test
    fun test1() {
        val nums = intArrayOf(1, 2, 2, 1, 1, 0)
        val expected = intArrayOf(1, 4, 2, 0, 0, 0)

        assertArrayEquals(expected, ApplyOperationsToArray.applyOperations(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(0, 1)
        val expected = intArrayOf(1, 0)

        assertArrayEquals(expected, ApplyOperationsToArray.applyOperations(nums))
    }
}