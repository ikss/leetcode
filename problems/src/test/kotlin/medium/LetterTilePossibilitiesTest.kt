package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LetterTilePossibilitiesTest {
    @Test
    fun test1Combinatorics() {
        val tiles = "AAB"
        val expected = 8

        assertEquals(expected, LetterTilePossibilities.numTilePossibilitiesCombinatorics(tiles))
    }

    @Test
    fun test2Combinatorics() {
        val tiles = "AAABBC"
        val expected = 188

        assertEquals(expected, LetterTilePossibilities.numTilePossibilitiesCombinatorics(tiles))
    }

    @Test
    fun test3Combinatorics() {
        val tiles = "V"
        val expected = 1

        assertEquals(expected, LetterTilePossibilities.numTilePossibilitiesCombinatorics(tiles))
    }

    @Test
    fun test1Dfs() {
        val tiles = "AAB"
        val expected = 8

        assertEquals(expected, LetterTilePossibilities.numTilePossibilitiesDfs(tiles))
    }

    @Test
    fun test2Dfs() {
        val tiles = "AAABBC"
        val expected = 188

        assertEquals(expected, LetterTilePossibilities.numTilePossibilitiesDfs(tiles))
    }

    @Test
    fun test3Dfs() {
        val tiles = "V"
        val expected = 1

        assertEquals(expected, LetterTilePossibilities.numTilePossibilitiesDfs(tiles))
    }
}