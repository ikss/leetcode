package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CourseScheduleTest {
    @Test
    fun test1Kahn() {
        val prerequisites = arrayOf(intArrayOf(1, 0))
        val expected = true

        assertEquals(expected, CourseSchedule.canFinishKahn(2, prerequisites))
    }

    @Test
    fun test2Kahn() {
        val prerequisites = arrayOf(intArrayOf(1, 0), intArrayOf(0, 1))
        val expected = false

        assertEquals(expected, CourseSchedule.canFinishKahn(2, prerequisites))
    }

    @Test
    fun test1Dfs() {
        val prerequisites = arrayOf(intArrayOf(1, 0))
        val expected = true

        assertEquals(expected, CourseSchedule.canFinishDfs(2, prerequisites))
    }

    @Test
    fun test2Dfs() {
        val prerequisites = arrayOf(intArrayOf(1, 0), intArrayOf(0, 1))
        val expected = false

        assertEquals(expected, CourseSchedule.canFinishDfs(2, prerequisites))
    }
}