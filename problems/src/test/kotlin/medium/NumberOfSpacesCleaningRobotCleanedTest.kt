package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class NumberOfSpacesCleaningRobotCleanedTest {
    @Test
    fun test1() {
        val room = arrayOf(
            intArrayOf(0, 0, 0),
            intArrayOf(1, 1, 0),
            intArrayOf(0, 0, 0),
        )
        val expected = 7

        assertEquals(expected, NumberOfSpacesCleaningRobotCleaned.numberOfCleanRooms(room))
    }

    @Test
    fun test2() {
        val room = arrayOf(
            intArrayOf(0, 1, 0),
            intArrayOf(1, 0, 0),
            intArrayOf(0, 0, 0),
        )
        val expected = 1

        assertEquals(expected, NumberOfSpacesCleaningRobotCleaned.numberOfCleanRooms(room))
    }

    @Test
    fun test3() {
        val room = arrayOf(
            intArrayOf(0, 0, 0),
            intArrayOf(0, 0, 0),
            intArrayOf(0, 0, 0),
        )
        val expected = 8

        assertEquals(expected, NumberOfSpacesCleaningRobotCleaned.numberOfCleanRooms(room))
    }
}