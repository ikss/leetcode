package medium

import medium.CountMentionsPerUser.countMentions
import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class CountMentionsPerUserTest {
    @Test
    fun test1() {
        val numberOfUsers = 2
        val events = listOf(
            listOf("MESSAGE", "10", "id1 id0"),
            listOf("OFFLINE", "11", "0"),
            listOf("MESSAGE", "71", "HERE"),
        )
        val expected = intArrayOf(2, 2)

        assertArrayEquals(expected, countMentions(numberOfUsers, events))
    }

    @Test
    fun test2() {
        val numberOfUsers = 2
        val events = listOf(
            listOf("MESSAGE", "10", "id1 id0"),
            listOf("OFFLINE", "11", "0"),
            listOf("MESSAGE", "12", "ALL"),
        )
        val expected = intArrayOf(2, 2)

        assertArrayEquals(expected, countMentions(numberOfUsers, events))
    }

    @Test
    fun test3() {
        val numberOfUsers = 2
        val events = listOf(
            listOf("OFFLINE", "10", "0"),
            listOf("MESSAGE", "12", "HERE"),
        )
        val expected = intArrayOf(0, 1)

        assertArrayEquals(expected, countMentions(numberOfUsers, events))
    }
}