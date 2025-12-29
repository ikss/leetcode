package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class PyramidTransitionMatrixTest {
    @Test
    fun test1() {
        val bottom = "BCD"
        val allowed = listOf("BCC", "CDE", "CEA", "FFF")
        val expected = true

        assertEquals(expected, PyramidTransitionMatrix.pyramidTransition(bottom, allowed))
    }

    @Test
    fun test2() {
        val bottom = "AAAA"
        val allowed = listOf("AAB", "AAC", "BCD", "BBE", "DEF")
        val expected = false

        assertEquals(expected, PyramidTransitionMatrix.pyramidTransition(bottom, allowed))
    }

    @Test
    fun test3() {
        val bottom = "ABCD"
        val allowed = listOf("ABC", "BCA", "CDA", "ABD", "BCE", "CDF", "DEA", "EFF", "AFF")
        val expected = true

        assertEquals(expected, PyramidTransitionMatrix.pyramidTransition(bottom, allowed))
    }
}