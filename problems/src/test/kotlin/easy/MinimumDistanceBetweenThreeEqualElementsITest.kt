package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumDistanceBetweenThreeEqualElementsITest {
    @Test
    fun test1() {
        val nums = intArrayOf(1, 2, 1, 1, 3)
        val expected = 6

        assertEquals(expected, MinimumDistanceBetweenThreeEqualElementsI.minimumDistance(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(1, 1, 2, 3, 2, 1, 2)
        val expected = 8

        assertEquals(expected, MinimumDistanceBetweenThreeEqualElementsI.minimumDistance(nums))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(1)
        val expected = -1

        assertEquals(expected, MinimumDistanceBetweenThreeEqualElementsI.minimumDistance(nums))
    }
}