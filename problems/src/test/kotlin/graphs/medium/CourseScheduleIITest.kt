package graphs.medium

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class CourseScheduleIITest {
    @Test
    fun test1() {
        val numCourses = 2
        val prerequisites = arrayOf(intArrayOf(1, 0))
        val expected = intArrayOf(0, 1)

        assertArrayEquals(expected, CourseScheduleII.findOrder(numCourses, prerequisites))
    }

    @Test
    fun test2() {
        val numCourses = 4
        val prerequisites = arrayOf(intArrayOf(1, 0), intArrayOf(2, 0), intArrayOf(3, 1), intArrayOf(3, 2))
        val expected = intArrayOf(0, 1, 2, 3)

        assertArrayEquals(expected, CourseScheduleII.findOrder(numCourses, prerequisites))
    }

    @Test
    fun test3() {
        val numCourses = 1
        val prerequisites = arrayOf<IntArray>()
        val expected = intArrayOf(0)

        assertArrayEquals(expected, CourseScheduleII.findOrder(numCourses, prerequisites))
    }
}