package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumMovesToCleanTheClassroomTest {
    @Test
    fun test1() {
        val classroom = arrayOf("S.", "XL")
        val energy = 2
        val expected = 2

        assertEquals(expected, MinimumMovesToCleanTheClassroom.minMoves(classroom, energy))
    }

    @Test
    fun test2() {
        val classroom = arrayOf("LS", "RL")
        val energy = 4
        val expected = 3

        assertEquals(expected, MinimumMovesToCleanTheClassroom.minMoves(classroom, energy))
    }

    @Test
    fun test3() {
        val classroom = arrayOf("L.S", "RXL")
        val energy = 3
        val expected = -1

        assertEquals(expected, MinimumMovesToCleanTheClassroom.minMoves(classroom, energy))
    }
}