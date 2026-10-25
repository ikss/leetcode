package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CountDaysSpentTogetherTest {
    @Test
    fun test1() {
        val arriveAlice = "08-15"
        val leaveAlice = "08-18"
        val arriveBob = "08-16"
        val leaveBob = "08-19"
        val expected = 3

        assertEquals(expected, CountDaysSpentTogether.countDaysTogether(arriveAlice, leaveAlice, arriveBob, leaveBob))
    }

    @Test
    fun test2() {
        val arriveAlice = "10-01"
        val leaveAlice = "10-31"
        val arriveBob = "11-01"
        val leaveBob = "12-31"
        val expected = 0

        assertEquals(expected, CountDaysSpentTogether.countDaysTogether(arriveAlice, leaveAlice, arriveBob, leaveBob))
    }
}