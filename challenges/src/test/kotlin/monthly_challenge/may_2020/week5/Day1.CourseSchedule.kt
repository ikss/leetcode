package monthly_challenge.may_2020.week5

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

object CourseScheduleTest {
    @Test
    fun test1() {
        val prerequisites = arrayOf(intArrayOf(1, 0))
        val expected = true

        assertEquals(expected, CourseSchedule.canFinish(2, prerequisites))
    }

    @Test
    fun test2() {
        val prerequisites = arrayOf(intArrayOf(1, 0), intArrayOf(0, 1))
        val expected = false

        assertEquals(expected, CourseSchedule.canFinish(2, prerequisites))
    }
}
