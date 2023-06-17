package arrays.hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MakeArrayStrictlyIncreasingTest {

    @Test
    fun test1() {
        val arr1 = intArrayOf(1, 5, 3, 6, 7)
        val arr2 = intArrayOf(1, 3, 2, 4)
        val expected = 1

        assertEquals(expected, MakeArrayStrictlyIncreasing.makeArrayIncreasing(arr1, arr2))
    }

    @Test
    fun test2() {
        val arr1 = intArrayOf(1, 5, 3, 6, 7)
        val arr2 = intArrayOf(4, 3, 1)
        val expected = 2

        assertEquals(expected, MakeArrayStrictlyIncreasing.makeArrayIncreasing(arr1, arr2))
    }

    @Test
    fun test3() {
        val arr1 = intArrayOf(1, 5, 3, 6, 7)
        val arr2 = intArrayOf(1, 6, 3, 3)
        val expected = -1

        assertEquals(expected, MakeArrayStrictlyIncreasing.makeArrayIncreasing(arr1, arr2))
    }
}