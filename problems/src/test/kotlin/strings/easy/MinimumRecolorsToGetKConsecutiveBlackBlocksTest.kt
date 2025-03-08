package strings.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumRecolorsToGetKConsecutiveBlackBlocksTest {
    @Test
    fun test1() {
        val blocks = "WBBWWBBWBW"
        val k = 7
        val expected = 3

        assertEquals(expected, MinimumRecolorsToGetKConsecutiveBlackBlocks.minimumRecolors(blocks, k))
    }

    @Test
    fun test2() {
        val blocks = "WBWBBBW"
        val k = 2
        val expected = 0

        assertEquals(expected, MinimumRecolorsToGetKConsecutiveBlackBlocks.minimumRecolors(blocks, k))
    }
}