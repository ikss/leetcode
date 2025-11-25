package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class StudentAttendanceRecordIITest {
    @Test
    fun test1() {
        val n = 2
        val expected = 8

        assertEquals(expected, StudentAttendanceRecordII.checkRecord(n))
    }

    @Test
    fun test2() {
        val n = 1
        val expected = 3

        assertEquals(expected, StudentAttendanceRecordII.checkRecord(n))
    }

    @Test
    fun test3() {
        val n = 10101
        val expected = 183236316

        assertEquals(expected, StudentAttendanceRecordII.checkRecord(n))
    }
}