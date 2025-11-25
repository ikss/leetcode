package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CountTheNumberOfIdealArraysTest {
    @Test
    fun test1MemoryLimitExceeded() {
        val n = 2
        val maxValue = 5
        val expected = 10

        assertEquals(expected, CountTheNumberOfIdealArrays.idealArraysMemoryLimitExceeded(n, maxValue))
    }

    @Test
    fun test2MemoryLimitExceeded() {
        val n = 5
        val maxValue = 3
        val expected = 11

        assertEquals(expected, CountTheNumberOfIdealArrays.idealArraysMemoryLimitExceeded(n, maxValue))
    }
    
    @Test
    fun test1Combinatorics() {
        val n = 2
        val maxValue = 5
        val expected = 10

        assertEquals(expected, CountTheNumberOfIdealArrays.idealArraysCombinatorics(n, maxValue))
    }
    
    @Test
    fun test2Combinatorics() {
        val n = 5
        val maxValue = 3
        val expected = 11

        assertEquals(expected, CountTheNumberOfIdealArrays.idealArraysCombinatorics(n, maxValue))
    }
}