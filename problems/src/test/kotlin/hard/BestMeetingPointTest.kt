package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class BestMeetingPointTest {
    @Test
    fun test1() {
        val input = arrayOf(
            intArrayOf(1, 0, 0, 0, 1),
            intArrayOf(0, 0, 0, 0, 0),
            intArrayOf(0, 0, 1, 0, 0),
        )
        val expected = 6

        assertEquals(expected, BestMeetingPoint.minTotalDistance(input))
    }

    @Test
    fun test2() {
        val input = arrayOf(
            intArrayOf(1, 1),
            intArrayOf(1, 1),
        )
        val expected = 4

        assertEquals(expected, BestMeetingPoint.minTotalDistance(input))
    }
}