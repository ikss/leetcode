package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class UsingRobotToPrintTheLexicographicallySmallestStringTest {
    @Test
    fun test1() {
        val s = "zza"
        val expected = "azz"

        assertEquals(expected, UsingRobotToPrintTheLexicographicallySmallestString.robotWithString(s))
    }

    @Test
    fun test2() {
        val s = "bac"
        val expected = "abc"

        assertEquals(expected, UsingRobotToPrintTheLexicographicallySmallestString.robotWithString(s))
    }

    @Test
    fun test3() {
        val s = "bdda"
        val expected = "addb"

        assertEquals(expected, UsingRobotToPrintTheLexicographicallySmallestString.robotWithString(s))
    }
}