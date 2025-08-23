package strings.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class BeforeAndAfterPuzzleTest {

    @Test
    fun test1() {
        val phrases = arrayOf("writing code", "code rocks")
        val expected = listOf("writing code rocks")

        assertEquals(expected, BeforeAndAfterPuzzle.beforeAndAfterPuzzles(phrases))
    }

    @Test
    fun test2() {
        val phrases = arrayOf(
            "mission statement",
            "a quick bite to eat",
            "a chip off the old block",
            "chocolate bar",
            "mission impossible",
            "a man on a mission",
            "block party",
            "eat my words",
            "bar of soap",
        )
        val expected = listOf(
            "a chip off the old block party",
            "a man on a mission impossible",
            "a man on a mission statement",
            "a quick bite to eat my words",
            "chocolate bar of soap",
        )

        assertEquals(expected, BeforeAndAfterPuzzle.beforeAndAfterPuzzles(phrases))
    }
}