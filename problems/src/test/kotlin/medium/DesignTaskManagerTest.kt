package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DesignTaskManagerTest {
    @Test
    fun test1() {
        val tasks = listOf(
            listOf(1, 101, 10),
            listOf(2, 102, 20),
            listOf(3, 103, 15),
        )
        val taskManger = DesignTaskManager.TaskManager(tasks)
        taskManger.add(4, 104, 5)
        taskManger.edit(102, 8)
        taskManger.edit(102, 8)
        assertEquals(3, taskManger.execTop())
        taskManger.rmv(101)
        taskManger.add(5, 105, 15)
        assertEquals(5, taskManger.execTop())
    }

    @Test
    fun test2() {
        val tasks = listOf(
            listOf(10, 26, 25),
        )
        val taskManger = DesignTaskManager.TaskManager(tasks)
        taskManger.rmv(26)
        assertEquals(-1, taskManger.execTop())
    }
}