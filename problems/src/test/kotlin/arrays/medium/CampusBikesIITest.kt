package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CampusBikesIITest {
    @Test
    fun test1() {
        val workers = arrayOf(intArrayOf(0, 0), intArrayOf(2, 1))
        val bikes = arrayOf(intArrayOf(1, 2), intArrayOf(3, 3))
        val expected = 6

        assertEquals(expected, CampusBikesII.assignBikes(workers, bikes))
    }

    @Test
    fun test2() {
        val workers = arrayOf(intArrayOf(0, 0), intArrayOf(1, 1), intArrayOf(2, 0))
        val bikes = arrayOf(intArrayOf(1, 0), intArrayOf(2, 2), intArrayOf(2, 1))
        val expected = 4

        assertEquals(expected, CampusBikesII.assignBikes(workers, bikes))
    }

    @Test
    fun test3() {
        val workers = arrayOf(intArrayOf(0, 0), intArrayOf(1, 0), intArrayOf(2, 0), intArrayOf(3, 0), intArrayOf(4, 0))
        val bikes =
            arrayOf(intArrayOf(0, 999), intArrayOf(1, 999), intArrayOf(2, 999), intArrayOf(3, 999), intArrayOf(4, 999))
        val expected = 4995

        assertEquals(expected, CampusBikesII.assignBikes(workers, bikes))
    }
}