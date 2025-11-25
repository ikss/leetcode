package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumRoundsToCompleteAllTasksTest {

    @Test
    fun test1() {
        val tasks = intArrayOf(2, 2, 3, 3, 2, 4, 4, 4, 4, 4)
        val expected = 4

        assertEquals(expected, MinimumRoundsToCompleteAllTasks.minimumRounds(tasks))
    }

    @Test
    fun test2() {
        val tasks = intArrayOf(2, 3, 3)
        val expected = -1

        assertEquals(expected, MinimumRoundsToCompleteAllTasks.minimumRounds(tasks))
    }
}