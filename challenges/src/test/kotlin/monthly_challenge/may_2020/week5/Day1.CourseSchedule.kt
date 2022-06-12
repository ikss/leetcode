package monthly_challenge.may_2020.week5

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

object CourseScheduleTest {
    @Test
    fun test1() {
        val prerequisites = arrayOf(intArrayOf(1, 0))
        assertEquals(true, CourseSchedule.canFinish(2, prerequisites))
    }

    @Test
    fun test2() {
        val prerequisites = arrayOf(intArrayOf(1, 0), intArrayOf(0, 1))
        assertEquals(false, CourseSchedule.canFinish(2, prerequisites))
    }
}
