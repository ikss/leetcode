package medium

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class KthSmallestPrimeFractionTest {
    @Test
    fun test1() {
        val arr = intArrayOf(1, 2, 3, 5)
        val k = 3
        val expected = intArrayOf(2, 5)

        assertArrayEquals(expected, KthSmallestPrimeFraction.kthSmallestPrimeFraction(arr, k))
    }

    @Test
    fun test2() {
        val arr = intArrayOf(1, 7)
        val k = 1
        val expected = intArrayOf(1, 7)

        assertArrayEquals(expected, KthSmallestPrimeFraction.kthSmallestPrimeFraction(arr, k))
    }
}