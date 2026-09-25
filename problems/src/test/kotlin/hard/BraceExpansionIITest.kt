package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class BraceExpansionIITest {
    @Test
    fun test1() {
        val expression = "{a,b}{c,{d,e}}"
        val expected = listOf("ac", "ad", "ae", "bc", "bd", "be")

        assertEquals(expected, BraceExpansionII.braceExpansionII(expression))
    }
}