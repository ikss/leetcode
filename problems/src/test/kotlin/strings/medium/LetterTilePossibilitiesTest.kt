package strings.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LetterTilePossibilitiesTest {
    @Test
    fun test1() {
        val tiles = "AAB"
        val expected = 8

        assertEquals(expected, LetterTilePossibilities.numTilePossibilities(tiles))
    }
    
    @Test
    fun test2() {
        val tiles = "AAABBC"
        val expected = 188

        assertEquals(expected, LetterTilePossibilities.numTilePossibilities(tiles))
    }
    
    @Test
    fun test3() {
        val tiles = "V"
        val expected = 1

        assertEquals(expected, LetterTilePossibilities.numTilePossibilities(tiles))
    }
}