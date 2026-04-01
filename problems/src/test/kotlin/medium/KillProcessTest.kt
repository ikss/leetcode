package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class KillProcessTest {
    @Test
    fun test1() {
        val pid = listOf(1, 3, 10, 5)
        val ppid = listOf(3, 0, 5, 3)
        val kill = 5
        val expected = listOf(5, 10)

        assertEquals(expected, KillProcess.killProcess(pid, ppid, kill))
    }

    @Test
    fun test2() {
        val pid = listOf(1)
        val ppid = listOf(0)
        val kill = 1
        val expected = listOf(1)

        assertEquals(expected, KillProcess.killProcess(pid, ppid, kill))
    }
}