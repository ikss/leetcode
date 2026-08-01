package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumTimeToBuildBlocksTest {
    @Test
    fun test1() {
        val blocks = intArrayOf(1)
        val split = 1
        val expected = 1

        assertEquals(expected, MinimumTimeToBuildBlocks.minBuildTime(blocks, split))
    }

    @Test
    fun test2() {
        val blocks = intArrayOf(1, 2)
        val split = 5
        val expected = 7

        assertEquals(expected, MinimumTimeToBuildBlocks.minBuildTime(blocks, split))
    }

    @Test
    fun test3() {
        val blocks = intArrayOf(1, 2, 3)
        val split = 1
        val expected = 4

        assertEquals(expected, MinimumTimeToBuildBlocks.minBuildTime(blocks, split))
    }
}