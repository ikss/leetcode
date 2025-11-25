package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimizeDeviationInArrayTest {

    @Test
    fun test1() {
        val nums = intArrayOf(1, 2, 3, 4)
        val expected = 1

        assertEquals(expected, MinimizeDeviationInArray.minimumDeviation(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(4, 1, 5, 20, 3)
        val expected = 3

        assertEquals(expected, MinimizeDeviationInArray.minimumDeviation(nums))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(2, 10, 8)
        val expected = 3

        assertEquals(expected, MinimizeDeviationInArray.minimumDeviation(nums))
    }

    @Test
    fun test4() {
        val nums = intArrayOf(9, 4, 3, 6, 2)
        val expected = 7

        assertEquals(expected, MinimizeDeviationInArray.minimumDeviation(nums))
    }

    @Test
    fun test5() {
        val nums = intArrayOf(10, 4, 3)
        val expected = 2

        assertEquals(expected, MinimizeDeviationInArray.minimumDeviation(nums))
    }
}