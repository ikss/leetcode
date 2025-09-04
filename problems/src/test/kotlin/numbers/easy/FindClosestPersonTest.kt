package numbers.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FindClosestPersonTest {
    @Test
    fun test1() {
        val x = 2
        val y = 7
        val z = 4
        val expected = 1

        assertEquals(expected, FindClosestPerson.findClosest(x, y, z))
    }

    @Test
    fun test2() {
        val x = 2
        val y = 5
        val z = 6
        val expected = 2

        assertEquals(expected, FindClosestPerson.findClosest(x, y, z))
    }

    @Test
    fun test3() {
        val x = 1
        val y = 5
        val z = 3
        val expected = 0

        assertEquals(expected, FindClosestPerson.findClosest(x, y, z))
    }
}