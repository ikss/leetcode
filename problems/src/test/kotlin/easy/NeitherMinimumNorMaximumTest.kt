package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class NeitherMinimumNorMaximumTest {
    @Test
    fun test1() {
        val nums = intArrayOf(3, 2, 1, 4)
        val expected = 2

        assertEquals(expected, NeitherMinimumNorMaximum.findNonMinOrMax(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(1, 2)
        val expected = -1

        assertEquals(expected, NeitherMinimumNorMaximum.findNonMinOrMax(nums))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(2, 1, 3)
        val expected = 2

        assertEquals(expected, NeitherMinimumNorMaximum.findNonMinOrMax(nums))
    }
}