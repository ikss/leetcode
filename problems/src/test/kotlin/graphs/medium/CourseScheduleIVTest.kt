package graphs.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CourseScheduleIVTest {
    @Test
    fun test1() {
        val n = 2
        val prerequisites = arrayOf(
            intArrayOf(1, 0),
        )
        val queries = arrayOf(
            intArrayOf(0, 1),
            intArrayOf(1, 0),
        )
        val expected = listOf(false, true)

        assertEquals(expected, CourseScheduleIV.checkIfPrerequisite(n, prerequisites, queries))
    }

    @Test
    fun test2() {
        val n = 2
        val prerequisites = arrayOf<IntArray>()
        val queries = arrayOf(
            intArrayOf(1, 0),
            intArrayOf(0, 1),
        )
        val expected = listOf(false, false)

        assertEquals(expected, CourseScheduleIV.checkIfPrerequisite(n, prerequisites, queries))
    }
    
    @Test
    fun test3() {
        val n = 3
        val prerequisites = arrayOf(
            intArrayOf(1, 2),
            intArrayOf(1, 0),
            intArrayOf(2, 0),
        )
        val queries = arrayOf(
            intArrayOf(1, 0),
            intArrayOf(1, 2),
        )
        val expected = listOf(true, true)

        assertEquals(expected, CourseScheduleIV.checkIfPrerequisite(n, prerequisites, queries))
    }
}