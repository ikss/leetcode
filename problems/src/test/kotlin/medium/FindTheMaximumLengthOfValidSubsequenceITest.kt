package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FindTheMaximumLengthOfValidSubsequenceITest {
    @Test
    fun test1() {
        val nums = intArrayOf(1, 2, 3, 4)
        val expected = 4

        assertEquals(expected, FindTheMaximumLengthOfValidSubsequenceI.maximumLength(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(1, 2, 1, 1, 2, 1, 2)
        val expected = 6

        assertEquals(expected, FindTheMaximumLengthOfValidSubsequenceI.maximumLength(nums))
    }
}