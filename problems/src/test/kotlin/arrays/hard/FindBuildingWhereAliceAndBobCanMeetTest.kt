package arrays.hard

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class FindBuildingWhereAliceAndBobCanMeetTest {
    @Test
    fun test1() {
        val heights = intArrayOf(6, 4, 8, 5, 2, 7)
        val queries = arrayOf(intArrayOf(0, 1), intArrayOf(0, 3), intArrayOf(2, 4), intArrayOf(3, 4), intArrayOf(2, 2))
        val expected = intArrayOf(2, 5, -1, 5, 2)

        assertArrayEquals(expected, FindBuildingWhereAliceAndBobCanMeet.leftmostBuildingQueries(heights, queries))
    }

    @Test
    fun test2() {
        val heights = intArrayOf(5, 3, 8, 2, 6, 1, 4, 6)
        val queries = arrayOf(intArrayOf(0, 7), intArrayOf(3, 5), intArrayOf(5, 2), intArrayOf(3, 0), intArrayOf(1, 6))
        val expected = intArrayOf(7, 6, -1, 4, 6)

        assertArrayEquals(expected, FindBuildingWhereAliceAndBobCanMeet.leftmostBuildingQueries(heights, queries))
    }
}