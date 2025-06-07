package strings.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LexicographicallyMinimumStringAfterRemovingStarsTest {
    @Test
    fun test1() {
        val s = "aaba*"
        val expected = "aab"

        assertEquals(expected, LexicographicallyMinimumStringAfterRemovingStars.clearStars(s))
    }

    @Test
    fun test2() {
        val s = "abc"
        val expected = "abc"

        assertEquals(expected, LexicographicallyMinimumStringAfterRemovingStars.clearStars(s))
    }

    @Test
    fun test3() {
        val s = "a*q"
        val expected = "q"

        assertEquals(expected, LexicographicallyMinimumStringAfterRemovingStars.clearStars(s))
    }
}