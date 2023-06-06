package arrays.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CanMakeArithmeticProgressionFromSequenceTest {
    @Test
    fun test1sort() {
        val arr = intArrayOf(3, 5, 1)
        val expected = true

        assertEquals(expected, CanMakeArithmeticProgressionFromSequence.canMakeArithmeticProgressionSort(arr))
    }

    @Test
    fun test2sort() {
        val arr = intArrayOf(1, 2, 4)
        val expected = false

        assertEquals(expected, CanMakeArithmeticProgressionFromSequence.canMakeArithmeticProgressionSort(arr))
    }

    @Test
    fun test3sort() {
        val arr = intArrayOf(0, 0, 0)
        val expected = true

        assertEquals(expected, CanMakeArithmeticProgressionFromSequence.canMakeArithmeticProgressionSort(arr))
    }

    @Test
    fun test1optimized() {
        val arr = intArrayOf(3, 5, 1)
        val expected = true

        assertEquals(expected, CanMakeArithmeticProgressionFromSequence.canMakeArithmeticProgressionOptimized(arr))
    }

    @Test
    fun test2optimized() {
        val arr = intArrayOf(1, 2, 4)
        val expected = false

        assertEquals(expected, CanMakeArithmeticProgressionFromSequence.canMakeArithmeticProgressionOptimized(arr))
    }

    @Test
    fun test3optimized() {
        val arr = intArrayOf(0, 0, 0)
        val expected = true

        assertEquals(expected, CanMakeArithmeticProgressionFromSequence.canMakeArithmeticProgressionOptimized(arr))
    }
}