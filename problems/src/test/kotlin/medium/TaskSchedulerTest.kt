package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class TaskSchedulerTest {
    @Test
    fun test1() {
        val input = charArrayOf('A', 'A', 'A', 'B', 'B', 'B')
        val n = 2
        val expected = 8

        assertEquals(expected, TaskScheduler.leastInterval(input, n))
    }

    @Test
    fun test2() {
        val input = charArrayOf('A', 'C', 'A', 'B', 'D', 'B')
        val n = 1
        val expected = 6

        assertEquals(expected, TaskScheduler.leastInterval(input, n))
    }

    @Test
    fun test3() {
        val input = charArrayOf('A', 'A', 'A', 'B', 'B', 'B')
        val n = 3
        val expected = 10

        assertEquals(expected, TaskScheduler.leastInterval(input, n))
    }

    @Test
    fun test4() {
        val input = charArrayOf('A', 'A', 'A', 'A', 'A', 'A', 'B', 'C', 'D', 'E', 'F', 'G')
        val n = 1
        val expected = 12

        assertEquals(expected, TaskScheduler.leastInterval(input, n))
    }
}