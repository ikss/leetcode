package arrays.hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class TallestBillboardTest {

    @Test
    fun test1() {
        val height = intArrayOf(1, 2, 3, 6)
        val expected = 6

        assertEquals(expected, TallestBillboard.tallestBillboard(height))
    }

    @Test
    fun test2() {
        val height = intArrayOf(1, 2, 3, 4, 5, 6)
        val expected = 10

        assertEquals(expected, TallestBillboard.tallestBillboard(height))
    }

    @Test
    fun test3() {
        val height = intArrayOf(1, 2)
        val expected = 0

        assertEquals(expected, TallestBillboard.tallestBillboard(height))
    }
}