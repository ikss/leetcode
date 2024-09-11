package arrays.medium

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class MeetingSchedulerTest {
    @Test
    fun test1() {
        val slots1 = arrayOf(intArrayOf(10, 50), intArrayOf(60, 120), intArrayOf(140, 210))
        val slots2 = arrayOf(intArrayOf(0, 15), intArrayOf(60, 70))
        val duration = 8
        val expected = listOf(60, 68)

        assertEquals(expected, MeetingScheduler.minAvailableDuration(slots1, slots2, duration))
    }
    
    @Test
    fun test2() {
        val slots1 = arrayOf(intArrayOf(10, 50), intArrayOf(60, 120), intArrayOf(140, 210))
        val slots2 = arrayOf(intArrayOf(0, 15), intArrayOf(60, 70))
        val duration = 12
        val expected = emptyList<Int>()

        assertEquals(expected, MeetingScheduler.minAvailableDuration(slots1, slots2, duration))
    }
}