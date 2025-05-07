package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FindMinimumTimeToReachLastRoomITest {
    @Test
    fun test1() {
        val moveTime = arrayOf(
            intArrayOf(0, 4),
            intArrayOf(4, 4),
        )
        val expected = 6

        assertEquals(expected, FindMinimumTimeToReachLastRoomI.minTimeToReach(moveTime))
    }

    @Test
    fun test2() {
        val moveTime = arrayOf(
            intArrayOf(0, 0, 0),
            intArrayOf(0, 0, 0),
        )
        val expected = 3

        assertEquals(expected, FindMinimumTimeToReachLastRoomI.minTimeToReach(moveTime))
    }
}