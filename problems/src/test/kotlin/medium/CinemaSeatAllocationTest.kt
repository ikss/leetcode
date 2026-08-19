package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CinemaSeatAllocationTest {
    @Test
    fun test1() {
        val n = 3
        val reservedSeats = arrayOf(
            intArrayOf(1, 2),
            intArrayOf(1, 3),
            intArrayOf(1, 8),
            intArrayOf(2, 6),
            intArrayOf(3, 1),
            intArrayOf(3, 10),
        )
        val expected = 4

        assertEquals(expected, CinemaSeatAllocation.maxNumberOfFamilies(n, reservedSeats))
    }

    @Test
    fun test2() {
        val n = 2
        val reservedSeats = arrayOf(
            intArrayOf(2, 1),
            intArrayOf(1, 8),
            intArrayOf(2, 6),
        )
        val expected = 2

        assertEquals(expected, CinemaSeatAllocation.maxNumberOfFamilies(n, reservedSeats))
    }

    @Test
    fun test3() {
        val n = 4
        val reservedSeats = arrayOf(
            intArrayOf(4, 3),
            intArrayOf(1, 4),
            intArrayOf(4, 6),
            intArrayOf(1, 7),
        )
        val expected = 4

        assertEquals(expected, CinemaSeatAllocation.maxNumberOfFamilies(n, reservedSeats))
    }
}