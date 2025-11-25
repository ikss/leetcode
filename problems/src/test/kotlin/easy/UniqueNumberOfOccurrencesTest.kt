package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class UniqueNumberOfOccurrencesTest {
    @Test
    fun test1() {
        val arr = intArrayOf(1, 2, 2, 1, 1, 3)
        val expected = true

        assertEquals(expected, UniqueNumberOfOccurrences.uniqueOccurrences(arr))
    }

    @Test
    fun test2() {
        val arr = intArrayOf(1, 2)
        val expected = false

        assertEquals(expected, UniqueNumberOfOccurrences.uniqueOccurrences(arr))
    }

    @Test
    fun test3() {
        val arr = intArrayOf(-3, 0, 1, -3, 1, 1, 1, -3, 10, 0)
        val expected = true

        assertEquals(expected, UniqueNumberOfOccurrences.uniqueOccurrences(arr))
    }
}