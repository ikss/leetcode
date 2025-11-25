package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CombinationsTest {

    @Test
    fun test1recursive() {
        val n = 4
        val k = 2
        val expected = listOf(listOf(3, 4), listOf(2, 4), listOf(1, 4), listOf(2, 3), listOf(1, 3), listOf(1, 2))

        assertEquals(expected, Combinations.combineRecursive(n, k))
    }

    @Test
    fun test2recursive() {
        val n = 1
        val k = 1
        val expected = listOf(listOf(1))

        assertEquals(expected, Combinations.combineRecursive(n, k))
    }

    @Test
    fun test1backtrack() {
        val n = 4
        val k = 2
        val expected = listOf(listOf(1, 2), listOf(1, 3), listOf(1, 4), listOf(2, 3), listOf(2, 4), listOf(3, 4))

        assertEquals(expected, Combinations.combineBacktrack(n, k))
    }

    @Test
    fun test2backtrack() {
        val n = 1
        val k = 1
        val expected = listOf(listOf(1))

        assertEquals(expected, Combinations.combineBacktrack(n, k))
    }
}
