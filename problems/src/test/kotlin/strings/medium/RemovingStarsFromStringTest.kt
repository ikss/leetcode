package strings.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RemovingStarsFromStringTest {
    @Test
    fun test1() {
        val s = "leet**cod*e"
        val expected = "lecoe"

        assertEquals(expected, RemovingStarsFromString.removeStars(s))
    }

    @Test
    fun test2() {
        val s = "erase*****"
        val expected = ""

        assertEquals(expected, RemovingStarsFromString.removeStars(s))
    }
}