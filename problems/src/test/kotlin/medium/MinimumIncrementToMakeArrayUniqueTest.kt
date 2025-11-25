package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumIncrementToMakeArrayUniqueTest {
    @Test
    fun test1TreeMap() {
        val input = intArrayOf(1, 2, 2)
        val output = 1
        assertEquals(output, MinimumIncrementToMakeArrayUnique.minIncrementForUniqueTreeMap(input))
    }

    @Test
    fun test2TreeMap() {
        val input = intArrayOf(3, 2, 1, 2, 1, 7)
        val output = 6
        assertEquals(output, MinimumIncrementToMakeArrayUnique.minIncrementForUniqueTreeMap(input))
    }

    @Test
    fun test1Counting() {
        val input = intArrayOf(1, 2, 2)
        val output = 1
        assertEquals(output, MinimumIncrementToMakeArrayUnique.minIncrementForUniqueCounting(input))
    }

    @Test
    fun test2Counting() {
        val input = intArrayOf(3, 2, 1, 2, 1, 7)
        val output = 6
        assertEquals(output, MinimumIncrementToMakeArrayUnique.minIncrementForUniqueCounting(input))
    }
}