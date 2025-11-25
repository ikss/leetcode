package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DominoAndTrominoTilingTest {
    @Test
    fun test1() {
        val n = 3
        val expected = 5

        assertEquals(expected, DominoAndTrominoTiling.numTilings(n))
    }

    @Test
    fun test2() {
        val n = 1
        val expected = 1

        assertEquals(expected, DominoAndTrominoTiling.numTilings(n))
    }

    @Test
    fun test1dp() {
        val n = 3
        val expected = 5

        assertEquals(expected, DominoAndTrominoTiling.numTilingsDp(n))
    }

    @Test
    fun test2dp() {
        val n = 1
        val expected = 1

        assertEquals(expected, DominoAndTrominoTiling.numTilingsDp(n))
    }
}