package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumAbsoluteDifferenceTest {
    @Test
    fun test1() {
        val arr = intArrayOf(4, 2, 1, 3)
        val expected = listOf(listOf(1, 2), listOf(2, 3), listOf(3, 4))

        assertEquals(expected, MinimumAbsoluteDifference.minimumAbsDifference(arr))
    }

    @Test
    fun test2() {
        val arr = intArrayOf(1, 3, 6, 10, 15)
        val expected = listOf(listOf(1, 3))

        assertEquals(expected, MinimumAbsoluteDifference.minimumAbsDifference(arr))
    }

    @Test
    fun test3() {
        val arr = intArrayOf(3, 8, -10, 23, 19, -4, -14, 27)
        val expected = listOf(listOf(-14, -10), listOf(19, 23), listOf(23, 27))

        assertEquals(expected, MinimumAbsoluteDifference.minimumAbsDifference(arr))
    }
}