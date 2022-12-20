package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class KeysAndRoomsTest {

    @Test
    fun test1() {
        val rooms = listOf(listOf(1), listOf(2), listOf(3), emptyList())
        val expected = true

        assertEquals(expected, KeysAndRooms.canVisitAllRooms(rooms))
    }

    @Test
    fun test2() {
        val rooms = listOf(listOf(1, 3), listOf(3, 0, 1), listOf(2), listOf(0))
        val expected = false

        assertEquals(expected, KeysAndRooms.canVisitAllRooms(rooms))
    }
}