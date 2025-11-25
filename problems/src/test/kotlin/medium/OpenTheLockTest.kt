package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class OpenTheLockTest {
    @Test
    fun test1() {
        val deadends = arrayOf("0201", "0101", "0102", "1212", "2002")
        val target = "0202"
        val expected = 6

        assertEquals(expected, OpenTheLock.openLock(deadends, target))
    }

    @Test
    fun test2() {
        val deadends = arrayOf("8888")
        val target = "0009"
        val expected = 1

        assertEquals(expected, OpenTheLock.openLock(deadends, target))
    }

    @Test
    fun test3() {
        val deadends = arrayOf("8887", "8889", "8878", "8898", "8788", "8988", "7888", "9888")
        val target = "8888"
        val expected = -1

        assertEquals(expected, OpenTheLock.openLock(deadends, target))
    }
}