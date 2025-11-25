package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FindTheKthCharacterInStringGameIITest {
    @Test
    fun test1() {
        val k = 5L
        val operations = intArrayOf(0, 0, 0)
        val expected = 'a'

        assertEquals(expected, FindTheKthCharacterInStringGameII.kthCharacter(k, operations))
    }

    @Test
    fun test2() {
        val k = 10L
        val operations = intArrayOf(0, 1, 0, 1)
        val expected = 'b'

        assertEquals(expected, FindTheKthCharacterInStringGameII.kthCharacter(k, operations))
    }
}