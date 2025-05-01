package arrays.hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumNumberOfTasksYouCanAssignTest {
    @Test
    fun test1() {
        val tasks = intArrayOf(3, 2, 1)
        val workers = intArrayOf(0, 3, 3)
        val pills = 1
        val strength = 1
        val expected = 3

        assertEquals(expected, MaximumNumberOfTasksYouCanAssign.maxTaskAssign(tasks, workers, pills, strength))
    }

    @Test
    fun test2() {
        val tasks = intArrayOf(5, 4)
        val workers = intArrayOf(0, 0, 0)
        val pills = 1
        val strength = 5
        val expected = 1

        assertEquals(expected, MaximumNumberOfTasksYouCanAssign.maxTaskAssign(tasks, workers, pills, strength))
    }

    @Test
    fun test3() {
        val tasks = intArrayOf(10, 15, 30)
        val workers = intArrayOf(0, 10, 10, 10, 10)
        val pills = 3
        val strength = 10
        val expected = 2

        assertEquals(expected, MaximumNumberOfTasksYouCanAssign.maxTaskAssign(tasks, workers, pills, strength))
    }
}