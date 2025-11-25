package medium

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class CampusBikesTest {
    @Test
    fun test1() {
        val workers = arrayOf(
            intArrayOf(0, 0),
            intArrayOf(2, 1),
        )
        val bikes = arrayOf(
            intArrayOf(1, 2),
            intArrayOf(3, 3),
        )
        val expected = intArrayOf(1, 0)

        assertArrayEquals(expected, CampusBikes.assignBikes(workers, bikes))
    }

    @Test
    fun test2() {
        val workers = arrayOf(
            intArrayOf(0, 0),
            intArrayOf(1, 1),
            intArrayOf(2, 0),
        )
        val bikes = arrayOf(
            intArrayOf(1, 0),
            intArrayOf(2, 2),
            intArrayOf(2, 1),
        )
        val expected = intArrayOf(0, 2, 1)

        assertArrayEquals(expected, CampusBikes.assignBikes(workers, bikes))
    }
}