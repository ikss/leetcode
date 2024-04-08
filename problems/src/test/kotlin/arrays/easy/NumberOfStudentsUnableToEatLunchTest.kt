package arrays.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class NumberOfStudentsUnableToEatLunchTest {
    @Test
    fun test1() {
        val students = intArrayOf(1, 1, 0, 0)
        val sandwiches = intArrayOf(0, 1, 0, 1)
        val expected = 0

        assertEquals(expected, NumberOfStudentsUnableToEatLunch.countStudentsQueue(students, sandwiches))
    }
    
    @Test
    fun test2() {
        val students = intArrayOf(1, 1, 1, 0, 0, 1)
        val sandwiches = intArrayOf(1, 0, 0, 0, 1, 1)
        val expected = 3

        assertEquals(expected, NumberOfStudentsUnableToEatLunch.countStudentsQueue(students, sandwiches))
    }
}