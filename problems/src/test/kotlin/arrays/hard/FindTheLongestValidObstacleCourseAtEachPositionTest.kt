package arrays.hard

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class FindTheLongestValidObstacleCourseAtEachPositionTest {

    @Test
    fun test1() {
        val obstacles = intArrayOf(1, 2, 3, 2)
        val expected = intArrayOf(1, 2, 3, 3)

        val actual = FindTheLongestValidObstacleCourseAtEachPosition.longestObstacleCourseAtEachPosition(obstacles)
        assertArrayEquals(expected, actual)
    }

    @Test
    fun test2() {
        val obstacles = intArrayOf(2, 2, 1)
        val expected = intArrayOf(1, 2, 1)

        val actual = FindTheLongestValidObstacleCourseAtEachPosition.longestObstacleCourseAtEachPosition(obstacles)
        assertArrayEquals(expected, actual)
    }

    @Test
    fun test3() {
        val obstacles = intArrayOf(3, 1, 5, 6, 4, 2)
        val expected = intArrayOf(1, 1, 2, 3, 2, 2)

        val actual = FindTheLongestValidObstacleCourseAtEachPosition.longestObstacleCourseAtEachPosition(obstacles)
        assertArrayEquals(expected, actual)
    }
}