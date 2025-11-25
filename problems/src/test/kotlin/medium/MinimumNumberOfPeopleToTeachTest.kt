package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumNumberOfPeopleToTeachTest {
    @Test
    fun test1() {
        val n = 2
        val languages = arrayOf(intArrayOf(1), intArrayOf(2), intArrayOf(1, 2))
        val friendships = arrayOf(intArrayOf(1, 2), intArrayOf(1, 3), intArrayOf(2, 3))
        val expected = 1

        assertEquals(expected, MinimumNumberOfPeopleToTeach.minimumTeachings(n, languages, friendships))
    }

    @Test
    fun test2() {
        val n = 3
        val languages = arrayOf(intArrayOf(2), intArrayOf(1, 3), intArrayOf(1, 2), intArrayOf(3))
        val friendships = arrayOf(intArrayOf(1, 4), intArrayOf(1, 2), intArrayOf(3, 4), intArrayOf(2, 3))
        val expected = 2

        assertEquals(expected, MinimumNumberOfPeopleToTeach.minimumTeachings(n, languages, friendships))
    }
}