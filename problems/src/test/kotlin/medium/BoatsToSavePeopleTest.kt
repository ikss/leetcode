package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class BoatsToSavePeopleTest {

    @Test
    fun test1() {
        val people = intArrayOf(1, 2)
        val limit = 3
        val expected = 1

        assertEquals(expected, BoatsToSavePeople.numRescueBoats(people, limit))
    }

    @Test
    fun test2() {
        val people = intArrayOf(3, 2, 2, 1)
        val limit = 3
        val expected = 3

        assertEquals(expected, BoatsToSavePeople.numRescueBoats(people, limit))
    }

    @Test
    fun test3() {
        val people = intArrayOf(3, 5, 3, 4)
        val limit = 5
        val expected = 4

        assertEquals(expected, BoatsToSavePeople.numRescueBoats(people, limit))
    }
}