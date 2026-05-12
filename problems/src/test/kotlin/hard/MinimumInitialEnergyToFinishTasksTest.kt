package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumInitialEnergyToFinishTasksTest {
    @Test
    fun test1() {
        val tasks = arrayOf(intArrayOf(1, 2), intArrayOf(2, 4), intArrayOf(4, 8))
        val expected = 8

        assertEquals(expected, MinimumInitialEnergyToFinishTasks.minimumEffort(tasks))
    }

    @Test
    fun test2() {
        val tasks = arrayOf(
            intArrayOf(1, 3),
            intArrayOf(2, 4),
            intArrayOf(10, 11),
            intArrayOf(10, 12),
            intArrayOf(8, 9),
        )
        val expected = 32

        assertEquals(expected, MinimumInitialEnergyToFinishTasks.minimumEffort(tasks))
    }

    @Test
    fun test3() {
        val tasks = arrayOf(
            intArrayOf(1, 7),
            intArrayOf(2, 8),
            intArrayOf(3, 9),
            intArrayOf(4, 10),
            intArrayOf(5, 11),
            intArrayOf(6, 12),
        )
        val expected = 27

        assertEquals(expected, MinimumInitialEnergyToFinishTasks.minimumEffort(tasks))
    }
}