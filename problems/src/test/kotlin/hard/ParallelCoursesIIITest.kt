package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ParallelCoursesIIITest {

    @Test
    fun test1Kahn() {
        val n = 3
        val relations = arrayOf(intArrayOf(1, 3), intArrayOf(2, 3))
        val time = intArrayOf(3, 2, 5)
        val expected = 8

        assertEquals(expected, ParallelCoursesIII.minimumTimeKahn(n, relations, time))
    }

    @Test
    fun test2Kahn() {
        val n = 5
        val relations = arrayOf(
            intArrayOf(1, 5),
            intArrayOf(2, 5),
            intArrayOf(3, 5),
            intArrayOf(3, 4),
            intArrayOf(4, 5),
        )
        val time = intArrayOf(1, 2, 3, 4, 5)
        val expected = 12

        assertEquals(expected, ParallelCoursesIII.minimumTimeKahn(n, relations, time))
    }

    @Test
    fun test1dfs() {
        val n = 3
        val relations = arrayOf(intArrayOf(1, 3), intArrayOf(2, 3))
        val time = intArrayOf(3, 2, 5)
        val expected = 8

        assertEquals(expected, ParallelCoursesIII.minimumTimeDfs(n, relations, time))
    }

    @Test
    fun test2dfs() {
        val n = 5
        val relations = arrayOf(
            intArrayOf(1, 5),
            intArrayOf(2, 5),
            intArrayOf(3, 5),
            intArrayOf(3, 4),
            intArrayOf(4, 5),
        )
        val time = intArrayOf(1, 2, 3, 4, 5)
        val expected = 12

        assertEquals(expected, ParallelCoursesIII.minimumTimeDfs(n, relations, time))
    }
}