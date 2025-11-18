package arrays.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class `1bitAnd2bitCharactersTest` {
    @Test
    fun test1() {
        val bits = intArrayOf(1, 0, 0)
        val expected = true

        assertEquals(expected, `1bitAnd2bitCharacters`.isOneBitCharacter(bits))
    }

    @Test
    fun test2() {
        val bits = intArrayOf(1, 1, 1, 0)
        val expected = false

        assertEquals(expected, `1bitAnd2bitCharacters`.isOneBitCharacter(bits))
    }
}