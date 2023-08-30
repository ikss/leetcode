package arrays.hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumReplacementsToSortArrayTest {

    @Test
    fun test1() {
        val input = intArrayOf(3, 9, 3)
        val expected = 2L

        assertEquals(expected, MinimumReplacementsToSortArray.minimumReplacement(input))
    }

    @Test
    fun test2() {
        val input = intArrayOf(1, 2, 3, 4, 5)
        val expected = 0L

        assertEquals(expected, MinimumReplacementsToSortArray.minimumReplacement(input))
    }
}