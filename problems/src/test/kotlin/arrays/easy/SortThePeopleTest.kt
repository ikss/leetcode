package arrays.easy

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class SortThePeopleTest {
    @Test
    fun test1() {
        val names = arrayOf("Mary", "John", "Emma")
        val heights = intArrayOf(180, 165, 170)
        val expected = arrayOf("Mary", "Emma", "John")

        assertArrayEquals(expected, SortThePeople.sortPeople(names, heights))
    }

    @Test
    fun test2() {
        val names = arrayOf("Alice", "Bob", "Bob")
        val heights = intArrayOf(155, 185, 150)
        val expected = arrayOf("Bob", "Alice", "Bob")

        assertArrayEquals(expected, SortThePeople.sortPeople(names, heights))
    }
}