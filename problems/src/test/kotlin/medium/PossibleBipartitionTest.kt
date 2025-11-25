package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class PossibleBipartitionTest {

    @Test
    fun test1() {
        val n = 4
        val dislikes = arrayOf(intArrayOf(1, 2), intArrayOf(1, 3), intArrayOf(2, 4))
        val expected = true

        assertEquals(expected, PossibleBipartition.possibleBipartition(n, dislikes))
    }

    @Test
    fun test2() {
        val n = 3
        val dislikes = arrayOf(intArrayOf(1, 2), intArrayOf(1, 3), intArrayOf(2, 3))
        val expected = false

        assertEquals(expected, PossibleBipartition.possibleBipartition(n, dislikes))
    }

    @Test
    fun test3() {
        val n = 5
        val dislikes = arrayOf(intArrayOf(1, 2), intArrayOf(2, 3), intArrayOf(3, 4), intArrayOf(4, 5), intArrayOf(1, 5))
        val expected = false

        assertEquals(expected, PossibleBipartition.possibleBipartition(n, dislikes))
    }
}