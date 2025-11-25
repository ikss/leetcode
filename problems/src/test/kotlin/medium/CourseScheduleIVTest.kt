package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CourseScheduleIVTest {
    @Test
    fun test1Bfs() {
        val n = 2
        val prerequisites = arrayOf(
            intArrayOf(1, 0),
        )
        val queries = arrayOf(
            intArrayOf(0, 1),
            intArrayOf(1, 0),
        )
        val expected = listOf(false, true)

        assertEquals(expected, CourseScheduleIV.checkIfPrerequisiteBfs(n, prerequisites, queries))
    }

    @Test
    fun test2Bfs() {
        val n = 2
        val prerequisites = arrayOf<IntArray>()
        val queries = arrayOf(
            intArrayOf(1, 0),
            intArrayOf(0, 1),
        )
        val expected = listOf(false, false)

        assertEquals(expected, CourseScheduleIV.checkIfPrerequisiteBfs(n, prerequisites, queries))
    }

    @Test
    fun test3Bfs() {
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

        assertEquals(expected, CourseScheduleIV.checkIfPrerequisiteBfs(n, prerequisites, queries))
    }

    @Test
    fun test1FloydWarshall() {
        val n = 2
        val prerequisites = arrayOf(
            intArrayOf(1, 0),
        )
        val queries = arrayOf(
            intArrayOf(0, 1),
            intArrayOf(1, 0),
        )
        val expected = listOf(false, true)

        assertEquals(expected, CourseScheduleIV.checkIfPrerequisiteFloydWarshall(n, prerequisites, queries))
    }

    @Test
    fun test2FloydWarshall() {
        val n = 2
        val prerequisites = arrayOf<IntArray>()
        val queries = arrayOf(
            intArrayOf(1, 0),
            intArrayOf(0, 1),
        )
        val expected = listOf(false, false)

        assertEquals(expected, CourseScheduleIV.checkIfPrerequisiteFloydWarshall(n, prerequisites, queries))
    }

    @Test
    fun test3FloydWarshall() {
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

        assertEquals(expected, CourseScheduleIV.checkIfPrerequisiteFloydWarshall(n, prerequisites, queries))
    }
}