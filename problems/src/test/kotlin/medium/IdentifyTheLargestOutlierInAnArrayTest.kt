package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class IdentifyTheLargestOutlierInAnArrayTest {
    @Test
    fun test1() {
        val nums = intArrayOf(2, 3, 5, 10)
        val expected = 10

        assertEquals(expected, IdentifyTheLargestOutlierInAnArray.getLargestOutlier(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(-2, -1, -3, -6, 4)
        val expected = 4

        assertEquals(expected, IdentifyTheLargestOutlierInAnArray.getLargestOutlier(nums))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(1, 1, 1, 1, 1, 5, 5)
        val expected = 5

        assertEquals(expected, IdentifyTheLargestOutlierInAnArray.getLargestOutlier(nums))
    }
}