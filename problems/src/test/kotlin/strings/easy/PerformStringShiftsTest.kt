package strings.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class PerformStringShiftsTest {
    @Test
    fun test1() {
        val s = "abc"
        val shift = arrayOf(intArrayOf(0, 1), intArrayOf(1, 2))
        val expected = "cab"

        assertEquals(expected, PerformStringShifts.stringShift(s, shift))
    }
    
    @Test
    fun test2() {
        val s = "abcdefg"
        val shift = arrayOf(intArrayOf(1, 1), intArrayOf(1, 1), intArrayOf(0, 2), intArrayOf(1, 3))
        val expected = "efgabcd"

        assertEquals(expected, PerformStringShifts.stringShift(s, shift))
    }
}