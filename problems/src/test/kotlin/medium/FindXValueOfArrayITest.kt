package medium

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class FindXValueOfArrayITest {
    @Test
    fun test1() {
        val nums = intArrayOf(1, 2, 3, 4, 5)
        val k = 3
        val expected = longArrayOf(9, 2, 4)

        assertArrayEquals(expected, FindXValueOfArrayI.resultArray(nums, k))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(1, 2, 4, 8, 16, 32)
        val k = 4
        val expected = longArrayOf(18, 1, 2, 0)

        assertArrayEquals(expected, FindXValueOfArrayI.resultArray(nums, k))
    }

}