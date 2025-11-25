package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DetermineIfTwoEventsHaveConflictTest {
    @Test
    fun test1() {
        val event1 = arrayOf("01:15", "02:00")
        val event2 = arrayOf("02:00", "03:00")
        val expected = true

        assertEquals(expected, DetermineIfTwoEventsHaveConflict.haveConflict(event1, event2))
    }

    @Test
    fun test2() {
        val event1 = arrayOf("01:00", "02:00")
        val event2 = arrayOf("01:20", "03:00")
        val expected = true

        assertEquals(expected, DetermineIfTwoEventsHaveConflict.haveConflict(event1, event2))
    }

    @Test
    fun test3() {
        val event1 = arrayOf("10:00", "11:00")
        val event2 = arrayOf("14:00", "15:00")
        val expected = false

        assertEquals(expected, DetermineIfTwoEventsHaveConflict.haveConflict(event1, event2))
    }
}