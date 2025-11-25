package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LongestPathWithDifferentAdjacentCharactersTest {

    @Test
    fun test1() {
        val parent = intArrayOf(-1, 0, 0, 1, 1, 2)
        val s = "abacbe"
        val expected = 3

        assertEquals(expected, LongestPathWithDifferentAdjacentCharacters.longestPath(parent, s))
    }

    @Test
    fun test2() {
        val parent = intArrayOf(-1, 0, 0, 0)
        val s = "aabc"
        val expected = 3

        assertEquals(expected, LongestPathWithDifferentAdjacentCharacters.longestPath(parent, s))
    }

    @Test
    fun test3() {
        val parent = intArrayOf(-1, 0, 1)
        val s = "aab"
        val expected = 2

        assertEquals(expected, LongestPathWithDifferentAdjacentCharacters.longestPath(parent, s))
    }
}