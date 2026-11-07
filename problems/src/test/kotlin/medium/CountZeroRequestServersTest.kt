package medium

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class CountZeroRequestServersTest {
    @Test
    fun test1() {
        val n = 3
        val logs = arrayOf(intArrayOf(1, 3), intArrayOf(2, 6), intArrayOf(1, 5))
        val x = 5
        val queries = intArrayOf(10, 11)
        val expected = intArrayOf(1, 2)

        assertArrayEquals(expected, CountZeroRequestServers.countServers(n, logs, x, queries))
    }

    @Test
    fun test2() {
        val n = 3
        val logs = arrayOf(intArrayOf(2, 4), intArrayOf(2, 1), intArrayOf(1, 2), intArrayOf(3, 1))
        val x = 2
        val queries = intArrayOf(3, 4)
        val expected = intArrayOf(0, 1)

        assertArrayEquals(expected, CountZeroRequestServers.countServers(n, logs, x, queries))
    }
}