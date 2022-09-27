package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class PushDominoesTest {
    @Test
    fun test1() {
        val dominoes = "RR.L"
        val expected = "RR.L"

        assertEquals(expected, PushDominoes.pushDominoes(dominoes))
    }

    @Test
    fun test2() {
        val dominoes = ".L.R...LR..L.."
        val expected = "LL.RR.LLRRLL.."

        assertEquals(expected, PushDominoes.pushDominoes(dominoes))
    }
}