package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class TimeNeededToInformAllEmployeesTest {
    @Test
    fun test1() {
        val n = 1
        val headID = 0
        val manager = intArrayOf(-1)
        val informTime = intArrayOf(0)
        val expected = 0

        assertEquals(expected, TimeNeededToInformAllEmployees.numOfMinutes(n, headID, manager, informTime))
    }

    @Test
    fun test2() {
        val n = 6
        val headID = 2
        val manager = intArrayOf(2, 2, -1, 2, 2, 2)
        val informTime = intArrayOf(0, 0, 1, 0, 0, 0)
        val expected = 1

        assertEquals(expected, TimeNeededToInformAllEmployees.numOfMinutes(n, headID, manager, informTime))
    }

    @Test
    fun test3() {
        val n = 11
        val headID = 4
        val manager = intArrayOf(5, 9, 6, 10, -1, 8, 9, 1, 9, 3, 4)
        val informTime = intArrayOf(0, 213, 0, 253, 686, 170, 975, 0, 261, 309, 337)
        val expected = 2560

        assertEquals(expected, TimeNeededToInformAllEmployees.numOfMinutes(n, headID, manager, informTime))
    }
}