package strings.hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FreedomTrailTest {
    @Test
    fun test1topDownDp() {
        val ring = "godding"
        val key = "gd"
        val expected = 4

        assertEquals(expected, FreedomTrail.findRotateStepsTopDownDp(ring, key))
    }

    @Test
    fun test2topDownDp() {
        val ring = "godding"
        val key = "godding"
        val expected = 13

        assertEquals(expected, FreedomTrail.findRotateStepsTopDownDp(ring, key))
    }
}