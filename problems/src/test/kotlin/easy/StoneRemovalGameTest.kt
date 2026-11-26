package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class StoneRemovalGameTest {
    @Test
    fun test1() {
        val n = 12
        val expected = true

        assertEquals(expected, StoneRemovalGame.canAliceWin(n))
    }

    @Test
    fun test2() {
        val n = 1
        val expected = false

        assertEquals(expected, StoneRemovalGame.canAliceWin(n))
    }
}