package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumNumberOfWorkSessionsToFinishTheTasksTest {
    @Test
    fun test1() {
        val tasks = intArrayOf(1, 2, 3)
        val sessionTime = 3
        val expected = 2

        assertEquals(expected, MinimumNumberOfWorkSessionsToFinishTheTasks.minSessions(tasks, sessionTime))
    }

    @Test
    fun test2() {
        val tasks = intArrayOf(3, 1, 3, 1, 1)
        val sessionTime = 8
        val expected = 2

        assertEquals(expected, MinimumNumberOfWorkSessionsToFinishTheTasks.minSessions(tasks, sessionTime))
    }

    @Test
    fun test3() {
        val tasks = intArrayOf(1, 2, 3, 4, 5)
        val sessionTime = 15
        val expected = 1

        assertEquals(expected, MinimumNumberOfWorkSessionsToFinishTheTasks.minSessions(tasks, sessionTime))
    }

    @Test
    fun test4() {
        val tasks = intArrayOf(2, 3, 3, 4, 4, 4, 5, 6, 7, 10)
        val sessionTime = 12
        val expected = 4

        assertEquals(expected, MinimumNumberOfWorkSessionsToFinishTheTasks.minSessions(tasks, sessionTime))
    }
}