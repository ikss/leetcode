package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FrogJumpTest {
    @Test
    fun test1() {
        val stones = intArrayOf(0, 1, 3, 5, 6, 8, 12, 17)
        val expected = true

        assertEquals(expected, FrogJump.canCross(stones))
    }

    @Test
    fun test2() {
        val stones = intArrayOf(0, 1, 2, 3, 4, 8, 9, 11)
        val expected = false

        assertEquals(expected, FrogJump.canCross(stones))
    }
}