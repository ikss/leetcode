package medium

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class ProcessTasksUsingServersTest {
    @Test
    fun test1() {
        val servers = intArrayOf(3, 3, 2)
        val tasks = intArrayOf(1, 2, 3, 2, 1, 2)
        val expected = intArrayOf(2, 2, 0, 2, 1, 2)

        assertArrayEquals(expected, ProcessTasksUsingServers.assignTasks(servers, tasks))
    }

    @Test
    fun test2() {
        val servers = intArrayOf(5, 1, 4, 3, 2)
        val tasks = intArrayOf(2, 1, 2, 4, 5, 2, 1)
        val expected = intArrayOf(1, 4, 1, 4, 1, 3, 2)

        assertArrayEquals(expected, ProcessTasksUsingServers.assignTasks(servers, tasks))
    }
}