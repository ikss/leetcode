package arrays.hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CountAllPossibleRoutesTest {

    @Test
    fun test1() {
        val locations = intArrayOf(2, 3, 6, 8, 4)
        val start = 1
        val finish = 3
        val fuel = 5
        val expected = 4

        assertEquals(expected, CountAllPossibleRoutes.countRoutes(locations, start, finish, fuel))
    }

    @Test
    fun test2() {
        val locations = intArrayOf(4, 3, 1)
        val start = 1
        val finish = 0
        val fuel = 6
        val expected = 5

        assertEquals(expected, CountAllPossibleRoutes.countRoutes(locations, start, finish, fuel))
    }

    @Test
    fun test3() {
        val locations = intArrayOf(5, 2, 1)
        val start = 0
        val finish = 2
        val fuel = 3
        val expected = 0

        assertEquals(expected, CountAllPossibleRoutes.countRoutes(locations, start, finish, fuel))
    }
}