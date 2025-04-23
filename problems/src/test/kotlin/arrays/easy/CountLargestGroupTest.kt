package arrays.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CountLargestGroupTest {
    @Test
    fun test1() {
        val n = 13
        val expected = 4

        assertEquals(expected, CountLargestGroup.countLargestGroup(n))
    }

    @Test
    fun test2() {
        val n = 2
        val expected = 2

        assertEquals(expected, CountLargestGroup.countLargestGroup(n))
    }
}