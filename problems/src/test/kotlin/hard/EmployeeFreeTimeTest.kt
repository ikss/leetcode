package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class EmployeeFreeTimeTest {
    @Test
    fun test1() {
        val schedule = listOf(
            listOf(Interval(1, 2), Interval(5, 6)),
            listOf(Interval(1, 3)),
            listOf(Interval(4, 10)),
        )
        val expected = listOf(Interval(3, 4))

        assertEquals(expected, EmployeeFreeTime.employeeFreeTime(schedule))
    }
}