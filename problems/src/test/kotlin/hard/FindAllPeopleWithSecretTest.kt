package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FindAllPeopleWithSecretTest {
    @Test
    fun test1() {
        val n = 6
        val meetings = arrayOf(intArrayOf(1, 2, 5), intArrayOf(2, 3, 8), intArrayOf(1, 5, 10))
        val firstPerson = 1
        val expected = listOf(0, 1, 2, 3, 5)

        assertEquals(expected, FindAllPeopleWithSecret.findAllPeople(n, meetings, firstPerson))
    }

    @Test
    fun test2() {
        val n = 4
        val meetings = arrayOf(intArrayOf(3, 1, 3), intArrayOf(1, 2, 2), intArrayOf(0, 3, 3))
        val firstPerson = 3
        val expected = listOf(0, 1, 3)

        assertEquals(expected, FindAllPeopleWithSecret.findAllPeople(n, meetings, firstPerson))
    }

    @Test
    fun test3() {
        val n = 5
        val meetings = arrayOf(intArrayOf(3, 4, 2), intArrayOf(1, 2, 1), intArrayOf(2, 3, 1))
        val firstPerson = 1
        val expected = listOf(0, 1, 2, 3, 4)

        assertEquals(expected, FindAllPeopleWithSecret.findAllPeople(n, meetings, firstPerson))
    }
}